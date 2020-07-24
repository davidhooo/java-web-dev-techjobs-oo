package test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.OrderWith;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;
    Job job6;
    Job job7;
    Job job8;

//    Objects are being instantiated again after every test, throwing off ID numbers for testing,
//    also JUNIT runs tests in random order which will also change ID numbers, i have begun just running these tests individually, only god can judge me

//    @Before
//    public void setup() {
//        job1 = new Job();
//        job2 = new Job();
//        job3 = new Job("Product tester",
//                new Employer("ACME"),
//                new Location("Desert"),
//                new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
//    }

    @Test
    public void testSettingJobId() {
        job1 = new Job();
        job2 = new Job();

        assertEquals(1, job1.getId());
        assertEquals(2, job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals(true, job3.getName() instanceof String);
        assertEquals(true, job3.getEmployer() instanceof Employer);
        assertEquals(true, job3.getLocation() instanceof Location);
        assertEquals(true, job3.getPositionType() instanceof PositionType);
        assertEquals(true, job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        job4 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        job5 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertEquals(false, job4.equals(job5));
    }

    @Test
    public void testJobsToStringNoData() {
        job6 = new Job();
        assertEquals("OOPS! This job does not seem to exist.", job6.toString());
    }

    @Test
    public void testJobsToStringSomeData() {
        job7 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType(),
                new CoreCompetency("Persistence"));;
        assertEquals("ID:   1"
                + "\nName:   Product tester"
                + "\nEmployer:   ACME"
                + "\nLocation:   Desert"
                + "\nPosition Type:   Data not available"
                + "\nCore Competency:   Persistence", job7.toString());
    }

    @Test
    public void testJobsNoArgConstructor() {
        job8 = new Job("Product tester",
                new Employer(),
                new Location(),
                new PositionType(),
                new CoreCompetency());

        assertEquals(null, job8.getEmployer().getValue());
        assertEquals(null, job8.getLocation().getValue());
        assertEquals(null, job8.getPositionType().getValue());
        assertEquals(null, job8.getCoreCompetency().getValue());
    }
}

