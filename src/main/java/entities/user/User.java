package entities.user;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class User {
    private final int id;
    private final String name;
    private final UserStatus userStatus;

    public User(int id, String name, UserStatus userStatus) {
        this.id = id;
        this.name = name;
        this.userStatus = userStatus;
    }
}
