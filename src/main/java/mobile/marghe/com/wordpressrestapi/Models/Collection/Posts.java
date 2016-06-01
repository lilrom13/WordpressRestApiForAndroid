package mobile.marghe.com.wordpressrestapi.Models.Collection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import mobile.marghe.com.wordpressrestapi.Models.Post;

/**
 * Created by romain on 30/05/2016.
 */
public class Posts extends ModelCollection {
    List<Post> postList;

    @Override
    public Void fromJson(String json) throws JSONException {
        postList = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(json);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            postList.add(new Post(jsonObject));
        }
        return null;
    }

    @Override
    public List getList() {
        return postList;
    }
}
