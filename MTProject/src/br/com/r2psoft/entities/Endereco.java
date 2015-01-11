package br.com.r2psoft.entities;

/**
 * Classe da entidade Endereço.
 * @author Pedro Henrique
 */
public class Endereco {
	
	private long id;
	private double longitude;
	private double latitude;
	private String descricao;
	private int numero;
	private String complemento;
	
	
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
	 * @return the localVertical
	 */
	public double getLongitude() {
		return longitude;
	}
	
	/**
	 * @param localVertical the localVertical to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * @return the localHorizontal
	 */
	public double getLatitude() {
		return latitude;
	}
	
	/**
	 * @param localHorizontal the localHorizontal to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}
	
	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
