package com.dikkulah.isbasi.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BankAccount   {

    private String accountName; //para
    private Double openingBalance; //para
    private Double balance; // para
    private LocalDate openingBalanceDate; //para
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String accountNo;
    private String currency;
    private String iban;
    private Boolean isActive;
    private Boolean isCreditCard;



}
