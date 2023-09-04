package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int id;
    private String accountNumber;
    private int bankId;
    private int userId;
    private BigDecimal accountBalance;
    private Date createdOn;
    //    private Currency currency;
}
