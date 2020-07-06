package local.training.jenkins.entities;

import local.training.jenkins.entities.enums.GeneroItemEnum;

public class Item {
	private String nome;
	private GeneroItemEnum generoItem;

	public Item(String nome, GeneroItemEnum generoItem) {
		this.nome = nome;
		this.generoItem = generoItem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GeneroItemEnum getGeneroItem() {
		return generoItem;
	}

	public void setGeneroItem(GeneroItemEnum generoItem) {
		this.generoItem = generoItem;
	}

}
