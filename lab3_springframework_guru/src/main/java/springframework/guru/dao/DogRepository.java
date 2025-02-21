package springframework.guru.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springframework.guru.model.Dog;
@Repository
public interface DogRepository extends CrudRepository<Dog,Long> {
        
        Dog findByName(String name);
}