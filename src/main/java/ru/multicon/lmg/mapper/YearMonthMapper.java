package ru.multicon.lmg.mapper;

import java.sql.Date;
import java.time.Instant;
import java.time.YearMonth;
import java.time.ZoneId;
import javax.persistence.AttributeConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class YearMonthMapper implements AttributeConverter<YearMonth, Date> {

    @Override
    public Date convertToDatabaseColumn(final YearMonth yearMonth) {
        Assert.notNull(yearMonth, "");
        return java.sql.Date.valueOf(yearMonth.atDay(1));
    }

    @Override
    public YearMonth convertToEntityAttribute(final Date dbDate) {
        Assert.notNull(dbDate, "");
        return YearMonth.from(
                Instant
                        .ofEpochMilli(dbDate.getTime())
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate()
        );

    }
}