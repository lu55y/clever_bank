package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.enums.TransactionType;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private int id;
    private TransactionType type;
    private Date transactionTime;
    private int senderAccountId;
    private int beneficiaryAccountId;
    private BigDecimal amount;

}
