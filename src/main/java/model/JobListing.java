package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document("Jobs")
public class JobListing {
    @Id
    private String id;
    private String description;
    private String pay;
    private Employer employer;
    private Date createdAt;

}
