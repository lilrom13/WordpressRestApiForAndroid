package mobile.marghe.com.wordpressrestapi.Models.Collection;

import org.json.JSONException;

import java.util.List;

/**
 * Created by romain on 31/05/2016.
 */
public abstract class ModelCollection<T> {

    public abstract Void fromJson(String json) throws JSONException;
    public abstract List<T> getList();
}
