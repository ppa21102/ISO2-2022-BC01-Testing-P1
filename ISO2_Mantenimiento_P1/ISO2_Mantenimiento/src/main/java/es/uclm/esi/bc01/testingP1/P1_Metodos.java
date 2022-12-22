package es.uclm.esi.bc01.testingP1;
public class P1_Metodos {
	
	public static boolean comprobarBisiesto(Fecha fecha) {
		boolean bisiesto;
		
		if (fecha.getAnio() % 4 == 0 && ((fecha.getAnio() % 100 != 0) || (fecha.getAnio() % 400 == 0))) {
			bisiesto = true;
		}else {
			bisiesto = false;
		}
		return bisiesto;
	}
	 
	 public static boolean comprobarFecha(Fecha fecha) {
		 boolean fechaCorrecta = true;
		 
		 if(fecha.getDia() < 1 || fecha.getDia() > 31) {
			 fechaCorrecta = false;
		 }
		 if(fecha.getMes() < 1 || fecha.getMes() > 12) {
			 fechaCorrecta = false;
		 }
		 
		 return fechaCorrecta;
	 } 
}
