/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author brook
 */


public class TaskManagerTest {
    private TaskManager taskManager;

    @Before
    public void setUp() {
        // Initialize the task manager (use your actual constructor)
        taskManager = new TaskManager();
    }

    @Test
    public void testAddTask() {
        // Add tasks based on the provided test data
        taskManager.addTask("Mike Smith", "Create Login", 5, "To Do");
        taskManager.addTask("Edward Harrison", "Create Add Features", 8, "Doing");
        taskManager.addTask("Samantha Paulson", "Create Reports", 2, "Done");
        taskManager.addTask("Glenda Oberholzer", "Add Arrays", 11, "To Do");

        // Verify the number of tasks
        Assert.assertEquals(4, taskManager.getNumTasks());
    }

    @Test
    public void testSearchTaskByName() {
        // Search for a task by name
        Task foundTask = taskManager.findTaskByName("Create Reports");
        Assert.assertNotNull(foundTask);
        Assert.assertEquals("Samantha Paulson", foundTask.getDeveloper());
        Assert.assertEquals("Done", foundTask.getStatus());
    }

    // Add more test methods for other functionalities (e.g., search by developer, delete task, etc.)
}


