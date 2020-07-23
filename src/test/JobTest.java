package test;

import org.junit.After;
import org.junit.runner.OrderWith;
import org.launchcode.techjobs_oo.Job;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {

    @Test //test first and second instantiation, ID = 1 and 2
    public void emptyConstructor() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(1, job1.getId());
        assertEquals(2, job2.getId());
    }

//    @Test //test constructor with one parameter
//    public void oneParameterConstructor() {
//        Job job3 = new Job("Woodworker");
//        assertEquals(1, job3.getId());
//        assertEquals("Woodworker", job3.getName());
//    }
}

