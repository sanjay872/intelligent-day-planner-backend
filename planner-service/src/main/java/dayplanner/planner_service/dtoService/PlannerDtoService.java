package dayplanner.planner_service.dtoService;

import dayplanner.planner_service.dto.PlanDto;

import java.util.List;

public interface PlannerDtoService {
    long createPlan(PlanDto planDto);
    PlanDto getPlanById(long id);
    List<PlanDto> getPlanByUserId(long id);
    void updatePlan(PlanDto planDto);
    void deletePlanById(long id);
}
