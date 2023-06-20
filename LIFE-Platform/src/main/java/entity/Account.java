package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue
    private Long id;

    private String login;

    private String password;

    private Roles role;

    private String firstName;

    private String secondName;

    private String thirdName;

    private LocalDate birthday;

    private DopInfo idDopInfo;

}
