package model.dao;

import model.dao.impl.DepartamentDaoImpl;
import model.dao.impl.SellerDaoImpl;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoImpl();
    };

    public static DepartamentDao createDepartamentDao(){
        return new DepartamentDaoImpl();
    }
}
