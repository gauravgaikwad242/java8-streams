package com.streams.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public
class Product {
    int price;
    @EqualsAndHashCode.Include
    String name;

}