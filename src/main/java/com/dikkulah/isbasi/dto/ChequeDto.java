package com.dikkulah.isbasi.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class ChequeDto implements Serializable {
    private final Integer id;
    private final CommercialDto commercial;
    private final Double price;
}
