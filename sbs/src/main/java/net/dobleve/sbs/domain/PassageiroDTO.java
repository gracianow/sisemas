package net.dobleve.sbs.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bs_passageiro")
public class PassageiroDTO {

	@Id
	@Column(name = "id_passageiro")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idPassageiro;
	@Column(name = "nm_passageiro")
	private String nmPassageiro;
	private String documento;
	@Column(name = "dt_nascto")
	private Date dtNascto;
	private String sexo;
	private String fone;
	private String email;
	private boolean ativo;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;
	
	public int getIdPassageiro() {
		return idPassageiro;
	}
	public void setIdPassageiro(int idPassageiro) {
		this.idPassageiro = idPassageiro;
	}
	public String getNmPassageiro() {
		return nmPassageiro;
	}
	public void setNmPassageiro(String nmPassageiro) {
		this.nmPassageiro = nmPassageiro;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
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
