package entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class User {
    private int id;
    private String name;
    private Status status;

    public User(int id, String name, Status status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
}
