package com.cydeo.entity;


import com.cydeo.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // this annotation leave postgrese to create primary key for us
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDate createdDate;        // every payment have a created date (when customer made the payment)

    private BigDecimal amount;

    @Enumerated(EnumType.STRING) // we want to see enum asa string if need number we use ORDINAL
     private Status paymentStatus;

//    @OneToOne(cascade = CascadeType.ALL)
    @OneToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "payment_detail_id")
    private PaymentDetail paymentDetail;

    @ManyToOne
    private Merchant merchant;


    public Payment(LocalDate createdDate, BigDecimal amount, Status paymentStatus) {   // we need constractor since we will create some objects in DataGenerator manualy
        this.createdDate = createdDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }
}
