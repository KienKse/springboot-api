package  br.com.ks.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "carta")
@EntityListeners(AuditingEntityListener.class)
public class Carta implements Serializable {
    /**
     * Ícaro Santana
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "efeito", nullable = false)
    private String efeito;

    @Column(name = "merits", nullable = false)
    private Integer merits;

    @Column(name = "tipo", nullable = false)
    private Integer tipo;

    @Column(name = "grupo", nullable = false)
    private boolean grupo;

    @Column(name = "duracao_efeito", nullable = false)
    private Integer duracaoEfeito;

    @Column(name = "data_inicio", nullable = false, columnDefinition = "DATE")
    private LocalDate dataInicio;

    @Column(name = "data_fim", columnDefinition = "DATE",updatable = false)
    private LocalDate dataFim;

    public Carta() {}

    public Carta(Carta request) {
        this.nome = request.nome;
        this.efeito = request.efeito;
        this.merits = request.merits;
        this.tipo = request.tipo;
        this.grupo = request.grupo;
        this.duracaoEfeito = request.duracaoEfeito;

        this.dataInicio = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEfeito() {
        return efeito;
    }

    public Integer getMerits() {
        return merits;
    }

    public Integer getTipo() {
        return tipo;
    }

    public boolean isGrupo() {
        return grupo;
    }

    public Integer getDuracaoEfeito() {
        return duracaoEfeito;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setId(Long id) {
        this.id = id;
    }
}