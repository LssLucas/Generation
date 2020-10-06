package org.MinhaEscola.escolastica.repository;

import java.util.List;

import org.MinhaEscola.escolastica.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	public List<Aluno> findAllByNomeContainingIgnoreCase (String nome);
}
