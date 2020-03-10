package foodtruck.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import foodtruck.model.Produit;
import foodtruck.reposity.ActualiteRepository;

@RestController
@RequestMapping("/users")
public class Controller {
//	@Autowired
//	private ActualiteRepository ar;
//
//	@GetMapping("/info")
//	public String getHello() {
//		return "Greetings from Spring Boot!";
//	}
//
//	@GetMapping("/all")
//	public ArrayList<Produit> getAll() {
//		ArrayList<Produit> maList = new ArrayList<Produit>();
//		Produit a = new Produit();
//		a.setDateCreation("10/10");
//		a.setDateFinValidité("10/20");
//		a.setDescription("desc");
//		a.setId(1);
//		a.setImageUrl("image.url");
//		a.setTitle("Title");
//		maList.add(a);
//		maList.add(a);
//		maList.add(a);
//		maList.add(a);
//		return maList;
//	}
//	
//
//	@PostMapping("/create")
//	public void create(@RequestBody Produit a) {
//		ar.save(a);
////		Actualite a = new Actualite();
////		a.setDateCreation("10/10");
////		a.setDateFinValidité("10/20");
////		a.setDescription("desc");
////		a.setId(1);
////		a.setImageUrl("image.url");
////		a.setTitle("Title");
////		ar.save(a);
//		
	}


}
