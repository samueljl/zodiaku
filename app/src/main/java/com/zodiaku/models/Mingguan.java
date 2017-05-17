package com.zodiaku.models;

/**
 * Created by Samuel JL on 16-Mar-17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mingguan {

    @SerializedName("umum")
    @Expose
    private String umum;
    @SerializedName("percintaan")
    @Expose
    private Percintaan_ percintaan;
    @SerializedName("karir_keuangan")
    @Expose
    private String karirKeuangan;

    /**
     * No args constructor for use in serialization
     *
     */
    public Mingguan() {
    }

    /**
     *
     * @param umum
     * @param karirKeuangan
     * @param percintaan
     */
    public Mingguan(String umum, Percintaan_ percintaan, String karirKeuangan) {
        super();
        this.umum = umum;
        this.percintaan = percintaan;
        this.karirKeuangan = karirKeuangan;
    }

    public String getUmum() {
        return umum;
    }

    public void setUmum(String umum) {
        this.umum = umum;
    }

    public Mingguan withUmum(String umum) {
        this.umum = umum;
        return this;
    }

    public Percintaan_ getPercintaan() {
        return percintaan;
    }

    public void setPercintaan(Percintaan_ percintaan) {
        this.percintaan = percintaan;
    }

    public Mingguan withPercintaan(Percintaan_ percintaan) {
        this.percintaan = percintaan;
        return this;
    }

    public String getKarirKeuangan() {
        return karirKeuangan;
    }

    public void setKarirKeuangan(String karirKeuangan) {
        this.karirKeuangan = karirKeuangan;
    }

    public Mingguan withKarirKeuangan(String karirKeuangan) {
        this.karirKeuangan = karirKeuangan;
        return this;
    }

}
