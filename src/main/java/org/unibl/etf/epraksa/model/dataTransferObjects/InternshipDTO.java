package org.unibl.etf.epraksa.model.dataTransferObjects;

import lombok.Data;
import org.unibl.etf.epraksa.model.entities.InternshipType;

import java.time.LocalDateTime;

@Data
public class InternshipDTO {
    private Long internshipId;
    private CompanyDTO company;
    private InternshipType internshipType;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String[] cycles;
    private String description;
    private String details;
    private String schedule;
    private Integer year;
    private Integer workHours;
    private String internshipField;
    private Boolean requiredCV;
    private Boolean requiredLetter;
    private String link;
    private LocalDateTime submissionDue;
    private Boolean isPublished;
    private MentorDTO mentor;
    private String[] courses;
}
