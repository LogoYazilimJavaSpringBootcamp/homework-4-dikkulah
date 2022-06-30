package com.dikkulah.isbasi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cheques")
public class Cheque { //ÇEK

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "commercial_id",referencedColumnName = "id")
    private Commercial commercial;
    private Double price;
    private Date transactionDate;
    private Date chequeDate;


//    @ManyToOne
//    @JoinColumn(name = "user_id",referencedColumnName = "id")
//    private User user;

   // private List<Invoice> relatedInvoices;



}
