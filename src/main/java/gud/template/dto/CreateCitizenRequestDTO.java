package gud.template.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class CreateCitizenRequestDTO {
    private String firstName;
    private String Lastname;
    private String email;
    private String dateOfBirth;
    private String phoneNumber;
    private Integer guardianId;

}
