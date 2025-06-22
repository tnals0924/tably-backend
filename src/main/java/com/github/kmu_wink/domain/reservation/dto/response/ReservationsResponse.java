package com.github.kmu_wink.domain.reservation.dto.response;

import com.github.kmu_wink.domain.reservation.dto.internal.ReservationDto;
import lombok.Builder;

import java.util.Collection;

@Builder
public record ReservationsResponse(

        Collection<ReservationDto> reservations
) {

}
