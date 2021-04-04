package com.example.blocknot.data;

public interface NotesSourceInterface {
    NotesSourceInterface init(NoteSourceResponse noteSourceResponse);
    Note getNote(int position);
    int size();
    void deleteNote(int position);
    void changeNote(int position, Note note);
    void addNote(Note note);
}
