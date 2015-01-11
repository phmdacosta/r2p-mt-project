/**
 * 
 */
package br.com.r2psoft.entities;

/**
 * Classe da entidade Imagem.
 * @author Pedro Henrique
 */
public class ImagemBanheiro {

	private long id;
	private byte imagem;
	private boolean ativa;
	private long tamArqImagem;
	private String tipoArqImagem;
	
	
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
	 * @return the imagem
	 */
	public byte getImagem() {
		return imagem;
	}
	
	/**
	 * @param imagem the imagem to set
	 */
	public void setImagem(byte imagem) {
		this.imagem = imagem;
	}
	
	/**
	 * @return the flagAtiva
	 */
	public boolean isAtiva() {
		return ativa;
	}
	
	/**
	 * @param flagAtiva the flagAtiva to set
	 */
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	/**
	 * @return the tamArqImagem
	 */
	public long getTamArqImagem() {
		return tamArqImagem;
	}
	
	/**
	 * @param tamArqImagem the tamArqImagem to set
	 */
	public void setTamArqImagem(long tamArqImagem) {
		this.tamArqImagem = tamArqImagem;
	}
	
	/**
	 * @return the tipoArqImagem
	 */
	public String getTipoArqImagem() {
		return tipoArqImagem;
	}
	
	/**
	 * @param tipoArqImagem the tipoArqImagem to set
	 */
	public void setTipoArqImagem(String tipoArqImagem) {
		this.tipoArqImagem = tipoArqImagem;
	}
}
