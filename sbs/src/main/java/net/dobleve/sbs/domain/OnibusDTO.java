package net.dobleve.sbs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bs_onibus")
public class OnibusDTO {
	
	@Id
	@Column(name = "id_onibus")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idOnibus;
	@Column(name = "nm_onibus")
	private String nmOnibus;
	@Column(name = "fk_id_tipo_onibus")
	private int fkIdTipoOnibus;
	@Column(name = "fk_id_evento")
	private int fkIdEvento;
	private boolean ativo;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	
	private Date dtAtualizacao;
	public int getIdOnibus() {
		return idOnibus;
	}
	public void setIdOnibus(int idOnibus) {
		this.idOnibus = idOnibus;
	}
	public String getNmOnibus() {
		return nmOnibus;
	}
	public void setNmOnibus(String nmOnibus) {
		this.nmOnibus = nmOnibus;
	}
	public int getFkIdTipoOnibus() {
		return fkIdTipoOnibus;
	}
	public void setFkIdTipoOnibus(int fkIdTipoOnibus) {
		this.fkIdTipoOnibus = fkIdTipoOnibus;
	}
	public int getFkIdEvento() {
		return fkIdEvento;
	}
	public void setFkIdEvento(int fkIdEvento) {
		this.fkIdEvento = fkIdEvento;
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
