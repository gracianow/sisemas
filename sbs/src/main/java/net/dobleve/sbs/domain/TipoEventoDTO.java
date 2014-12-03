package net.dobleve.sbs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bs_tipo_evento")
public class TipoEventoDTO {

	@Id
	@Column(name = "id_tipo_evento")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idTipoEvento;
	@Column(name = "nm_tipo_evento")
	private String nmTipoEvento;
	@Column(name = "duracao_evento")
	private int duracaoEvento;
	@Column(name = "vl_passagem")
	private double vlPassagem;
	private boolean ativo;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;
	
	public int getIdTipoEvento() {
		return idTipoEvento;
	}
	public void setIdTipoEvento(int idTipoEvento) {
		this.idTipoEvento = idTipoEvento;
	}
	public String getNmTipoEvento() {
		return nmTipoEvento;
	}
	public void setNmTipoEvento(String nmTipoEvento) {
		this.nmTipoEvento = nmTipoEvento;
	}
	public int getDuracaoEvento() {
		return duracaoEvento;
	}
	public void setDuracaoEvento(int duracaoEvento) {
		this.duracaoEvento = duracaoEvento;
	}
	public double getVlPassagem() {
		return vlPassagem;
	}
	public void setVlPassagem(double vlPassagem) {
		this.vlPassagem = vlPassagem;
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
