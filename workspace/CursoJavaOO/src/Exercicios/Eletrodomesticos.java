package Exercicios;

import br.senai.sp.informatica.oo.Eletrodomésticos;

public class Eletrodomesticos extends TodoProduto {
	
		
		private String dataDeValidade;
		private String dataDeProducao;
		public String getDataDeValidade() {
			return dataDeValidade;
		}
		public void setDataDeValidade(String dataDeValidade) {
			this.dataDeValidade = dataDeValidade;
		}
		public String getDataDeProducao() {
			return dataDeProducao;
		}
		public void setDataDeProducao(String dataDeProducao) {
			this.dataDeProducao = dataDeProducao;
		}
	

}
