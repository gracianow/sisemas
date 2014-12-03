package net.dobleve.emt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emt_tipo_aluno")
public class TipoAlunoDTO {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private int idTipoAluno;
		private String descricao;
		@Column(name = "dt_nascto")
		private Date dtNascto;
		private String sexo;
		private String fone;
		private String email;
		private int nrConselho;
		private boolean aprovacao;
		private boolean ativo;
		private int autorizador;
		@Column(name = "dt_autorizacao")
		private Date dtAutorizacao;
		private int atualizador;
		@Column(name = "dt_atualizacao")
		private Date dtAtualizacao;
		
		public int getIdTipoAluno() {
			return idTipoAluno;
		}
		public void setIdTipoAluno(int idTipoAluno) {
			this.idTipoAluno = idTipoAluno;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
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
