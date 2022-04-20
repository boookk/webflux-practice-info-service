package com.boookk.webfluxpracticeinfoservice;

public class InfoService {
    private String job = "";

    public InfoService() {}

    public InfoService(String job) {
        this.job = job;
    }

    public String getJob() {
        return this.job;
    }
}
