package demo.fariasv.service;

import java.util.List;

import demo.fariasv.model.Vacante;

public interface IVacantesService {
	
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
	void guardar(Vacante vacante);
}
