package gui;

import java.util.ArrayList;
import persona.*;

public class Gui {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Jose", "Ruiz", null, null, null);
		Foto foto = new Foto("png", 1024);
		foto.ponResolucion(100, 150);
		
		ArrayList<Lugar> lugares = new ArrayList<Lugar>();
		lugares.add(new Lugar("Ubeda","Parador-Ciudad Renacentista", "953873317"));
		lugares.add(new Lugar("Baeza","Casa Antonio", "953556985"));
		
		persona.setMiFoto(foto);
		persona.setMisLugares(lugares);
		
		lugares.add(new Lugar("Jaen","Parador Castillo", "953596455"));
		persona.setMisLugares(lugares);
		
		persona.ponPerfil("programador", "programo de todo");
		persona.ponPerfil("tecnologia", "arreglo moviles");
		
	}

}
