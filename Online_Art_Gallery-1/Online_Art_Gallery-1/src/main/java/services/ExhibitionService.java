package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Exhibition;
import repository.ExhibitionRepository;

@Service
public class ExhibitionService {
    @Autowired
    private ExhibitionRepository exhibitionRepository;

    public Exhibition saveExhibition(Exhibition exhibition) {
        return exhibitionRepository.save(exhibition);
    }

    public List<Exhibition> getAllExhibitions() {
        return exhibitionRepository.findAll();
    }
}
