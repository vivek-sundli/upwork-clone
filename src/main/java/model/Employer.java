package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Employer")
public class Employer {
    @Id
    private String id;
    private String name;

    @Override
    public String toString() {
        return "Employer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", jobs=" + jobs +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobListing getJobs() {
        return jobs;
    }

    public void setJobs(JobListing jobs) {
        this.jobs = jobs;
    }

    private JobListing jobs;
}
