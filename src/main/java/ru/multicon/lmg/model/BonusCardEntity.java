package ru.multicon.lmg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.multicon.lmg.model.type.BonusCurrency;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *  бонусные карты
 */
@Data
@Entity
@Table(name = "bonus_cards")
@AllArgsConstructor
@NoArgsConstructor
public class BonusCardEntity {

    /**
     *  уникальный идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Код бонусной валюты
     */
    @Column(name = "bonus_currency", nullable = false)
    @Enumerated(EnumType.STRING)
    private BonusCurrency bonusCurrency;

    /**
     * Номер карты
     */
    @Column(name = "number", nullable = false)
    private String number;

    /**
     * клиент
     */
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "client_id")
    private ClientEntity client;


}
