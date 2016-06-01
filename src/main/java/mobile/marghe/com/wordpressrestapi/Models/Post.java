package mobile.marghe.com.wordpressrestapi.Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by romain on 30/05/2016.
 */
public class Post {
    private int id;
    private String date;
    private String date_gmt;
    private String guid;
    private String modified;
    private String modified_gmt;
    private String slug;
    private String type;
    private String link;
    private String title;
    private String content;
    private String excerpt;
    private int author;
    private int featured_media;
    private String comment_status;
    private String ping_status;
    private Boolean sticky;
    private String format;
    private int[] categories;
    private String[] tags;
    private Links _links;

   public Post(JSONObject jsonObject) throws JSONException {
       id = jsonObject.getInt("id");
       date = jsonObject.getString("date");
       date_gmt = jsonObject.getString("date_gmt");
       guid = jsonObject.getJSONObject("guid").getString("rendered");
       modified = jsonObject.getString("modified");
       modified_gmt = jsonObject.getString("modified_gmt");
       slug = jsonObject.getString("slug");
       type = jsonObject.getString("type");
       link = jsonObject.getString("link");
       title = jsonObject.getJSONObject("title").getString("rendered");
       content = jsonObject.getJSONObject("content").getString("rendered");
       excerpt = jsonObject.getJSONObject("excerpt").getString("rendered");
       author = jsonObject.getInt("author");
       featured_media = jsonObject.getInt("featured_media");
       comment_status = jsonObject.getString("comment_status");
       ping_status = jsonObject.getString("ping_status");
       sticky = jsonObject.getBoolean("sticky");
       format = jsonObject.getString("format");

       JSONArray categoriesArray = jsonObject.getJSONArray("categories");
       categories = new int[categoriesArray.length()];
       for (int i = 0; i < categoriesArray.length(); i++) {
           categories[i] = (int) categoriesArray.get(i);
       }

       JSONArray tagsArray = jsonObject.getJSONArray("tags");
       tags = new String[tagsArray.length()];
       for (int i = 0; i < tagsArray.length(); i++) {
           tags[i] = (String) categoriesArray.get(i);
       }

       _links = new Links(jsonObject.getJSONObject("_links"));
   }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getDate_gmt() {
        return date_gmt;
    }

    public String getGuid() {
        return guid;
    }

    public String getModified() {
        return modified;
    }

    public String getModified_gmt() {
        return modified_gmt;
    }

    public String getSlug() {
        return slug;
    }

    public String getType() {
        return type;
    }

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public int getAuthor() {
        return author;
    }

    public int getFeatured_media() {
        return featured_media;
    }

    public String getComment_status() {
        return comment_status;
    }

    public String getPing_status() {
        return ping_status;
    }

    public Boolean getSticky() {
        return sticky;
    }

    public String getFormat() {
        return format;
    }

    public int[] getCategories() {
        return categories;
    }

    public String[] getTags() {
        return tags;
    }

    public Links get_links() {
        return _links;
    }
}
