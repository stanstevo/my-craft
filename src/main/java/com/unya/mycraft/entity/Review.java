package com.unya.mycraft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userName;
    private String userEmail;
    private String comment;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "review_id")
    private Craftsman craftsman;
}
