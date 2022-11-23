package Kodlama.io.Devs.business.responses.programingLanguagesResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdProgramingLanguagesResponse {
    private int id;
    private String name;
}
