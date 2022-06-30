package com.dikkulah.isbasi.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "banks")
public class Bank {
    // MÜŞTERİ TEDARİKÇİ VE PARA SEKMESİNDEKİ BANKA BİLGİLERİNİ ORTAK BİR MODELE İNDİRGEYEMEDİM
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String bankName;
    private String branchName;
    private String branchCode;
    private String authorizedPerson; //para
    private String telNo;  //para
    //private List<BankAccount> bankAccountList;


}
