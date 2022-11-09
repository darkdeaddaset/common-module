package liga.medical.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "debug")
@AllArgsConstructor
@NoArgsConstructor
public class Debug {
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
