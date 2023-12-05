package repository;

import model.Contractor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContractorRepository extends MongoRepository<Contractor,String> {
}
