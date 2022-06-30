package org.dikkulah.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "contacts")
public class Contact { //müşteri tedarikçideki iletişim alanı
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String addressTitle;
    private String country;
    private String provide;
    private String district;
    private Integer postCode;
    private String email;
    private String faxNo;
    private String phoneNumber1;
    private String phoneNumber2;
    private String website;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "commercial_id", referencedColumnName = "id")
    private Commercial commercial;


}
