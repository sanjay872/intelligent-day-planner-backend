package dayplanner.planner_service.service;

import dayplanner.planner_service.entity.Plan;

import java.util.List;

public interface PlannerService {
    long createPlan(Plan plan);
    Plan getPlanById(long id);
    List<Plan> getPlanByUserId(long id);
    void updatePlan(Plan planDto);
    void deletePlanById(long id);
}