package com.sinaukoding13.catatanku;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("dbsinaukoding13/db")
    Call<NoteList> getMyJSON();
}
