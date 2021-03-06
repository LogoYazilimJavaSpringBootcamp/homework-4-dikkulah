package org.dikkulah.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.dikkulah.model.enums.FirmType;

import javax.persistence.*;
import java.util.List;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private FirmType firmType;


    //    @OneToOne
//    @JoinColumn(name = "address_id")
//    private Address address;
//
    @JsonManagedReference
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Commercial> commercialList;


//    private List<Till> tillList;
//
//    @OneToMany(mappedBy = "user")
//    private List<Cheque> cheques;

//    private List<Bank> bankAccounts;

//    private List<Invoice> purchaseInvoiceList;

//    private List<Invoice> salesInvoiceList;


}
