package net.dobleve.sbs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bs_tipo_onibus")
public class TipoOnibusDTO {

	@Id
	@Column(name = "id_tipo_onibus")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idTipoOnibus;
	@Column(name = "nm_tipo_onibus")
	private String nmTipoOnibus;
	@Column(name = "qt_lugares")
	private int qtLugares;
	@Column(name = "vl_passagem")
	private double vlPassagem;
	private boolean ativo;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;
	
	public int getIdTipoOnibus() {
		return idTipoOnibus;
	}
	public void setIdTipoOnibus(int idTipoOnibus) {
		this.idTipoOnibus = idTipoOnibus;
	}
	public String getNmTipoOnibus() {
		return nmTipoOnibus;
	}
	public void setNmTipoOnibus(String nmTipoOnibus) {
		this.nmTipoOnibus = nmTipoOnibus;
	}
	public int getQtLugares() {
		return qtLugares;
	}
	public void setQtLugares(int qtLugares) {
		this.qtLugares = qtLugares;
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
