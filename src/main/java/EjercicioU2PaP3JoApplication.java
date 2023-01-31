


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.IAutorService;
import com.example.demo.modelo.Autor;
import com.example.demo.modelo.Libro;


@SpringBootApplication
public class EjercicioU2PaP3JoApplication implements CommandLineRunner {

	
	@Autowired
	private IAutorService autorService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3JoApplication.class, args);
	}


	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Set<Libro>libros = new HashSet<>();
		Libro libr = new Libro();
		libr.setNombre("PWeb");
		libr.setEditorial("Norma");
		Libro libr2 = new Libro();
		libr2.setNombre("Redes");
		libr2.setEditorial("Norma");
		libros.add(libr);
		libros.add(libr2);
		
		
		Autor aut = new Autor();
		aut.setNombre("WS");
		aut.setLibros(libros);
		this.autorService.agregar(aut);		
	
		
	}

}
