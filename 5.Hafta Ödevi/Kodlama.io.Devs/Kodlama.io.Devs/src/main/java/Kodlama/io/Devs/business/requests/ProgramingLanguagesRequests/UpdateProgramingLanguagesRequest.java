package Kodlama.io.Devs.business.requests.ProgramingLanguagesRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProgramingLanguagesRequest {
    private int id;
    private String name;
}
