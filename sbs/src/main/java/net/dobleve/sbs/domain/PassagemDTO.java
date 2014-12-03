package net.dobleve.sbs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bs_passagem")
public class PassagemDTO {
	
	@Id
	@Column(name = "id_passagem")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idPassagem;
	@Column(name = "nm_passagem")
	private String nmPassagem;
	@Column(name = "nr_poltrona")
	private int nrPoltrona;
	@Column(name = "dt_embarque")
	private Date dtEmbarque;
	@Column(name = "fk_id_onibus")
	private int fkIdOnibus;
	@Column(name = "fk_id_passageiro")
	private int fkIdPassageiro;
	@Column(name = "vl_pago")
	private double vlPago;
	private boolean ativo;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;
	
	public int getIdPassagem() {
		return idPassagem;
	}
	public void setIdPassagem(int idPassagem) {
		this.idPassagem = idPassagem;
	}
	public String getNmPassagem() {
		return nmPassagem;
	}
	public void setNmPassagem(String nmPassagem) {
		this.nmPassagem = nmPassagem;
	}
	public int getNrPoltrona() {
		return nrPoltrona;
	}
	public void setNrPoltrona(int nrPoltrona) {
		this.nrPoltrona = nrPoltrona;
	}
	public Date getDtEmbarque() {
		return dtEmbarque;
	}
	public void setDtEmbarque(Date dtEmbarque) {
		this.dtEmbarque = dtEmbarque;
	}
	public int getFkIdOnibus() {
		return fkIdOnibus;
	}
	public void setFkIdOnibus(int fkIdOnibus) {
		this.fkIdOnibus = fkIdOnibus;
	}
	public int getFkIdPassageiro() {
		return fkIdPassageiro;
	}
	public void setFkIdPassageiro(int fkIdPassageiro) {
		this.fkIdPassageiro = fkIdPassageiro;
	}
	public double getVlPago() {
		return vlPago;
	}
	public void setVlPago(double vlPago) {
		this.vlPago = vlPago;
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
