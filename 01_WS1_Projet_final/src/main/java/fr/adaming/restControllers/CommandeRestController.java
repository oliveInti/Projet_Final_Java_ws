package fr.adaming.restControllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Commande;
import fr.adaming.service.CommandeServiceImpl;
import fr.adaming.service.ICommandeService;

/**
 * Définition des méthodes du web service Voyage avec Spring MVC
 * 
 * @author projet blue
 *
 */

@RestController
@RequestMapping("/voyages")
public class CommandeRestController {

	// @Autowired
	private ICommandeService commandeService = new CommandeServiceImpl();

	public void setCommandeService(ICommandeService commandeService) {
		this.commandeService = commandeService;
	}

	@RequestMapping(value = "/listeCommande", method = RequestMethod.GET, produces = "application/json")
	public List<Commande> recupererTout() {
		return commandeService.recupererTout();
	}

	@RequestMapping(value = "/commande/{pId}", method = RequestMethod.GET, produces = "application/json")
	public Commande recupererParId(@PathVariable("pId") int id) {
		return commandeService.recupererParId(id);
	}

	@RequestMapping(value = "/ajout", method = RequestMethod.POST, consumes = "application/json")
	public void ajouterCommande(@RequestBody Commande c) {
		commandeService.creer(c);
	}

	@RequestMapping(value = "/modif", method = RequestMethod.PUT, consumes = "application/json")
	public void modifierCommande(@RequestBody Commande c) {
		commandeService.modifier(c);
	}

	@RequestMapping(value = "/supp", method = RequestMethod.DELETE, consumes = "application/json")
	public void supprimerCommande(@RequestBody Commande c) {
		commandeService.supprimer(c);
	}
}
