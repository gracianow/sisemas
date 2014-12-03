package net.dobleve.emt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emt_designacao")
public class DesignacaoDTO {
	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		@Column(name = "id_designacao")
		private int idDesignacao;
		@Column(name = "fk_id_aluno")
		private String fkIdAluno;
		@Column(name = "nr_discurso")
		private int nrDiscurso;
		@Column(name = "nr_cinselho")
		private int nrConselho;
		private boolean aprovacao; 
		private boolean ativo;
		private int autorizador;
		@Column(name = "dt_autorizacao")
		private Date dtAutorizacao;
		private int atualizador;
		@Column(name = "dt_atualizacao")
		private Date dtAtualizacao;
		
		public int getIdDesignacao() {
			return idDesignacao;
		}
		public void setIdDesignacao(int idDesignacao) {
			this.idDesignacao = idDesignacao;
		}
		public String getFkIdAluno() {
			return fkIdAluno;
		}
		public void setFkIdAluno(String fkIdAluno) {
			this.fkIdAluno = fkIdAluno;
		}
		public int getNrDiscurso() {
			return nrDiscurso;
		}
		public void setNrDiscurso(int nrDiscurso) {
			this.nrDiscurso = nrDiscurso;
		}
		public int getNrConselho() {
			return nrConselho;
		}
		public void setNrConselho(int nrConselho) {
			this.nrConselho = nrConselho;
		}
		public boolean isAprovacao() {
			return aprovacao;
		}
		public void setAprovacao(boolean aprovacao) {
			this.aprovacao = aprovacao;
		}
		public boolean isAtivo() {
			return ativo;
		}
		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
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
