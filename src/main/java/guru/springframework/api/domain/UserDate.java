package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDate {
    private String date;
    private Integer timezone_type;
    private String timezone;
}
