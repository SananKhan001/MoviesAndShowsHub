package com.payment.service.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "series")
public class Series {
    @Id
    private Long id;

    @Column(name = "movie_name", nullable = false, unique = true)
    private String name;
    @Column(name = "price", nullable = false)
    private int price;
}
