package fr.adaming.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Client;
import fr.adaming.service.IClientService;

/**
 * D�finition des m�thodes du web service avec Spring MVC
 * 
 * @author projet blue
 *
 */
@RestController
@RequestMapping("/clients")
public class ClientRestController {

	@Autowired
	private IClientService clientService;

	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	@RequestMapping(value = "/listeClient", method = RequestMethod.GET, produces = "application/json")
	public List<Client> recupererTout() {
		return clientService.recupererTout();
	}

	@RequestMapping(value = "/client/{pId}", method = RequestMethod.GET, produces = "application/json")
	public Client recupererParId(@PathVariable("pId") int id) {
		return clientService.recupererParId(id);
	}

	@RequestMapping(value = "/ajout", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public void ajouterClient(@RequestBody Client c) {

		clientService.creer(c);

		// return http.("Access-Control-Allow-Origin", "*").
	}

	@CrossOrigin
	@RequestMapping(value = "/modif", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public void modifierClient(@RequestBody Client c) {
		clientService.modifier(c);
	}

	@RequestMapping(value = "/supp", method = RequestMethod.DELETE, consumes = "application/json")
	public void supprimerClient(@RequestBody Client c) {
		clientService.supprimer(c);
	}
}
