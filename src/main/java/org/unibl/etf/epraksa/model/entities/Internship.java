package org.unibl.etf.epraksa.model.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "internship")
public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InternshipID",
            nullable = false)
    private Long internshipId;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type",
            nullable = false,
            length = 7)
    private InternshipType internshipType;

    @Basic
    @Column(name = "StartDate",
            nullable = false)
    private LocalDate startDate;

    @Basic
    @Column(name = "EndDAte")
    private LocalDate endDate;

    @Basic
    @Column(name = "Cycles",
            nullable = false)
    private String cycles;

    @Basic
    @Column(name = "Description",
            nullable = false)
    private String description;

    @Basic
    @Column(name = "Details",
            nullable = false)
    private String details;

    @Basic
    @Column(name = "Schedule",
            nullable = false)
    private String schedule;

    @Basic
    @Column(name = "Year",
            nullable = false)
    private Integer year;

    @Basic
    @Column(name = "WorkHours",
            nullable = false)
    private Integer workHours;

    @Basic
    @Column(name = "Field",
            nullable = false)
    private String internshipField;

    @Basic
    @Column(name = "CvRequired",
            nullable = false)
    private Boolean requiredCV;

    @Basic
    @Column(name = "LetterRequired",
            nullable = false)
    private Boolean requiredLetter;

    @Basic
    @Column(name = "Link",
            length = 128)
    private String link;

    @Basic
    @Column(name = "SubmissionDue",
            nullable = false)
    private LocalDate submissionDue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CompanyID",
            referencedColumnName = "ID",
            nullable = false)
    private Company company;

    @Basic
    @Column(name = "IsPublished",
            nullable = false)
    private Boolean isPublished;

    @Basic
    @Column(name = "IsAccepted")
    private Boolean isAccepted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MentorID",
            referencedColumnName = "ID",
            nullable = false)
    private Mentor mentor;

    @Basic
    @Column(name = "IsFinished",
            nullable = false)
    private Boolean isFinished;

    @Basic
    @Column(name = "Courses",
            nullable = false)
    private String courses;

    @Basic
    @Column(name = "CreatedAt",
            nullable = false)
    private LocalDate createdAt;

    @Basic
    @Column(name = "LastModifiedDate",
            nullable = false)
    private LocalDate lastModifiedDate;

    @Basic
    @Column(name = "DeletedDate")
    private LocalDate deletedDate;

    @OneToMany(mappedBy = "internship",
            fetch = FetchType.LAZY)
    private List<StudentHasInternship> studentHasInternships;

}
