package demo.fariasv.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import demo.fariasv.model.Categoria;

@Service
public class CategoriasServiceImpl implements ICategoriasService{

	private List<Categoria> lista = null;
	
	public CategoriasServiceImpl() {
		
		lista = new LinkedList<Categoria>();
				
		Categoria c1 = new Categoria();
		c1.setId(1);
		c1.setNombre("CONTABILIDAD");
		c1.setDescripcion("Descripcion de la Categoria Contabilidad");
		
		Categoria c2 = new Categoria();
		c2.setId(2);
		c2.setNombre("VENTAS");
		c2.setDescripcion("Trabajos relacionados a ventas");
		
		Categoria c3 = new Categoria();
		c3.setId(3);
		c3.setNombre("COMUNICACIONES");
		c3.setDescripcion("Trabajos relacionados a comunicaciones");
		
		Categoria c4 = new Categoria();
		c4.setId(4);
		c4.setNombre("ARQUITECTURA");
		c4.setDescripcion("Trabajos relacionados a arquitectura");
		
		Categoria c5 = new Categoria();
		c5.setId(5);
		c5.setNombre("EDUCACION");
		c5.setDescripcion("Maestros ,tutores");
		
		Categoria c6 = new Categoria();
		c6.setId(5);
		c6.setNombre("DEVELOPER");
		c6.setDescripcion("Trabajo de developer Java");
		
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		lista.add(c6);
	}

	@Override
	public void guardar(Categoria categoria) {
		lista.add(categoria);
	}

	@Override
	public List<Categoria> buscarTodas() {
		return lista;
	}

	@Override
	public Categoria buscarPorID(Integer idCategoria) {
		
		for(Categoria cat: lista) {
			if(cat.getId()==idCategoria) {
				return cat;
			}
		}
		return null;
	}
}
