package com.crok.backend;
import com.crok.backend.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeDao extends JpaRepository<Filme, Integer> {

}
