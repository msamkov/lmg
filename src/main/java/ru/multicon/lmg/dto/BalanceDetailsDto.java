package ru.multicon.lmg.dto;

import lombok.Getter;

import java.time.YearMonth;
import java.util.Collections;
import java.util.List;

@Getter
public class BalanceDetailsDto {

    private final long clientId;
    private final YearMonth period;
    private final List<BonusTransactionDto> bonusTransactions;

    public BalanceDetailsDto(final long clientId,
                             final YearMonth period,
                             final List<BonusTransactionDto> bonusTransactions) {
        this.clientId = clientId;
        this.period = period;
        this.bonusTransactions = Collections.unmodifiableList(bonusTransactions);
    }
}
