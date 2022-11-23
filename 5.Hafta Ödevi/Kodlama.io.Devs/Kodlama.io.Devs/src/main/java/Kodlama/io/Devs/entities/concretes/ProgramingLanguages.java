package Kodlama.io.Devs.entities.concretes;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "programingLanguages")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgramingLanguages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "programingLanguages")
    private List<Technology> technologies;

}

/*    Her entity için eğer kullanacaksak bir Repository'miz olacak.Fakat o entity üzerinden
     bir işlemimiz yoksa repository'sini yazmak zorunda değiliz .                         */
