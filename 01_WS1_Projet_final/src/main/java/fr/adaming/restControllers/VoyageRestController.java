package fr.adaming.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Voyage;
import fr.adaming.service.IGeneriqueService;

/**
 * D�finition des m�thodes du web service Voyage avec Spring MVC
 * 
 * @author projet blue
 *
 */

@RestController
@RequestMapping("/voyages")
public class VoyageRestController {

	@Autowired
	private IGeneriqueService<Voyage> voyageService;

	public void setVoyageService(IGeneriqueService<Voyage> voyageService) {
		this.voyageService = voyageService;
	}
	
	@RequestMapping(value = "/listeVoyage", method = RequestMethod.GET, produces = "application/json")
	public List<Voyage> recupererTout() {
		return voyageService.recupererTout();
	}

	@RequestMapping(value = "/voyage/{pId}", method = RequestMethod.GET, produces = "application/json")
	public Voyage recupererParId(@PathVariable("pId") int id) {
		return voyageService.recupererParId(id);
	}
	
	@RequestMapping(value="/ajout", method=RequestMethod.POST, consumes="application/json")
	public void ajouterVoyage(@RequestBody Voyage v) {
		voyageService.creer(v);
	}
	
	@RequestMapping(value="/modif", method=RequestMethod.PUT, consumes="application/json")
	public void modifierVoyage(@RequestBody Voyage v){
		voyageService.modifier(v);
	}

	@RequestMapping(value="/supp", method=RequestMethod.DELETE, consumes="application/json")
	public void supprimerVoyage(@RequestBody Voyage v) {
		voyageService.supprimer(v);
	}
}