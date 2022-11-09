package liga.medical.core.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "exception")
@AllArgsConstructor
@NoArgsConstructor
public class Exception {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "uuid")
    private long uuid;

    @Column(name = "system_type_id")
    private int systemTypeId;

    @Column(name = "method_params")
    private String methodParams;
}
