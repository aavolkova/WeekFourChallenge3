package me.anna.demo.models;


import com.sun.org.glassfish.gmbal.NameValue;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=1, max=50, message = "Must enter your first name.")
    @NameValue
    private String firstName;

    @NotEmpty
    @Size(min=1, max=50, message = "Must enter your last name.")
    @NameValue
    private String lastName;

    @NotEmpty
    @Size(min=1, max=50, message = "Must enter your email address.")
    @Email
    private String emailAddress;

    private ArrayList<Education> educationalAchievements;

    private ArrayList<Employment> workExperience;

    private ArrayList<Skills> skillsWithRating;



    // Setters and Getters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<Education> getEducationalAchievements() {
        return educationalAchievements;
    }

    public void setEducationalAchievements(ArrayList<Education> educationalAchievements) {
        this.educationalAchievements = educationalAchievements;
    }

    public ArrayList<Employment> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(ArrayList<Employment> workExperience) {
        this.workExperience = workExperience;
    }

    public ArrayList<Skills> getSkillsWithRating() {
        return skillsWithRating;
    }

    public void setSkillsWithRating(ArrayList<Skills> skillsWithRating) {
        this.skillsWithRating = skillsWithRating;
    }




}
