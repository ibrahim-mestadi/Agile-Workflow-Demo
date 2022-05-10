package com.api.backend.repositories;

import com.api.backend.entities.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {

  List<Program> findByAdmin(long admin);
}