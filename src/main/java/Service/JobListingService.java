package Service;

import model.JobListing;
import org.springframework.stereotype.Service;
import repository.JobListingRepository;

import java.util.List;

@Service
public class JobListingService {

    private final JobListingRepository jobListingRepository;
    public JobListingService(JobListingRepository jobListingRepository){
        this.jobListingRepository=jobListingRepository;
    }
    public void addJob(JobListing jobListing){
        jobListingRepository.insert(jobListing);
    }
    public List<JobListing> allJobs(){
        return jobListingRepository.findAll();
    }
    public void deleteJob(){}
    public void updateJob(){}
}
