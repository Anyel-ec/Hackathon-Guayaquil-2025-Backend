package com.guayaquil.hackathon.models.google;

/*
 * Author: Anyel EC
 * Github: https://github.com/Anyel-ec
 * Creation date: 09/03/2025
 */
import lombok.Data;

@Data
public class Transaction {
    private String merchant;
    private double amount;
    private String timestamp;
}