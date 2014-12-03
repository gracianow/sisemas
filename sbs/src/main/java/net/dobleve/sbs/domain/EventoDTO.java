package net.dobleve.sbs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bs_evento")
public class EventoDTO {
	
	@Id
	@Column(name = "id_evento")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idEvento;
	@Column(name = "nm_evento")
	private String nmEvento;
	@Column(name = "dt_inicio_evento")
	private Date dtInicioEvento;
	@Column(name = "dt_fim_evento")
	private Date dtFimEvento;
	@Column(name = "fk_id_local")
	private int fkIdLocal;
	@Column(name = "fk_id_circuito")
	private int fkIdCircuito;
	private boolean ativo;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	public String getNmEvento() {
		return nmEvento;
	}
	public void setNmEvento(String nmEvento) {
		this.nmEvento = nmEvento;
	}
	public Date getDtInicioEvento() {
		return dtInicioEvento;
	}
	public void setDtInicioEvento(Date dtInicioEvento) {
		this.dtInicioEvento = dtInicioEvento;
	}
	public Date getDtFimEvento() {
		return dtFimEvento;
	}
	public void setDtFimEvento(Date dtFimEvento) {
		this.dtFimEvento = dtFimEvento;
	}
	public int getFkIdLocal() {
		return fkIdLocal;
	}
	public void setFkIdLocal(int fkIdLocal) {
		this.fkIdLocal = fkIdLocal;
	}
	public int getFkIdCircuito() {
		return fkIdCircuito;
	}
	public void setFkIdCircuito(int fkIdCircuito) {
		this.fkIdCircuito = fkIdCircuito;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public int getAutorizador() {
		return autorizador;
	}
	public void setAutorizador(int autorizador) {
		this.autorizador = autorizador;
	}
	public Date getDtAutorizacao() {
		return dtAutorizacao;
	}
	public void setDtAutorizacao(Date dtAutorizacao) {
		this.dtAutorizacao = dtAutorizacao;
	}
	public int getAtualizador() {
		return atualizador;
	}
	public void setAtualizador(int atualizador) {
		this.atualizador = atualizador;
	}
	public Date getDtAtualizacao() {
		return dtAtualizacao;
	}
	public void setDtAtualizacao(Date dtAtualizacao) {
		this.dtAtualizacao = dtAtualizacao;
	}

}
