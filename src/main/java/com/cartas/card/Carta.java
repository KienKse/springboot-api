package com.cartas.card;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "carta")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Carta implements Serializable {

//    public Carta(@NotBlank String nome_carta, @NotBlank String efeito_carta, @NotBlank Integer qtd_merits_carta, @NotBlank String tipo_carta, @NotBlank String range_carta, @NotBlank Integer duracao_efeito_carta) {
//        this.nome_carta = nome_carta;
//        this.efeito_carta = efeito_carta;
//        this.qtd_merits_carta = qtd_merits_carta;
//        this.tipo_carta = tipo_carta;
//        this.range_carta = range_carta;
//        this.duracao_efeito_carta = duracao_efeito_carta;
//    }

//    public Carta () {
//        super();
//    }

    /**
     * Ícaro Santana
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @NotBlank
    private String nome_carta;

    @NotBlank
    private String efeito_carta;

    @NotBlank
    private Integer qtd_merits_carta;

    @NotBlank
    private String tipo_carta;

    @NotBlank
    private String range_carta;

    @NotBlank
    private Integer duracao_efeito_carta;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_carta() {
        return nome_carta;
    }

    public void setNome_carta(String nome_carta) {
        this.nome_carta = nome_carta;
    }

    public String getEfeito_carta() {
        return efeito_carta;
    }

    public void setEfeito_carta(String efeito_carta) {
        this.efeito_carta = efeito_carta;
    }

    public Integer getQtd_merits_carta() {
        return qtd_merits_carta;
    }

    public void setQtd_merits_carta(Integer qtd_merits_carta) {
        this.qtd_merits_carta = qtd_merits_carta;
    }

    public String getTipo_carta() {
        return tipo_carta;
    }

    public void setTipo_carta(String tipo_carta) {
        this.tipo_carta = tipo_carta;
    }

    public String getRange_carta() {
        return range_carta;
    }

    public void setRange_carta(String range_carta) {
        this.range_carta = range_carta;
    }

    public Integer getDuracao_efeito_carta() {
        return duracao_efeito_carta;
    }

    public void setDuracao_efeito_carta(Integer duracao_efeito_carta) {
        this.duracao_efeito_carta = duracao_efeito_carta;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}