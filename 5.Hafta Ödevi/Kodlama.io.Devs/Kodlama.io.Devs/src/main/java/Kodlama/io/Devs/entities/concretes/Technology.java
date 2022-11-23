package Kodlama.io.Devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "Technology")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "programingLanguagesId")
    private ProgramingLanguages programingLanguages;

}
