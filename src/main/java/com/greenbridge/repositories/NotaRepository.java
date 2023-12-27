package com.greenbridge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.greenbridge.entities.Nota;
import java.util.List;

public interface NotaRepository extends JpaRepository<Nota, Long> {

    List<Nota> findByOrderByIdDesc();
    List<Nota> findByTitolo(String titolo);

}