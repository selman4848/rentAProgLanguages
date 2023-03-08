package kodlama.io.Devs.rentAProgLang.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.rentAProgLang.business.abstracts.LanguageService;
import kodlama.io.Devs.rentAProgLang.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.rentAProgLang.entities.ProgLanguages;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgLanguages> getAll() {
		
		
		return languageRepository.getAll();
	}

	@Override
	public void add(ProgLanguages language) {
		languageRepository.add(language);
		
	}
	
	

}
