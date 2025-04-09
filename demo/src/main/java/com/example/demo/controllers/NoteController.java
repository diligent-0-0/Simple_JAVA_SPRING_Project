package com.example.demo.controllers;

import com.example.demo.entities.Note;
import com.example.demo.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    // create
    @PostMapping
    public ResponseEntity<Note> create(@RequestBody Note note)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(noteService.createNote(note));
    }

    // get
    @GetMapping
    public ResponseEntity<List<Note>> getAll(){
        return ResponseEntity.ok(noteService.getAll());
    }

    @GetMapping("/{noteId}")
    public ResponseEntity<Note> getSingle(@PathVariable String noteId){
        return ResponseEntity.ok(noteService.getNoteById(noteId));
    }

    @DeleteMapping("/{noteId}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable String noteId)
    {
        noteService.deleteNote(noteId);
    }

}
