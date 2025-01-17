package io.plainid.invicesdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @Column(name = "account_number", nullable = false)
    private Integer id;

    @Column(name = "balance")
    private Integer balance;

    @Column(name = "firstname", length = 25)
    private String firstname;

    @Column(name = "lastname", length = 25)
    private String lastname;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender", length = 25)
    private String gender;

    @Column(name = "address", length = 25)
    private String address;

    @Column(name = "employer", length = 25)
    private String employer;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "city", length = 25)
    private String city;

    @Column(name = "state", length = 25)
    private String state;

}