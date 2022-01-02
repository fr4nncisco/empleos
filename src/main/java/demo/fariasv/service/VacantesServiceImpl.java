package demo.fariasv.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import demo.fariasv.model.Vacante;

@Service
public class VacantesServiceImpl implements IVacantesService{

	private List<Vacante> lista = null;
	
	public VacantesServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Vacante>();
		
		try {
			//Oferta de trabajo 1
			Vacante v1 = new Vacante();
			v1.setId(1);
			v1.setNombre("INGENIERO CIVIL");
			v1.setDescripcion("Solicitamos Ing. Civil para diseñar puente peatonal.");
			v1.setFecha(sdf.parse("08-02-2019"));
			v1.setSalario(14000.0);
			v1.setDestacado(1);
			v1.setImagen("empresa1.png");
			
			//Oferta de trabajo 2
			Vacante v2 = new Vacante();
			v2.setId(2);
			v2.setNombre("CONTADOR PÚBLICO");
			v2.setDescripcion("Empresa importante solicita contador con 5 años de experiencia y título.");
			v2.setFecha(sdf.parse("09-02-2019"));
			v2.setSalario(12000.0);
			v2.setDestacado(0);
			v2.setImagen("empresa2.png");
			
			//Oferta de trabajo 3
			Vacante v3 = new Vacante();
			v3.setId(3);
			v3.setNombre("INGENIERO ELÉCTRICO");
			v3.setDescripcion("Empresa internacional solicita Ing. mecánico para mantenimiento.");
			v3.setFecha(sdf.parse("10-02-2019"));
			v3.setSalario(8500.0);
			v3.setDestacado(0);
			
			//Oferta de trabajo 4
			Vacante v4 = new Vacante();
			v4.setId(4);
			v4.setNombre("DISEÑADOR GRÁFICO");
			v4.setDescripcion("Solicitamos Diseñador gráfico titulado para publicidad del estado.");
			v4.setFecha(sdf.parse("11-02-2019"));
			v4.setSalario(7500.0);
			v4.setDestacado(1);
			v4.setImagen("empresa3.png");
			
			lista.add(v1);
			lista.add(v2);
			lista.add(v3);
			lista.add(v4);
			
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	@Override
	public List<Vacante> buscarTodas() {
		return lista;
	}

	@Override
	public Vacante buscarPorId(Integer idVacante) {
		
		for(Vacante v : lista) {
			if(v.getId()==idVacante) {
				return v;
			}
		}
		return null;
	}

	@Override
	public void guardar(Vacante vacante) {
		lista.add(vacante);
	}

}
