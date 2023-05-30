//10120097 - Raka Fadlilah - IF3

package com.example.tugas_uts_akb_10120097;

import android.database.Cursor;

import com.example.tugas_uts_akb_10120097.model.note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(note note);
    public boolean update(note note);
    public boolean delete(String id);

}
