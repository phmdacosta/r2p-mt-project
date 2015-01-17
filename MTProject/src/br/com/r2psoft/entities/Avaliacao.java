package br.com.r2psoft.entities;

import java.util.Date;

/**
 * Classe da entidade Avaliação.
 * @author Pedro Henrique
 */
public class Avaliacao {

	private long id;
	private String nomePessoa;
	private String comentario;
	private float nota;
	private String tipoAvaliacao;
	private Date dataPostagem;
	
	private Banheiro banheiro;
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * @return the nomePessoa
	 */
	public String getNomePessoa() {
		return nomePessoa;
	}
	
	/**
	 * @param nomePessoa the nomePessoa to set
	 */
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	
	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}
	
	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	/**
	 * @return the nota
	 */
	public float getNota() {
		return nota;
	}
	
	/**
	 * @param nota the nota to set
	 */
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	/**
	 * @return the tipoAvaliacao
	 */
	public String getTipoAvaliacao() {
		return tipoAvaliacao;
	}
	
	/**
	 * @param tipoAvaliacao the tipoAvaliacao to set
	 */
	public void setTipoAvaliacao(String tipoAvaliacao) {
		this.tipoAvaliacao = tipoAvaliacao;
	}
	
	/**
	 * @return the dataPostagem
	 */
	public Date getDataPostagem() {
		return dataPostagem;
	}
	
	/**
	 * @param dataPostagem the dataPostagem to set
	 */
	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	/**
	 * @return the banheiro
	 */
	public Banheiro getBanheiro() {
		return banheiro;
	}

	/**
	 * @param banheiro the banheiro to set
	 */
	public void setBanheiro(Banheiro banheiro) {
		this.banheiro = banheiro;
	}
}
