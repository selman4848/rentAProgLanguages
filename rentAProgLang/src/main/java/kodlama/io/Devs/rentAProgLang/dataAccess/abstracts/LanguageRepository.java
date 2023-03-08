package kodlama.io.Devs.rentAProgLang.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.rentAProgLang.entities.ProgLanguages;

public interface LanguageRepository {
	List<ProgLanguages> getAll();
	void add(ProgLanguages languages);
	
	

}
