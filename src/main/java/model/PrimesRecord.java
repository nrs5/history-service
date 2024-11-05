package model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table
public class PrimesRecord {
    @Id
    @GeneratedValue
    private int id;

    private String customer;
    private String n;
    private boolean isPrime;

    public int getId(){return id;}
}
