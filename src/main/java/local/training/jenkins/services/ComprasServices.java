package local.training.jenkins.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import local.training.jenkins.entities.Compra;
import local.training.jenkins.entities.Item;
import local.training.jenkins.entities.enums.GeneroItemEnum;

public class ComprasServices {

	public List<Compra> getComprasMes() {
		return new ArrayList<Compra>() {
			/**
			* 
			*/
			private static final long serialVersionUID = 4550403004763836876L;

			{
				add(new Compra(new Item("Papel Sulfite A4", GeneroItemEnum.ALMOXARIFADO), new BigDecimal("400.00")));
				add(new Compra(new Item("Esteira de Produção", GeneroItemEnum.PRODUCAO), new BigDecimal("5490.00")));
			}
		};

	}

}
