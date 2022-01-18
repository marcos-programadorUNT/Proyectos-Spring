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

import Root.Interfaces.iclientes;
import Root.Modelos.mclientes;

@RestController
@RequestMapping("clientes")
public class cclientes {
	
	@Autowired private iclientes miobjeto;
	@GetMapping("/listar")
	public List<mclientes> listar()
	{
		return miobjeto.findAll();
	}
	
	@GetMapping("/buscar/{numero}")
	public mclientes buscar(@PathVariable("numero") Integer numero)
	{
	
		return miobjeto.buscarCliente(numero);
	}

}
