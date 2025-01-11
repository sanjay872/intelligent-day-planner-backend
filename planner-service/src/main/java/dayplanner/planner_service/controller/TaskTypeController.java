package dayplanner.planner_service.controller;

import dayplanner.planner_service.dto.TaskTypeDto;
import dayplanner.planner_service.dtoService.TaskTypeDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
@CrossOrigin("*")
public class TaskTypeController {


    private final TaskTypeDtoService taskTypeDtoService;

    @Autowired
    TaskTypeController(TaskTypeDtoService taskTypeDtoService){
        this.taskTypeDtoService=taskTypeDtoService;
    }

    @GetMapping()
    public ResponseEntity<List<TaskTypeDto>> getAllTaskType(){
        return new ResponseEntity<>(taskTypeDtoService.getTaskTypes(), HttpStatus.OK);
    }
}
