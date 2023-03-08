package kodlama.io.Devs.rentAProgLang.business.abstracts;

import java.util.List;

import kodlama.io.Devs.rentAProgLang.entities.ProgLanguages;

public interface LanguageService {
	List<ProgLanguages> getAll();
	void add(ProgLanguages language);
	

}
