package Kodlama.io.Devs.business.responses.technologyResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTechnologyResponse {
    private int id;
    private String name;
    private int programmingLanguageId;
}
