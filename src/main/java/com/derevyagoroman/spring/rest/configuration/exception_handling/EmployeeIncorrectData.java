package com.derevyagoroman.spring.rest.configuration.exception_handling;

public class EmployeeIncorrectData {
    private String info;

    public EmployeeIncorrectData(){

    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
