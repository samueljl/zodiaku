package com.zodiaku.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Percintaan {

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
    public Percintaan() {
    }

    /**
     *
     * @param single
     * @param couple
     */
    public Percintaan(String single, String couple) {
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

    public Percintaan withSingle(String single) {
        this.single = single;
        return this;
    }

    public String getCouple() {
        return couple;
    }

    public void setCouple(String couple) {
        this.couple = couple;
    }

    public Percintaan withCouple(String couple) {
        this.couple = couple;
        return this;
    }

}