package com.github.kmu_wink.domain.user.dto.response;

import com.github.kmu_wink.domain.user.dto.internal.UserDto;
import lombok.Builder;

import java.util.Collection;

@Builder
public record UsersResponse(

        Collection<UserDto> users
) {

}
