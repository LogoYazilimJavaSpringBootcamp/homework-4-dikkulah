package org.dikkulah.model;


import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tills")
public class Till {//KASA
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private String currency;
    private Double openingBalance;
    private Date openingBalanceDate;
    private Boolean isActive;


}
