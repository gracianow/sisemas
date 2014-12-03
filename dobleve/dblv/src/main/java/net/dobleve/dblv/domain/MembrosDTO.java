package net.dobleve.dblv.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dblv_membros")
public class MembrosDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idMembro;
	@Column(name = "nm_membro")
	private String nmMembro;
	@Column(name = "dt_nascto")
	private Date dtNascto;
	private String sexo;
	private String fone;
	private String email;
	private String pwd;
	private boolean ativo;
	@Column(name = "valida_email")
	private boolean validaEmail;
	private boolean contrato;
	@Column(name = "fk_tipo_membro")
	private int fkTipoMembro;
	@Column(name = "fk_id_perfil")
	private int fkPerfil;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;
	
	public int getIdMembro() {
		return idMembro;
	}
	public void setIdMembro(int idMembro) {
		this.idMembro = idMembro;
	}
	public String getNmMembro() {
		return nmMembro;
	}
	public void setNmMembro(String nmMembro) {
		this.nmMembro = nmMembro;
	}
	public Date getDtNascto() {
		return dtNascto;
	}
	public void setDtNascto(Date dtNascto) {
		this.dtNascto = dtNascto;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public boolean isValidaEmail() {
		return validaEmail;
	}
	public void setValidaEmail(boolean validaEmail) {
		this.validaEmail = validaEmail;
	}
	public boolean isContrato() {
		return contrato;
	}
	public void setContrato(boolean contrato) {
		this.contrato = contrato;
	}
	public int getFkTipoMembro() {
		return fkTipoMembro;
	}
	public void setFkTipoMembro(int fkTipoMembro) {
		this.fkTipoMembro = fkTipoMembro;
	}
	public int getFkPerfil() {
		return fkPerfil;
	}
	public void setFkPerfil(int fkPerfil) {
		this.fkPerfil = fkPerfil;
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
	public int getAutorizador() {
		return autorizador;
	}
	public void setAutorizador(int autorizador) {
		this.autorizador = autorizador;
	}
	
	
	
	
}
