package br.com.ks.repository;

import  br.com.ks.model.Carta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CartaRepository extends JpaRepository<Carta, Long> {

    @Query("select id from Carta c where c.dataInicio between :dataStart and :dataEnd")
    List<Long> findByInterval(@Param("dataStart") LocalDate dataStart, @Param("dataEnd") LocalDate dataEnd);

}
