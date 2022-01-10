package Root.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Root.Interfaces.isolicitudes;
import Root.Modelos.msolicitudes;

@RestController
@RequestMapping("solicitudes")
public class csolicitudes {

	@Autowired private isolicitudes miobjeto;
	
	
	@PostMapping("/agregar")
	public msolicitudes agregar(@RequestBody msolicitudes datos)
	{
		miobjeto.save(datos);
		return datos;
	}
	
	@GetMapping("/listar")
	public List<msolicitudes> listar()
	{
		return miobjeto.findAll();
	}
	
	@PutMapping("/aprobar/{numero}")
	public msolicitudes aprobar(@PathVariable("numero") Integer numero)
	{	miobjeto.aprobarSolicitud(numero);
		return miobjeto.findById(numero).get();
	}
	
	@PutMapping("/desaprobar/{numero}")
	public msolicitudes desaprobar(@PathVariable("numero") Integer numero)
	{	
		miobjeto.desaprobarSolicitud(numero);
		return miobjeto.findById(numero).get();
	}
	
	@GetMapping("/buscar/{numero}")
	
	/*public List<msolicitudes> buscar(@PathVariable("numero") Integer numero)
	{
		
		return miobjeto.buscarSolicitud(numero);
	}*/
	
	public msolicitudes buscar(@PathVariable("numero") Integer numero)
	{
	
		return miobjeto.buscarSolicitud(numero);
	}
	
	@GetMapping("/pimin")
	public String mensajePimin()
	{
		return "pimin";
	}
}
