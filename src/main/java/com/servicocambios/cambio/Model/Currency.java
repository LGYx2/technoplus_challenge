package com.servicocambios.cambio.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="currency")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Currency {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double baseValue;
    private String baseCode;
    private String targetCode;
    private Double exchangeRate;

    
}
