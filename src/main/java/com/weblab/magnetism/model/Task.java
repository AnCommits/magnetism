package com.weblab.magnetism.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "task")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Task {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "text")
    private String text;

    @Column(name = "userId")
    private long userId;

    @Column(name = "data")
    private Date date;
}
