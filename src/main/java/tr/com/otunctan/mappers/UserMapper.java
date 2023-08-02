package tr.com.otunctan.mappers;

import org.mapstruct.Mapper;
import tr.com.otunctan.dto.LoggedInUserDto;
import tr.com.otunctan.entity.User;

@Mapper()
public interface UserMapper {

    User loggedInUserDtoToUser(LoggedInUserDto loggedInUserDto);
}
