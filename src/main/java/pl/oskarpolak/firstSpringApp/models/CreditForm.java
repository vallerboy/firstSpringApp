package pl.oskarpolak.firstSpringApp.models;

import lombok.Data;

@Data
public class CreditForm {
    private int salary;
    private int expenses;
    private int creditAmount;
    private int creditTime;
}
