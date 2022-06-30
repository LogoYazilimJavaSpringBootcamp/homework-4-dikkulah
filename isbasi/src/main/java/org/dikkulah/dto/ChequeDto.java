package org.dikkulah.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChequeDto implements Serializable {
    private final Integer id;
    private final CommercialDto commercial;
    private final Double price;
}
