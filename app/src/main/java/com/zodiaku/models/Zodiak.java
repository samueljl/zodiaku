package com.zodiaku.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Zodiak {

    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("lahir")
    @Expose
    private String lahir;
    @SerializedName("usia")
    @Expose
    private String usia;
    @SerializedName("zodiak")
    @Expose
    private String zodiak;
    @SerializedName("ramalan")
    @Expose
    private Ramalan ramalan;

    /**
     * No args constructor for use in serialization
     *
     */
    public Zodiak() {
    }

    /**
     *
     * @param usia
     * @param ramalan
     * @param lahir
     * @param nama
     * @param zodiak
     */
    public Zodiak(String nama, String lahir, String usia, String zodiak, Ramalan ramalan) {
        super();
        this.nama = nama;
        this.lahir = lahir;
        this.usia = usia;
        this.zodiak = zodiak;
        this.ramalan = ramalan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Zodiak withNama(String nama) {
        this.nama = nama;
        return this;
    }

    public String getLahir() {
        return lahir;
    }

    public void setLahir(String lahir) {
        this.lahir = lahir;
    }

    public Zodiak withLahir(String lahir) {
        this.lahir = lahir;
        return this;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public Zodiak withUsia(String usia) {
        this.usia = usia;
        return this;
    }

    public String getZodiak() {
        return zodiak;
    }

    public void setZodiak(String zodiak) {
        this.zodiak = zodiak;
    }

    public Zodiak withZodiak(String zodiak) {
        this.zodiak = zodiak;
        return this;
    }

    public Ramalan getRamalan() {
        return ramalan;
    }

    public void setRamalan(Ramalan ramalan) {
        this.ramalan = ramalan;
    }

    public Zodiak withRamalan(Ramalan ramalan) {
        this.ramalan = ramalan;
        return this;
    }

}