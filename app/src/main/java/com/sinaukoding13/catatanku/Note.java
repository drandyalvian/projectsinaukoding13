package com.sinaukoding13.catatanku;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Note {

    @SerializedName("note_id")
    @Expose
    private Integer noteId;
    @SerializedName("judul")
    @Expose
    private String judul;
    @SerializedName("tanggal")
    @Expose
    private String tanggal;
    @SerializedName("isi")
    @Expose
    private String isi;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

}

