package net.dobleve.dblv.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dblv_perfil_acesso")
public class PerfilAcessoDTO {

	@Id
	@Column(name = "id_perfil_membro")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idPerfilAcesso;
	@Column(name = "fk_id_membro")
	private int fkIdMembro;
	@Column(name = "fk_id_perfil")
	private int fkIdPerfil;
	@Column(name = "fk_id_sistema")
	private int fkIdSistema;
	private boolean contrato;
	private boolean ativo;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;
	
	public int getIdPerfilAcesso() {
		return idPerfilAcesso;
	}
	public void setIdPerfilAcesso(int idPerfilAcesso) {
		this.idPerfilAcesso = idPerfilAcesso;
	}
	public int getFkIdMembro() {
		return fkIdMembro;
	}
	public void setFkIdMembro(int fkIdMembro) {
		this.fkIdMembro = fkIdMembro;
	}
	public int getFkIdPerfil() {
		return fkIdPerfil;
	}
	public void setFkIdPerfil(int fkIdPerfil) {
		this.fkIdPerfil = fkIdPerfil;
	}
	public int getFkIdSistema() {
		return fkIdSistema;
	}
	public void setFkIdSistema(int fkIdSistema) {
		this.fkIdSistema = fkIdSistema;
	}
	public boolean isContrato() {
		return contrato;
	}
	public void setContrato(boolean contrato) {
		this.contrato = contrato;
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
