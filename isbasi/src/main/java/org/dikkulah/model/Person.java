package org.dikkulah.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persons")
public class Person { //müşteri tedarikçideki ilişkili kişiler alanı
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String fullName;
    private String telNo;
    private String email;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "commercial_id",referencedColumnName = "id")
    private Commercial commercial;


}
