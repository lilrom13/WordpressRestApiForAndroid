package mobile.marghe.com.wordpressrestapi;

import mobile.marghe.com.wordpressrestapi.API.CallBacks.Callbacks;
import mobile.marghe.com.wordpressrestapi.Models.Collection.ModelCollection;
import mobile.marghe.com.wordpressrestapi.Models.Collection.Posts;

/**
 * Created by romain on 31/05/2016.
 */
public class PostsManager {
    private ModelCollection model;
    private String GET_POST_URL;
    private WordpressRestApi mApi;

    protected PostsManager(WordpressRestApi api) {
        model = new Posts();
        GET_POST_URL = api.mDomain+"/posts";
        mApi = api;
    }

    public void getPosts(final Callbacks callBacks) {
        mApi.GetRequest(GET_POST_URL, model, callBacks);
    }


}
