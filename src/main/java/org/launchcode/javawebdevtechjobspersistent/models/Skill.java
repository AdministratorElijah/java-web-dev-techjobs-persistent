package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message="Description cannot be blank.")
    @Size(max=255, message="Description cannot be longer than 255 characters.")
    private String description;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs;

    public Skill() {}

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<Job> getJobs() { return jobs; }

    public void setJobs(List<Job> jobs) { this.jobs = jobs; }
}