package com.autolog.croods.autolog_croods_b05;

import java.util.Date;

/**
 * Created by CROODS on 4/7/2016.
 */
public class AddNewTableData {

    public int Id;
    public String RegisterNumber ;
    public int OdometerValue;
    public Date RegistraionExpDate;
    public Date LastServiceDate;
    public Date CreatedDate;
    public boolean IsActive;

    public AddNewTableData(int id,String registerNumber,int odometerValue,Date registrationExpDate,
                           Date lastServiceDate,Date createdDate,boolean isActive)
    {
        this.Id=id;
        this.RegisterNumber=registerNumber;
        this.OdometerValue=odometerValue;
        this.RegistraionExpDate=registrationExpDate;
        this.LastServiceDate=lastServiceDate;
        this.CreatedDate=createdDate;
        this.IsActive=isActive;
    }

    public void SetRegistrationNumber(String registerNumber)
    {
        this.RegisterNumber=registerNumber;
    }

    public void SetOdometerValue(int odometerValue)
    {
        this.OdometerValue=odometerValue;
    }

    public void SetRegistrationExpDate(Date registraionExpDate)
    {
        this.RegistraionExpDate=registraionExpDate;
    }

    public void SetLastServiceDate(Date lastServiceDate)
    {
        this.LastServiceDate=lastServiceDate;
    }

    public void SetCreatedDate(Date createdDate)
    {
        this.CreatedDate=createdDate;
    }

    public void SetISActive(boolean isActive)
    {
        this.IsActive=isActive;
    }

}
