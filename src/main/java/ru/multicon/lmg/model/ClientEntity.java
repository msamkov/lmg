package ru.multicon.lmg.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Клиент
 */
@Data
@Entity
@Table(name = "clients")
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {

    /**
     *  Уникальный идентификатор
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Имя
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * Фамилия
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * Отчество
     */
    @Column(name = "middle_name")
    private String middleName;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<BonusCardEntity> bonusCards = new ArrayList<>();
}
