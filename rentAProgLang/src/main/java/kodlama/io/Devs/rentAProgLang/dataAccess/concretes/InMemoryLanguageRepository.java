package kodlama.io.Devs.rentAProgLang.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.rentAProgLang.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.rentAProgLang.entities.ProgLanguages;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	List<ProgLanguages> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<ProgLanguages>();
		languages.add(new ProgLanguages(0, "JavaScripts"));
		languages.add(new ProgLanguages(1, "C"));
		languages.add(new ProgLanguages(2, "Java"));
		languages.add(new ProgLanguages(3, "Python"));
		languages.add(new ProgLanguages(4, "C#"));
		languages.add(new ProgLanguages(5, "Go"));

	}

	@Override
	public List<ProgLanguages> getAll() {

		return languages;
	}

	@Override
	public void add(ProgLanguages language) {
		
		languages.add(language);
	}

	

}
