package patterns.builder;


import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Builder
@Getter
public class PersonLom {


    @Builder.Default
    private String name = "Andrii";
    private String surname;

    @Builder.Default
    private int age = 90;
    private String email;
    private int weight;
    private Set<Person> parents;
}
