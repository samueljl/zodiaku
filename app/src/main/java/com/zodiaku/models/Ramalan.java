package com.zodiaku.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by rama on 10/9/16.
 */

public class Ramalan {

    @SerializedName("harian")
    @Expose
    private Harian harian;
    @SerializedName("mingguan")
    @Expose
    private Mingguan mingguan;

    /**
     * No args constructor for use in serialization
     *
     */
    public Ramalan() {
    }

    /**
     *
     * @param mingguan
     * @param harian
     */
    public Ramalan(Harian harian, Mingguan mingguan) {
        super();
        this.harian = harian;
        this.mingguan = mingguan;
    }

    public Harian getHarian() {
        return harian;
    }

    public void setHarian(Harian harian) {
        this.harian = harian;
    }

    public Ramalan withHarian(Harian harian) {
        this.harian = harian;
        return this;
    }

    public Mingguan getMingguan() {
        return mingguan;
    }

    public void setMingguan(Mingguan mingguan) {
        this.mingguan = mingguan;
    }

    public Ramalan withMingguan(Mingguan mingguan) {
        this.mingguan = mingguan;
        return this;
    }

}