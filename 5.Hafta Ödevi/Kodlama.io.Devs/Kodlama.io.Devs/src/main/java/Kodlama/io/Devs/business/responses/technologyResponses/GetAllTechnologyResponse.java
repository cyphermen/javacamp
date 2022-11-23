package Kodlama.io.Devs.business.responses.technologyResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllTechnologyResponse {
    private int id;
    private String name;
    private String programingLanguageName;


}
