package com.elogroup.demo.controller.model;

import com.elogroup.demo.controller.validation.LeadInsert;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@LeadInsert
public class LeadRequest implements Serializable {

    @NotBlank(message = "Campo Nome não pode ser vazio ou nulo!")
    private String name;

    @NotBlank(message = "Campo Nome não pode ser vazio ou nulo!")
    private String tel;

    @NotBlank(message = "Campo Nome não pode ser vazio ou nulo!")
    private String email;

    public LeadRequest() {
    }

    public LeadRequest(String name, String tel, String email) {
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}