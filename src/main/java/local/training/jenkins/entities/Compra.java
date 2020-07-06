package local.training.jenkins.entities;

import java.math.BigDecimal;

public class Compra {
	private Item item;
	private BigDecimal valor;

	public Compra(Item item, BigDecimal valor) {
		this.item = item;
		this.valor = valor;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}