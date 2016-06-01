package mobile.marghe.com.wordpressrestapi.Models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by romain on 31/05/2016.
 */
public class Links {
    private String self;
    private String collection;
    private String about;
    private String author;
    private String replies;
    private String version_history;
    private String wp_featuredmedia;
    private String wp_attachment;

    public Links(JSONObject jsonObject) throws JSONException {
        self = jsonObject.getJSONArray("self").getString(0);
        collection = jsonObject.getJSONArray("collection").getString(0);
        about = jsonObject.getJSONArray("about").getString(0);
        author = jsonObject.getJSONArray("author").getString(0);
        replies = jsonObject.getJSONArray("replies").getString(0);
        version_history = jsonObject.getJSONArray("version_history").getString(0);

        wp_featuredmedia = jsonObject.getJSONArray("wp_featuredmedia").getString(0);
        wp_attachment = jsonObject.getJSONArray("wp_attachment").getString(0);
    }
}
