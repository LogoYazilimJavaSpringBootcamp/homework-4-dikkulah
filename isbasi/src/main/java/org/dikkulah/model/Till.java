package org.dikkulah.model;


import lombok.*;

import javax.persistence.*;
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
    private Long openingBalance;
    private LocalDate openingBalanceDate;
    private Boolean isActive;


}
