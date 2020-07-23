package test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.OrderWith;
import org.launchcode.techjobs_oo.Job;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {

    @Before
    public void setup() {
        Job job1 = new Job();
        Job job2 = new Job();
        Job job3 = new Job("Woodworker");
    }

    @Test //test first and second instantiation, ID = 1 and 2
    public void emptyConstructor() {
        assertEquals(1, job1.getId());
        assertEquals(2, job2.getId());
        assertEquals(3, job3.getId());
        assertEquals("Woodworker", job3.getName());
    }

    @Test
    public void testSettingJobId() {

    }

    @Test
    public void testJobConstructorSetsAllFields() {

    }
}

