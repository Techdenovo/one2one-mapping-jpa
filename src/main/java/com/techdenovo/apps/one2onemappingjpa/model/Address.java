package com.techdenovo.apps.one2onemappingjpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="LOCALITY")
    private String locality;
    @Column(name="CITY")
    private String city;

    @OneToOne(mappedBy = "address")
    private Customer customer;
}
