public class ClaseExterna {

	private int valorExterno;
	
	public ClaseExterna(int valor) {
		
		this.valorExterno = valor;
		
	}

	public int getValorExterno() {
		
		return valorExterno;
		
	}

	public void setValorExterno(int valor) {
		
		this.valorExterno = valor;
		
	}
	
	public class ClaseInterna {
		
		private String valorInterno;

		public ClaseInterna(String valorInterno) {
			
			this.valorInterno = valorInterno;
			
		}

		public String getValorInterno() {
			
			return valorInterno;
			
		}

		public void setValorInterno(String valorInterno) {
			
			this.valorInterno = valorInterno;
			
		}
		
		public int doblarValorExterno() {
			
			return valorExterno * 2;
			
		}
		
	}
	
	public String devolverValorInterno() {
		
		ClaseInterna cI = new ClaseInterna("Hola jovenes :)");
		
		return cI.getValorInterno();
		
	}
	
}
