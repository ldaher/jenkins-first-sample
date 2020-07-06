package local.training.jenkins.entities.enums;

public enum GeneroItemEnum {
	PRODUCAO("Produção"), ESCRITORIO("Escritório"), 
	AMBULATORIO("Ambulatório"), ALMOXARIFADO("Almoxarifado");
	
	private String generoItem;
	
	private GeneroItemEnum(String generoItem) {
		this.generoItem = generoItem;
	}
	
	public String getGeneroItem() {
		return this.generoItem;
	}
}
