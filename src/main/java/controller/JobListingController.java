package controller;

import Service.JobListingService;
import model.JobListing;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobs")
public class JobListingController {
    private final JobListingService jobListingService;
    public JobListingController(JobListingService jobListingService){
        this.jobListingService=jobListingService;
    }
    @PostMapping("/post")
    public ResponseEntity addJob(@RequestBody JobListing jobListing){
        jobListingService.addJob(jobListing);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/get/all")
    public ResponseEntity getJobs(){
        return ResponseEntity.ok(jobListingService.allJobs());
    }
    public void deleteJob(){}
    public void updateJob(){}
}
