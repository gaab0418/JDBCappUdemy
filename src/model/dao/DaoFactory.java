package model.dao;

import db.DB;
import model.dao.impl.DepartamentDaoImpl;
import model.dao.impl.SellerDaoImpl;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoImpl(DB.getConnection());
    };

    public static DepartamentDao createDepartamentDao(){
        return new DepartamentDaoImpl();
    }
}
