package com.dikkulah.isbasi.model;

import com.dikkulah.isbasi.model.enums.CommercialType;
import com.dikkulah.isbasi.model.enums.FirmType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@Table(name = "commercials")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Commercial { // MÜŞTERİ TEDARİKÇİ
    private FirmType firmType;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private CommercialType commercialType;

    private String name; // bireysel
    private String surname; // bireysel
    private String title;
    private String shortTitle;
    private Long tcNo; // bireysel
    private String taxNo;
    private String taxAdministration;
    private Double openingBalance;
    private Date openingBalanceDate;
    private String currency;
    private String category;
    private String explanation;
    private Boolean isActive;
    private Boolean isKDV; // eğer kapalı ise stopaj ve ek-vergi kapanmalı
    private Boolean isStoppage;
    private Boolean isAdditionalTax;
    @JsonManagedReference
    @OneToMany(mappedBy = "commercial")
    private List<Contact> contacts;

    @JsonManagedReference
    @OneToMany(mappedBy = "commercial")
    private List<Person> relatedPersons;

    @JsonManagedReference
    @OneToMany(mappedBy = "commercial")
    private List<Address> otherAddresses;



    @JsonManagedReference
    @OneToMany(mappedBy = "commercial")
    private List<Cheque> cheques;



    // private List<BankAccount> bankAccounts;
    // private List<Transaction> transactions;


}