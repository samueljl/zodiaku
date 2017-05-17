package com.zodiaku.models;

/**
 * Created by Samuel JL on 16-Mar-17.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Percintaan_ {

    @SerializedName("single")
    @Expose
    private String single;
    @SerializedName("couple")
    @Expose
    private String couple;

    /**
     * No args constructor for use in serialization
     *
     */
    public Percintaan_() {
    }

    /**
     *
     * @param single
     * @param couple
     */
    public Percintaan_(String single, String couple) {
        super();
        this.single = single;
        this.couple = couple;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public Percintaan_ withSingle(String single) {
        this.single = single;
        return this;
    }

    public String getCouple() {
        return couple;
    }

    public void setCouple(String couple) {
        this.couple = couple;
    }

    public Percintaan_ withCouple(String couple) {
        this.couple = couple;
        return this;
    }

}
