package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DopInfo {
    @Id
    @GeneratedValue
    private Long id;

    private String phone;

    private String email;
}
