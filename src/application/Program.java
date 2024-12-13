package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //Instanciando o SellerDao com factory
        SellerDao sellerDao = DaoFactory.createSellerDao();


        System.out.println("=== TESTE 1: vendedor encontrado pelo ID ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();

        System.out.println("=== TESTE 2: vendedor encontrado pelo Departamento ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("=== TESTE 3: todos os vendedores encontrados ===");
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("=== TESTE 4: Inserindo vendedor ===");
        Seller newSeller = new Seller(null, "Pedro", "pedro@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserido com sucesso! Novo id = " + newSeller.getId());

        System.out.println();

        System.out.println("=== TESTE 5: Atualizar vendedor ===");
        seller = sellerDao.findById(1);
        seller.setName("João");
        sellerDao.update(seller);
        System.out.println("Atualizado com sucesso!");

        System.out.println();

        System.out.println("=== TESTE 6: Deletar vendedor ===");
        sellerDao.deleteById(11);
        System.out.println("Deletado com sucesso!");
    }
}