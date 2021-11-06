package ru.multicon.lmg.service.impl;

import org.springframework.stereotype.Service;
import ru.multicon.lmg.dto.BalanceDetailsDto;
import ru.multicon.lmg.dto.BalanceTotalDto;
import ru.multicon.lmg.model.type.BonusCurrency;
import ru.multicon.lmg.service.BalanceService;

import java.time.YearMonth;

@Service
public class BalanceServiceImpl implements BalanceService {

    @Override
    public BalanceDetailsDto getBalanceDetails(YearMonth period, BonusCurrency bonusCurrency, long clientId) {
        return null;
    }

    @Override
    public BalanceTotalDto getBalanceTotal(BonusCurrency bonusCurrency, long clientId) {
        return null;
    }
}
