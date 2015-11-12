
package com.jamqer.imagepool.imageviewer.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Images{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("pageURL")
    @Expose
    private String pageURL;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("previewURL")
    @Expose
    private String previewURL;
    @SerializedName("previewWidth")
    @Expose
    private int previewWidth;
    @SerializedName("previewHeight")
    @Expose
    private int previewHeight;
    @SerializedName("webformatURL")
    @Expose
    private String webformatURL;
    @SerializedName("webformatWidth")
    @Expose
    private int webformatWidth;
    @SerializedName("webformatHeight")
    @Expose
    private int webformatHeight;
    @SerializedName("imageWidth")
    @Expose
    private int imageWidth;
    @SerializedName("imageHeight")
    @Expose
    private int imageHeight;
    @SerializedName("views")
    @Expose
    private int views;
    @SerializedName("downloads")
    @Expose
    private int downloads;
    @SerializedName("likes")
    @Expose
    private int likes;
    @SerializedName("comments")
    @Expose
    private int comments;
    @SerializedName("user")
    @Expose
    private String user;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The pageURL
     */
    public String getPageURL() {
        return pageURL;
    }

    /**
     * 
     * @param pageURL
     *     The pageURL
     */
    public void setPageURL(String pageURL) {
        this.pageURL = pageURL;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public String getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The previewURL
     */
    public String getPreviewURL() {
        return previewURL;
    }

    /**
     * 
     * @param previewURL
     *     The previewURL
     */
    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    /**
     * 
     * @return
     *     The previewWidth
     */
    public int getPreviewWidth() {
        return previewWidth;
    }

    /**
     * 
     * @param previewWidth
     *     The previewWidth
     */
    public void setPreviewWidth(int previewWidth) {
        this.previewWidth = previewWidth;
    }

    /**
     * 
     * @return
     *     The previewHeight
     */
    public int getPreviewHeight() {
        return previewHeight;
    }

    /**
     * 
     * @param previewHeight
     *     The previewHeight
     */
    public void setPreviewHeight(int previewHeight) {
        this.previewHeight = previewHeight;
    }

    /**
     * 
     * @return
     *     The webformatURL
     */
    public String getWebformatURL() {
        return webformatURL;
    }

    /**
     * 
     * @param webformatURL
     *     The webformatURL
     */
    public void setWebformatURL(String webformatURL) {
        this.webformatURL = webformatURL;
    }

    /**
     * 
     * @return
     *     The webformatWidth
     */
    public int getWebformatWidth() {
        return webformatWidth;
    }

    /**
     * 
     * @param webformatWidth
     *     The webformatWidth
     */
    public void setWebformatWidth(int webformatWidth) {
        this.webformatWidth = webformatWidth;
    }

    /**
     * 
     * @return
     *     The webformatHeight
     */
    public int getWebformatHeight() {
        return webformatHeight;
    }

    /**
     * 
     * @param webformatHeight
     *     The webformatHeight
     */
    public void setWebformatHeight(int webformatHeight) {
        this.webformatHeight = webformatHeight;
    }

    /**
     * 
     * @return
     *     The imageWidth
     */
    public int getImageWidth() {
        return imageWidth;
    }

    /**
     * 
     * @param imageWidth
     *     The imageWidth
     */
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     * 
     * @return
     *     The imageHeight
     */
    public int getImageHeight() {
        return imageHeight;
    }

    /**
     * 
     * @param imageHeight
     *     The imageHeight
     */
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     * 
     * @return
     *     The views
     */
    public int getViews() {
        return views;
    }

    /**
     * 
     * @param views
     *     The views
     */
    public void setViews(int views) {
        this.views = views;
    }

    /**
     * 
     * @return
     *     The downloads
     */
    public int getDownloads() {
        return downloads;
    }

    /**
     * 
     * @param downloads
     *     The downloads
     */
    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    /**
     * 
     * @return
     *     The likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * 
     * @param likes
     *     The likes
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }

    /**
     * 
     * @return
     *     The comments
     */
    public int getComments() {
        return comments;
    }

    /**
     * 
     * @param comments
     *     The comments
     */
    public void setComments(int comments) {
        this.comments = comments;
    }

    /**
     * 
     * @return
     *     The user
     */
    public String getUser() {
        return user;
    }

    /**
     * 
     * @param user
     *     The user
     */
    public void setUser(String user) {
        this.user = user;
    }

}
