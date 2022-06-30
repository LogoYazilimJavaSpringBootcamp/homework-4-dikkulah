package org.dikkulah.dto;

import org.dikkulah.model.enums.CommercialType;
import org.dikkulah.model.enums.FirmType;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
public class CommercialDto implements Serializable {
    private final FirmType firmType;
    private final Integer id;
    private final CommercialType commercialType;
    private final String name;
    private final String surname;
    private final String title;
    private final String shortTitle;
    private final Long tcNo;
    private final String taxNo;
    private final String taxAdministration;
    private final Double openingBalance;
    private final Date openingBalanceDate;
    private final String currency;
    private final String category;
    private final String explanation;
    private final Boolean isActive;
    private final Boolean isKDV;
    private final Boolean isStoppage;
    private final Boolean isAdditionalTax;
    private final List<ChequeDto> cheques;
}
