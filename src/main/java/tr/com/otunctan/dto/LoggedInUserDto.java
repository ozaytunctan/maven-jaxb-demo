package tr.com.otunctan.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
public class LoggedInUserDto implements Serializable {

    private Long id;

    private String userName;

    private String password;

}
