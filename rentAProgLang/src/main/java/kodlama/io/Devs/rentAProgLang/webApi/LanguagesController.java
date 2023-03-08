package kodlama.io.Devs.rentAProgLang.webApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.rentAProgLang.business.abstracts.LanguageService;
import kodlama.io.Devs.rentAProgLang.entities.ProgLanguages;

@RestController 
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	@GetMapping("/getAll")
	public List<ProgLanguages> getAll(){
		return languageService.getAll();
		
	}
	@PostMapping("/add")
	public void add(ProgLanguages language) {
		languageService.add(language);
		
	}
	

}
