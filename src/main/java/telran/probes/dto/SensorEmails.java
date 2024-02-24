package telran.probes.dto;
import jakarta.validation.constraints.NotNull;
public record SensorEmails(@NotNull(message="missing sensor id value")long id, String[]mails) {

}
