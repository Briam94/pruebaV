package com.prueba.test.dto;


public class PersonDto {

    private String lastNames;

    private String email;
    private String names;

    private String idNumber;

    private String idTipe;

    public PersonDto(String lastNames, String email, String names, String idNumber, String idTipe) {
        this.lastNames = lastNames;
        this.email = email;
        this.names = names;
        this.idNumber = idNumber;
        this.idTipe = idTipe;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdType() {
        return idTipe;
    }

    public void setIdType(String idTyoe) {
        this.idTipe = idTyoe;
    }
}
