package Kodlama.io.Devs.business.requests.technologyRequests;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTechnologyRequest {
    private int Id;
    private String name;
    private int programingLanguagesId;
}
