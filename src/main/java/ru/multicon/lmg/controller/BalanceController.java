package ru.multicon.lmg.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.multicon.lmg.dto.BalanceDetailsDto;
import ru.multicon.lmg.dto.BalanceTotalDto;
import ru.multicon.lmg.model.type.BonusCurrency;
import ru.multicon.lmg.service.BalanceService;

import java.time.YearMonth;

@RestController
@RequiredArgsConstructor
public class BalanceController {

    private final BalanceService balanceService;

    /**
     *  Получить детализацию по бонусам за месяц
     */
    @GetMapping(value = "/balance/details")
    public BalanceDetailsDto details(@RequestParam YearMonth period,
                                     @RequestParam BonusCurrency currency,
                                     @RequestParam(name = "client_id") long clientId) {
        return balanceService.getBalanceDetails(period, currency, clientId);
    }

    /**
     * Получить текущий баланс бонусов по заданной валюте
     */
    @GetMapping(value = "/balance/total")
    public BalanceTotalDto total(@RequestParam BonusCurrency currency,
                                 @RequestParam(name = "client_id") long clientId) {
        return balanceService.getBalanceTotal(currency, clientId);
    }

}
