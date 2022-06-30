package com.dikkulah.isbasi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Builder
@Table(name = "addresses")
@NoArgsConstructor
@AllArgsConstructor
public class Address { // MÜŞTERİ TEDARİKÇİ ADRES ALANI
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String addressTitle;
    private String fullName;
    private String phoneNumber;
    private String detail;
    private String country;
    private String provide;
    private String district;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "commercial_id", referencedColumnName = "id")
    private Commercial commercial;


}
