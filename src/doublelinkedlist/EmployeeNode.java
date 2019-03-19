package doublelinkedlist;

import com.sun.istack.internal.NotNull;
import entity.Employee;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class EmployeeNode {

    @NonNull
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

}
