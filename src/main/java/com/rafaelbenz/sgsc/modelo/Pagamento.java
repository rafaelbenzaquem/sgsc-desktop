package com.rafaelbenz.sgsc.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.rafaelbenz.sgsc.modelo.enums.EstadoPagamento;

import java.io.Serializable;
import java.util.Objects;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer estado;

    @JsonIgnore
    private Contrato contrato;

    public Pagamento() {
    }

    public Pagamento(Integer id, EstadoPagamento estado, Contrato contrato) {
        this.id = id;
        this.estado = (estado == null) ? null : estado.getCodigo();
        this.contrato = contrato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoPagamento getEstado() {
        return EstadoPagamento.toEnum(estado);
    }

    public void setEstado(EstadoPagamento estado) {
        this.estado = estado.getCodigo();
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pagamento)) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(getId(), pagamento.getId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}
