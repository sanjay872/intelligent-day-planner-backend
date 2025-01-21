package dayplanner.planner_service.controller;

import dayplanner.planner_service.dto.PlanDto;
import dayplanner.planner_service.dtoService.PlannerDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/plan")
@CrossOrigin("*")
public class PlannerController {

    private final PlannerDtoService plannerDtoService;

    @Autowired
    public PlannerController(PlannerDtoService plannerDtoService){
        this.plannerDtoService=plannerDtoService;
    }

    @PostMapping()
    public ResponseEntity<Long> createPlan(@RequestBody PlanDto planDto){
        return new ResponseEntity<>(plannerDtoService.createPlan(planDto),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlanDto> getPlan(@PathVariable long id){
        return new ResponseEntity<>(plannerDtoService.getPlanById(id), HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<List<PlanDto>> getPlanByUserId(@PathVariable long id){
        return new ResponseEntity<>(plannerDtoService.getPlanByUserId(id),HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity updatePlan(@RequestBody PlanDto planDto){
        plannerDtoService.updatePlan(planDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletePlan(@PathVariable long id){
        plannerDtoService.deletePlanById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/user/{id}/date")
    public ResponseEntity<List<PlanDto>> getPlanByDate(@PathVariable("id") long id, @RequestParam("date") Date date){
        return new ResponseEntity<>(plannerDtoService.getPlanByUserIdAndDate(id,date),HttpStatus.OK);
    }
}
