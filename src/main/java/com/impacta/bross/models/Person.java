package com.impacta.bross.models;

public class Person {
    private double height;
    private double weight;
    private double imc;
    private String imcDescription;
    private String status;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getImcDescription() {
        return imcDescription;
    }

    public void setImcDescription(String imcDescription) {
        this.imcDescription = imcDescription;
    }

    public Person(double height, double weight, double imc, String imcDescription, String status) {
        this.height = height;
        this.weight = weight;
        this.imc = imc;
        this.imcDescription = imcDescription;
        this.status = status;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}