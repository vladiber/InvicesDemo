package io.plainid.invicesdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private Long id;
    @Setter
    @Getter
    private LocalDateTime invoiceDate;
    @Setter
    @Getter
    private String billNumber;
    @Setter
    @Getter
    private LocalDateTime billPeriodFrom;
    @Setter
    @Getter
    private LocalDateTime billPeriodTo;
    @Setter
    @Getter
    private LocalDateTime dueDate;

    @ManyToOne
    @JoinColumn(name = "status_id")
    @Setter
    @Getter
    private Status status;

    @ManyToOne
    @JoinColumn(name = "payment_mode_id")
    @Setter
    @Getter
    private PaymentMode paymentMode;

//    @ManyToOne
//    @JsonIgnore
//    @JoinColumn(name = "account_id")
//    @Setter
//    @Getter
//    private Account account;


}