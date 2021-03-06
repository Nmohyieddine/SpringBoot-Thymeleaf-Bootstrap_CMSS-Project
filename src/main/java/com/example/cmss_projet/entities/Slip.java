package com.example.cmss_projet.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Data @NoArgsConstructor  @AllArgsConstructor @ToString
public class Slip  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long slipCode;
    public String contractedCode;
    public String ContractedName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate ReceptionDate;
    @Min(2)
    public Integer MonthSlip;
    public int YearSlip;
    public float TotalAmount;
    public float TotalAmountNet;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate ChangeDate;
    public LocalDate SendContability;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate SendAssistantDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public LocalDate BackAssistantDate;
    @Column(columnDefinition = "integer default 0")
    public int status;
    @Column(columnDefinition = "integer default 0")
    public int statusPaiement;
    public int Numerocheque;






}
