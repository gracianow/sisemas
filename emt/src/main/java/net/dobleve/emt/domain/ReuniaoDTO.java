package net.dobleve.emt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emt_reuniao")
public class ReuniaoDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_reuniao")
	private int idReuniao;
	private int semana;
	private Date dtReuniao;
	private int dirigenteEbc;
	private int leitorEbc;
	private int fkIdEstudoBiblico;
	private int dirigenteDtq;
	private int fkIdDestaques;
	private int fkIdAluno1;
	private int fkIdDesignacao1;
	private int fkIdAluno2;
	private int fkIdDesignacao2;
	private int fkIdAluno3;
	private int fkIdDesignacao3;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;
	
	public int getIdReuniao() {
		return idReuniao;
	}
	public void setIdReuniao(int idReuniao) {
		this.idReuniao = idReuniao;
	}
	public int getSemana() {
		return semana;
	}
	public void setSemana(int semana) {
		this.semana = semana;
	}
	public Date getDtReuniao() {
		return dtReuniao;
	}
	public void setDtReuniao(Date dtReuniao) {
		this.dtReuniao = dtReuniao;
	}
	public int getDirigenteEbc() {
		return dirigenteEbc;
	}
	public void setDirigenteEbc(int dirigenteEbc) {
		this.dirigenteEbc = dirigenteEbc;
	}
	public int getLeitorEbc() {
		return leitorEbc;
	}
	public void setLeitorEbc(int leitorEbc) {
		this.leitorEbc = leitorEbc;
	}
	public int getFkIdEstudoBiblico() {
		return fkIdEstudoBiblico;
	}
	public void setFkIdEstudoBiblico(int fkIdEstudoBiblico) {
		this.fkIdEstudoBiblico = fkIdEstudoBiblico;
	}
	
	public int getFkIdAluno1() {
		return fkIdAluno1;
	}
	public void setFkIdAluno1(int fkIdAluno1) {
		this.fkIdAluno1 = fkIdAluno1;
	}
	public int getFkIdDesignacao1() {
		return fkIdDesignacao1;
	}
	public void setFkIdDesignacao1(int fkIdDesignacao1) {
		this.fkIdDesignacao1 = fkIdDesignacao1;
	}
	public int getFkIdAluno2() {
		return fkIdAluno2;
	}
	public void setFkIdAluno2(int fkIdAluno2) {
		this.fkIdAluno2 = fkIdAluno2;
	}
	public int getFkIdDesignacao2() {
		return fkIdDesignacao2;
	}
	public void setFkIdDesignacao2(int fkIdDesignacao2) {
		this.fkIdDesignacao2 = fkIdDesignacao2;
	}
	public int getFkIdAluno3() {
		return fkIdAluno3;
	}
	public void setFkIdAluno3(int fkIdAluno3) {
		this.fkIdAluno3 = fkIdAluno3;
	}
	public int getFkIdDesignacao3() {
		return fkIdDesignacao3;
	}
	public void setFkIdDesignacao3(int fkIdDesignacao3) {
		this.fkIdDesignacao3 = fkIdDesignacao3;
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
	public int getDirigenteDtq() {
		return dirigenteDtq;
	}
	public void setDirigenteDtq(int dirigenteDtq) {
		this.dirigenteDtq = dirigenteDtq;
	}
	public int getFkIdDestaques() {
		return fkIdDestaques;
	}
	public void setFkIdDestaques(int fkIdDestaques) {
		this.fkIdDestaques = fkIdDestaques;
	}

}
