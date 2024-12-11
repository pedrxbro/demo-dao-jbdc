package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        //Instanciando o SellerDao com factory
        SellerDao sellerDao = DaoFactory.createSellerDao();


        System.out.println("=== TESTE 1: vendedor encontrado pelo ID ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}