package es.uclm.esi.bc01.testingP1;
public class Fecha {

	protected int dia;
	protected int mes;
	protected int anio;
	
	public Fecha(int dia, int mes, int anio) throws negativoException{
		try {
		this.dia = comprobacionEntero(dia);
		this.mes = comprobacionEntero(mes);
		this.anio = comprobacionEntero(anio);
		}catch(negativoException e) {
			
		}
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}
	
	public static int comprobacionEntero(int num) throws negativoException { 
		 
	 	try {
		 if(num < 0) {
			 throw new negativoException("El n�mero introducido es negativo, y este ha de ser "
			 		+ "positivo \n");
		 	}
			}catch(negativoException e) {
				System.out.println(e.getMessage());
			}
	 	
	 	return num;
	}
	
	

}
