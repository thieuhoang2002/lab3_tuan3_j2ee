package springframework.guru.service;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
public interface DogService {
        
        void addADog(String name, LocalDate rescued, Boolean vaccinated);
        
        void deleteADOG(String name, Long id);
        
        List atriskdogs(LocalDate rescued);
        
        long getGeneratedKey(String name, LocalDate rescued, Boolean vaccinated);
        
}