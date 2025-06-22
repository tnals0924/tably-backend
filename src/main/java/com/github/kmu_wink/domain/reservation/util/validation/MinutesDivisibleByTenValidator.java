package com.github.kmu_wink.domain.reservation.util.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalTime;

public class MinutesDivisibleByTenValidator implements ConstraintValidator<MinutesDivisibleByTen, LocalTime> {

    @Override
    public boolean isValid(LocalTime value, ConstraintValidatorContext context) {

        if (value == null) {
            return true;
        }

        return value.getMinute() % 10 == 0;
    }
}