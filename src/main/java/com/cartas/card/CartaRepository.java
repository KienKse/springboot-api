package com.cartas.card;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartas.card.Carta;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaRepository extends JpaRepository<Carta, Long> {

}
