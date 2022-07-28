package uz.ml.delivering_rest.entity.entity;

import lombok.*;
import uz.ml.delivering_rest.entity.Auditable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Region extends Auditable {
    @Column(unique = true)
    private String name;
    private String otherFields;

    @ManyToMany(mappedBy = "regions",fetch = FetchType.EAGER)
    private List<Carrier> carrier;
}
