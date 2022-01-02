package demo.fariasv.service;

import java.util.List;

import demo.fariasv.model.Categoria;

public interface ICategoriasService {
	
	void guardar(Categoria categoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorID(Integer idCategoria);
}
