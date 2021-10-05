package com.dancesar.testespring.repository;

import com.dancesar.testespring.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query(value = "from Endereco where cnpj =:cnpj")
    Optional<Endereco> findByCnpj(@Param("cnpj") String cnpj);
}
