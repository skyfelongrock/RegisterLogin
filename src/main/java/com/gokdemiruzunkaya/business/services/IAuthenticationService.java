package com.gokdemiruzunkaya.business.services;

import com.gokdemiruzunkaya.business.dto.UserDto;

public interface IAuthenticationService {

    String loginReturnJwt(UserDto userDto);
}
