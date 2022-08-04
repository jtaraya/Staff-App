package models;


import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void NewDepartmentObjectGetsCorrectlyCreated_true() throws Exception {
        Department department =  new Department("RIO");
        assertEquals(true, department instanceof Department);
    }

    @Test
    public void DepartmentInstantiatesWithName_true() throws Exception {
        Department department = new Department("RIO");
        assertEquals("RIO", department.getName());
    }

    @Test
    public void getCreatedAtInstantiatesWithCurrentTimeToday() throws Exception {
        Department department = new Department("RIO");
        assertEquals(LocalDateTime.now().getDayOfWeek(), department.getCreatedAt().getDayOfWeek());
    }

}
