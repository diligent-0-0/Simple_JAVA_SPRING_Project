package com.example.demo.repositories;

import com.example.demo.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<Note, String> {


}
