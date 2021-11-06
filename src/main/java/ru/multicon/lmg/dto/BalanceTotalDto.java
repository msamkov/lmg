package ru.multicon.lmg.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.multicon.lmg.model.type.BonusCurrency;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class BalanceTotalDto {

    private final long clientId;
    public final BonusCurrency currency;
    private final BigDecimal total;

}
