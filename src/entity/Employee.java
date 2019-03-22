package entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
//@RequiredArgsConstructor
public class Employee {

    public static final Employee EMPTY_EMPLOYEE = new Employee();
    private int id;
    private String firstName;
    private String lastName;

}
