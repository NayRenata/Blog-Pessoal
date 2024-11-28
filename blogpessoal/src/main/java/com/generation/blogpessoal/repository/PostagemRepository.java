package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.blogpessoal.model.Postagem;
import java.util.List;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

    List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
}
