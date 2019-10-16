package com.sinaukoding13.catatanku;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.CustomViewHolder> {

    Context context;
    ArrayList<Note> notes;
    public NoteAdapter(Context c, ArrayList<Note> p){
        context = c;
        notes = p;
    }
//    private List<Note> notes;

    public NoteAdapter(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.note_list, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.judul.setText(note.getJudul());
        holder.tanggal.setText(note.getTanggal());

        final String getkey = notes.get(position).getJudul();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent go = new Intent(context, Main2Activity.class);
////                go.putExtra("key",getkey);
//                context.startActivity(go);


            }
        });
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView judul, tanggal;

        public CustomViewHolder(View view) {
            super(view);
            judul = (TextView) view.findViewById(R.id.judul);
            tanggal = (TextView) view.findViewById(R.id.tanggal);
        }
    }
}
