package com.epam.xml.dao;

import com.epam.xml.entity.Bus;

import java.sql.SQLException;
import java.util.Collection;

public interface BusDAO {
    public void addBus(Bus bus) throws SQLException;
    public void updateBus(Long bus_id, Bus bus) throws SQLException;
    public Bus getBusById(Long bus_id) throws SQLException;
    public Collection getAllBusses() throws SQLException;

}
