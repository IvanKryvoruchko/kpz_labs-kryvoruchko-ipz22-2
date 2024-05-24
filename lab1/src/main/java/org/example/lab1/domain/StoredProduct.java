package org.example.lab1.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StoredProduct {
    private Product product;
    private float amount;
    private Date lastArrive;
}
