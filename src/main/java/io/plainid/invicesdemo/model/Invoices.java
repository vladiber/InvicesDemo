package io.plainid.invicesdemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Invoices {


        @Id
        @Setter
        @Getter
        private Long id;

        @Setter
        @Getter
        private String AccountId;
        @Setter
        @Getter
        private String BrandId;
        @Setter
        @Getter
        private Long InvoiceId;
    }

    // Getters and Setters
