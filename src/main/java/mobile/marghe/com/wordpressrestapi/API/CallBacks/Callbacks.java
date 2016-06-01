package mobile.marghe.com.wordpressrestapi.API.CallBacks;

import java.util.List;

import mobile.marghe.com.wordpressrestapi.Models.Collection.ModelCollection;

/**
 * Created by romain on 31/05/2016.
 */
public interface Callbacks<T extends ModelCollection> {
    void OnRequestSuccess(List<T> listOfModel);
    void OnRequestFail(String error);
}
