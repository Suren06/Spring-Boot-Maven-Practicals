package com.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String userId;
    private String userEmail;
    private String userMobile;
    private String userAddress;
    private String passportId;
    private Date dob;
    private Date createdDate;
    private String createdBy;
    private Boolean isActive;
}
