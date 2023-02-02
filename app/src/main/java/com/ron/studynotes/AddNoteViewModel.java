package com.ron.studynotes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.ron.studynotes.databases.AppDatabase;
import com.ron.studynotes.databases.NotesEntry;

public class AddNoteViewModel extends ViewModel {

    private LiveData<NotesEntry> note;

    public AddNoteViewModel(AppDatabase db, int noteId) {
        note = db.notesDao().loadTaskById(noteId);
    }
    public LiveData<NotesEntry> getNote() {
        return note;
    }
}
