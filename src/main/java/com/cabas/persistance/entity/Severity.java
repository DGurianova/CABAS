package com.cabas.persistance.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.lang.reflect.Type;

@Table(name = "severity")
@Getter
@ToString
public enum Severity {
    GREEN,
    YELLOW,
    ORANGE,
    RED;

    Severity() {
    }
}

