package com.api.parkingcontrol.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


/*  Tornar a Classe ParkingSpotModel em uma Entidade(tabela na BD) */
@Entity
@Table(name = "TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    /* The id information will be generated automatically */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    /* indication about parking number */
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    /* indication about car plate */
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    /* indication about car brand */
    @Column(nullable = false, length = 70)
    private String brandCar;
    /* indication about car model */
    @Column(nullable = false, length = 70)
    private String modelCar;
    /* indication about car color */
    @Column(nullable = false, length = 70)
    private String colorCar;
    /* indication about Date and time from register */
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    /* Owner or renter name of the apartment*/
    @Column(nullable = false, length = 130)
    private String responsibleName;
    /* indication of the apartment to which the parking space belongs  */
    @Column(nullable = false, length = 30)
    private String apartment;
    /* indication of the apartment block to which the parking space belongs */
    @Column(nullable = false, length = 10)
    private String block;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
