package controllers;

import model.TestSupervisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import repositories.TestSupervisorRepository;

import java.util.List;

@RestController
public class TestSupervisorController {

    private final TestSupervisorRepository testSupervisorRepository;

    @Autowired
    public TestSupervisorController(TestSupervisorRepository testSupervisorRepository) {
        this.testSupervisorRepository = testSupervisorRepository;
    }

    @RequestMapping(path = "/supervisors", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    List<TestSupervisor> getAllTestSupervisors() {
        return testSupervisorRepository.findAll();
    }
}