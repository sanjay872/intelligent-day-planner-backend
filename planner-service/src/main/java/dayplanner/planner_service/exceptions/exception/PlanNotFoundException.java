package dayplanner.planner_service.exceptions.exception;

public class PlanNotFoundException extends  RuntimeException{
    public PlanNotFoundException(String message) {
        super(message);
    }
}
