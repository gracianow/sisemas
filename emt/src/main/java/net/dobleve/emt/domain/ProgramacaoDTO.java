package net.dobleve.emt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emt_programacao")
public class ProgramacaoDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_programacao")
	private int idProgramacao;
	private int semana;
	@Column(name = "dt_programacao")
	private Date dtProgramacao;
	private int ebc;
	@Column(name = "ebc_leitor")
	private int leitorEbc;
	@Column(name = "ebc_materia")
	private String materiaEbc;
	@Column(name = "ebc_tema")
	private String temaEbc;
	@Column(name = "nr_discurso")
	private int destaques;
	@Column(name = "dtq_materia")
	private String materiaDtq;
	private int designacao1;
	@Column(name = "materia_desig1")
	private String materiaDesignacao1;
	@Column(name = "tema_desig1")
	private String temaDesignacao1;
	private int designacao2;
	@Column(name = "materia_desig2")
	private String materiaDesignacao2;
	@Column(name = "tema_desig2")
	private String temaDesignacao2;
	private int designacao3;
	@Column(name = "materia_desig3")
	private String materiaDesignacao3;
	@Column(name = "tema_desig3")
	private String temaDesignacao3;
	private boolean recapitulacao;
	@Column(name = "tema_recapitulacao")
	private String temaRecapitulacao;
	private int autorizador;
	@Column(name = "dt_autorizacao")
	private Date dtAutorizacao;
	private int atualizador;
	@Column(name = "dt_atualizacao")
	private Date dtAtualizacao;
	
	public int getIdProgramacao() {
		return idProgramacao;
	}
	public void setIdProgramacao(int idProgramacao) {
		this.idProgramacao = idProgramacao;
	}
	public int getSemana() {
		return semana;
	}
	public void setSemana(int semana) {
		this.semana = semana;
	}
	public Date getDtProgramacao() {
		return dtProgramacao;
	}
	public void setDtProgramacao(Date dtProgramacao) {
		this.dtProgramacao = dtProgramacao;
	}
	public int getEbc() {
		return ebc;
	}
	public void setEbc(int ebc) {
		this.ebc = ebc;
	}
	public int getLeitorEbc() {
		return leitorEbc;
	}
	public void setLeitorEbc(int leitorEbc) {
		this.leitorEbc = leitorEbc;
	}
	public String getMateriaEbc() {
		return materiaEbc;
	}
	public void setMateriaEbc(String materiaEbc) {
		this.materiaEbc = materiaEbc;
	}
	public String getTemaEbc() {
		return temaEbc;
	}
	public void setTemaEbc(String temaEbc) {
		this.temaEbc = temaEbc;
	}
	
	public int getDesignacao1() {
		return designacao1;
	}
	public void setDesignacao1(int designacao1) {
		this.designacao1 = designacao1;
	}
	public String getMateriaDesignacao1() {
		return materiaDesignacao1;
	}
	public void setMateriaDesignacao1(String materiaDesignacao1) {
		this.materiaDesignacao1 = materiaDesignacao1;
	}
	public String getTemaDesignacao1() {
		return temaDesignacao1;
	}
	public void setTemaDesignacao1(String temaDesignacao1) {
		this.temaDesignacao1 = temaDesignacao1;
	}
	public int getDesignacao2() {
		return designacao2;
	}
	public void setDesignacao2(int designacao2) {
		this.designacao2 = designacao2;
	}
	public String getMateriaDesignacao2() {
		return materiaDesignacao2;
	}
	public void setMateriaDesignacao2(String materiaDesignacao2) {
		this.materiaDesignacao2 = materiaDesignacao2;
	}
	public String getTemaDesignacao2() {
		return temaDesignacao2;
	}
	public void setTemaDesignacao2(String temaDesignacao2) {
		this.temaDesignacao2 = temaDesignacao2;
	}
	public int getDesignacao3() {
		return designacao3;
	}
	public void setDesignacao3(int designacao3) {
		this.designacao3 = designacao3;
	}
	public String getMateriaDesignacao3() {
		return materiaDesignacao3;
	}
	public void setMateriaDesignacao3(String materiaDesignacao3) {
		this.materiaDesignacao3 = materiaDesignacao3;
	}
	public String getTemaDesignacao3() {
		return temaDesignacao3;
	}
	public void setTemaDesignacao3(String temaDesignacao3) {
		this.temaDesignacao3 = temaDesignacao3;
	}
	public boolean isRecapitulacao() {
		return recapitulacao;
	}
	public void setRecapitulacao(boolean recapitulacao) {
		this.recapitulacao = recapitulacao;
	}
	public String getTemaRecapitulacao() {
		return temaRecapitulacao;
	}
	public void setTemaRecapitulacao(String temaRecapitulacao) {
		this.temaRecapitulacao = temaRecapitulacao;
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
	public int getDestaques() {
		return destaques;
	}
	public void setDestaques(int destaques) {
		this.destaques = destaques;
	}
	public String getMateriaDtq() {
		return materiaDtq;
	}
	public void setMateriaDtq(String materiaDtq) {
		this.materiaDtq = materiaDtq;
	}
	

}
