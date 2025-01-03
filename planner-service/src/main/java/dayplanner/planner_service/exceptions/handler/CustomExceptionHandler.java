package dayplanner.planner_service.exceptions.handler;

import dayplanner.planner_service.exceptions.CustomErrorResponse;
import dayplanner.planner_service.exceptions.exception.PlanNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    // For not found exception
    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleNotFoundException(PlanNotFoundException exception){
        CustomErrorResponse res=new CustomErrorResponse();
        res.setStatus(HttpStatus.NOT_FOUND.value());
        res.setMessage(exception.getMessage());
        res.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
    }

    // For all other exceptions
    @ExceptionHandler
    public ResponseEntity<CustomErrorResponse> handleGlobalException(Exception exception){
        CustomErrorResponse res=new CustomErrorResponse();
        res.setStatus(HttpStatus.BAD_REQUEST.value());
        res.setMessage(exception.getMessage());
        res.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(res,HttpStatus.BAD_REQUEST);
    }
}
