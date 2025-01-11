package dayplanner.planner_service.serviceImpl;

import dayplanner.planner_service.entity.Plan;
import dayplanner.planner_service.exceptions.exception.PlanNotFoundException;
import dayplanner.planner_service.repository.PlanRepository;
import dayplanner.planner_service.service.PlannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PlannerServiceImpl implements PlannerService {

    private final PlanRepository planRepository;

    @Autowired
    public PlannerServiceImpl(PlanRepository planRepository){
        this.planRepository=planRepository;
    }

    @Override
    @Transactional
    public long createPlan(Plan plan) {
        return planRepository.save(plan).getId();
    }

    @Override
    public Plan getPlanById(long id) {
        Optional<Plan> plan=planRepository.findById(id);
        if(plan.isPresent()){
            return plan.get();
        }
        throw new PlanNotFoundException("Plan of id: "+id+" not found");
    }

    @Override
    public List<Plan> getPlanByUserId(long id) {
        return planRepository.findAllByUserId(id);
    }

    @Override
    @Transactional
    public void updatePlan(Plan plan) {
        Optional<Plan> existingPlan=planRepository.findById(plan.getId());
        if(existingPlan.isPresent()){
                planRepository.save(plan);
        }
        else{
            throw new RuntimeException("Update Failed!");
        }
    }

    @Override
    public void deletePlanById(long id) {
        Optional<Plan> existingPlan=planRepository.findById(id);
        if(existingPlan.isPresent()){
            planRepository.delete(existingPlan.get());
        }
        else{
            throw new RuntimeException("Delete Failed!");
        }
    }
}
