//Bir user birden fazla order verebilir OneToMany
//Bir order içinde birden fazla order item bulunabilir OneToMany
//Bir product birden fazla order itemda yer alabilir
// Bir order item ise yalnızca bir product içerir ManyToOne

package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Order> orders;
}
