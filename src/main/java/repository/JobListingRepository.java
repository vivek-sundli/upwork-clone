package repository;

import model.JobListing;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobListingRepository extends MongoRepository<JobListing,String> {
}
