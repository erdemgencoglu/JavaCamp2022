package kodlama.io.rentACar.configuration.core.utilties.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice//Tüm Controller @ExceptionHandlerdan geçme zorunda
public class ExceptionHandlers {

    @ExceptionHandler
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ProblemDetails handleBusinessException(BusinessException businessException) {
        ProblemDetails problemDetails = new ProblemDetails(businessException.getMessage());
        return problemDetails;
    }

    @ExceptionHandler
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ProblemDetails handleValidationException(MethodArgumentNotValidException validException) {
        ValidationProblemDetails validationProblemDetails = new ValidationProblemDetails();
        validationProblemDetails.setMessage("Validation Error");
        validationProblemDetails.setValidationErros(new HashMap<String, String>());
        for (FieldError fieldError : validException.getBindingResult().getFieldErrors()) {
            validationProblemDetails.getValidationErros().put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return validationProblemDetails;
    }
}
