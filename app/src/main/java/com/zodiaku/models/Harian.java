package com.zodiaku.models;

/**
 * Created by Samuel JL on 16-Mar-17.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Harian {

    @SerializedName("umum")
    @Expose
    private String umum;
    @SerializedName("percintaan")
    @Expose
    private Percintaan percintaan;
    @SerializedName("karir_keuangan")
    @Expose
    private String karirKeuangan;

    /**
     * No args constructor for use in serialization
     *
     */
    public Harian() {
    }

    /**
     *
     * @param umum
     * @param karirKeuangan
     * @param percintaan
     */
    public Harian(String umum, Percintaan percintaan, String karirKeuangan) {
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

    public Harian withUmum(String umum) {
        this.umum = umum;
        return this;
    }

    public Percintaan getPercintaan() {
        return percintaan;
    }

    public void setPercintaan(Percintaan percintaan) {
        this.percintaan = percintaan;
    }

    public Harian withPercintaan(Percintaan percintaan) {
        this.percintaan = percintaan;
        return this;
    }

    public String getKarirKeuangan() {
        return karirKeuangan;
    }

    public void setKarirKeuangan(String karirKeuangan) {
        this.karirKeuangan = karirKeuangan;
    }

    public Harian withKarirKeuangan(String karirKeuangan) {
        this.karirKeuangan = karirKeuangan;
        return this;
    }

}