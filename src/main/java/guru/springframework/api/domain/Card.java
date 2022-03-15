package guru.springframework.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {
    private String type;
    private String number;
    private UserDate expirationDate;
    private String iban;
    private String swift;
}
