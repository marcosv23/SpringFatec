package com.fatec.entities;

import javax.annotation.Generated;
import javax.persistence.Entity;
import java.util.Date;
import java.util.Optional;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Comentario {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  private String descricao;
  
  @JsonFormat(pattern="dd/MM/yyyy HH:mm")
  private Date dataEnvio;

  @ManyToOne
  @JoinColumn(name="ordem_servico_id")
  private OrdemServico ordemServico;

  public Integer getId() {
    return id;
  }

  public Comentario() {
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Comentario(Integer id, String descricao, Date dataEnvio) {
    this.id = id;
    this.descricao = descricao;
    this.dataEnvio = dataEnvio;

  }

  public Comentario(Integer id, String descricao, Date dataEnvio, OrdemServico ordemServico) {
    this.id = id;
    this.descricao = descricao;
    this.dataEnvio = dataEnvio;
    this.ordemServico = ordemServico;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Date getDataEnvio() {
    return dataEnvio;
  }

  public void setDataEnvio(Date date) {
    this.dataEnvio= date;
  }

  public OrdemServico getOrdemServico() {
    return ordemServico;
  }

  public void setOrdemServico(Optional<OrdemServico> ordemServico2) {
    this.ordemServico = ordemServico2;
  }

  @Override
  public String toString() {
    return "Comentario [dataEnvio=" + dataEnvio + ", descricao=" + descricao + ", id=" + id + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((dataEnvio == null) ? 0 : dataEnvio.hashCode());
    result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Comentario other = (Comentario) obj;
    if (dataEnvio == null) {
      if (other.dataEnvio != null)
        return false;
    } else if (!dataEnvio.equals(other.dataEnvio))
      return false;
    if (descricao == null) {
      if (other.descricao != null)
        return false;
    } else if (!descricao.equals(other.descricao))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  



  

}
