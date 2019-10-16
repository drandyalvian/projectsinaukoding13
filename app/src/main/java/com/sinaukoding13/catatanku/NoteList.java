package com.sinaukoding13.catatanku;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NoteList {

    @SerializedName("note")
    @Expose
    private List<Note> note = null;

    public ArrayList<Note> getNote() {
        return (ArrayList<Note>) note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }

}