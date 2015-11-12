
package com.jamqer.imagepool.imageviewer.Model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ImagesResponse {

    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("totalHits")
    @Expose
    private int totalHits;
    @SerializedName("hits")
    @Expose
    private List<Images> hits = new ArrayList<Images>();

    /**
     * 
     * @return
     *     The total
     */
    public int getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The totalHits
     */
    public int getTotalHits() {
        return totalHits;
    }

    /**
     * 
     * @param totalHits
     *     The totalHits
     */
    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    /**
     * 
     * @return
     *     The hits
     */
    public List<Images> getHits() {
        return hits;
    }

    /**
     * 
     * @param hits
     *     The hits
     */
    public void setHits(List<Images> hits) {
        this.hits = hits;
    }

}
