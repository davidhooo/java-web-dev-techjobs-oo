package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        // Checking if Job object is empty (ie. No arg constructor)
        if (this.name == null) return "OOPS! This job does not seem to exist.";

        // Declaring variables needed for final return string
        int jobId = this.getId();
        String jobName = this.getName();
        String jobEmployer = this.getEmployer().getValue();
        String jobLocation = this.getLocation().getValue();
        String jobPositionType = this.getPositionType().getValue();
        String jobCoreCompetency = this.getCoreCompetency().getValue();

//        // Checking if Job object has name but NoArg Constructors for all other Objects
//        if (jobEmployer == null
//                && jobLocation == null
//                && jobPositionType == null
//                && jobCoreCompetency == null) return "OOPS! This job does not seem to exist.
//                Name exist though so that's something.";

        // Changing variables to different string if no data is available
        if (jobName == null) jobName = "Data not available";
        if (jobEmployer == null) jobEmployer = "Data not available";
        if (jobLocation == null) jobLocation = "Data not available";
        if (jobPositionType == null) jobPositionType = "Data not available";
        if (jobCoreCompetency == null) jobCoreCompetency = "Data not available";

        // Building the string from data pulled from all fields
        return "ID:   " + jobId
                + "\nName:   " + jobName
                + "\nEmployer:   " + jobEmployer
                + "\nLocation:   " + jobLocation
                + "\nPosition Type:   " + jobPositionType
                + "\nCore Competency:   " + jobCoreCompetency + "\n\n";
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;    //casting!
        return this.id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setEmployer(Employer employer) {
        this.employer = employer;
    }


    public void setLocation(Location location) {
        this.location = location;
    }


    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }


    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
