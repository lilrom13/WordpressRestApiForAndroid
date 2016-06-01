package mobile.marghe.com.wordpressrestapi;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import mobile.marghe.com.wordpressrestapi.API.CallBacks.Callbacks;
import mobile.marghe.com.wordpressrestapi.API.Requests.GetModelRequest;
import mobile.marghe.com.wordpressrestapi.Models.Collection.ModelCollection;

/**
 * Created by romain on 30/05/2016.
 */
public class WordpressRestApi<T extends ModelCollection> {
    protected Context mContext;
    protected String mDomain;

    private PostsManager mPostManager;

    public WordpressRestApi(Context context, String domain) {
        mDomain = domain;
        mContext = context;
    }

    public PostsManager getPostManager() {
        if (mPostManager == null) {
            mPostManager = new PostsManager(this);
        }
        return mPostManager;
    }

    protected void GetRequest(final String url, final T model, final Callbacks callbacks) {
        GetModelRequest postsRequest = new GetModelRequest(model, url, null, new Response.Listener<T>() {
            @Override
            public void onResponse(T response) {
                callbacks.OnRequestSuccess(response.getList());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callbacks.OnRequestFail(error.getMessage());
            }
        });
        Singleton.getInstance(mContext).addToRequestQueue(postsRequest);
    }
}
