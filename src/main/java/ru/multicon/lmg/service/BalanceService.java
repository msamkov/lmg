package ru.multicon.lmg.service;

import ru.multicon.lmg.dto.BalanceDetailsDto;
import ru.multicon.lmg.dto.BalanceTotalDto;
import ru.multicon.lmg.model.type.BonusCurrency;

import java.time.YearMonth;

public interface BalanceService {

    BalanceDetailsDto getBalanceDetails(YearMonth period, BonusCurrency bonusCurrency, long clientId);
    BalanceTotalDto getBalanceTotal(BonusCurrency bonusCurrency, long clientId);
}
