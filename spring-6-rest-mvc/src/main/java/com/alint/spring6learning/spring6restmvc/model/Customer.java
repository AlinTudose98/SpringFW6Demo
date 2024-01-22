package com.alint.spring6learning.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class Customer {
    private UUID id;
    private String customerName;
    private Integer version;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
}

