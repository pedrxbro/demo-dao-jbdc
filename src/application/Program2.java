package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program2 {

    public static void main(String[] args){
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("Teste 1 == Inserindo departamento ===");
        Department newDepartment = new Department(null, "Cars");
        departmentDao.insert(newDepartment);
        System.out.println("Novo departamento inserido com sucesso! Id = " + newDepartment.getId() );

        System.out.println();

        System.out.println("Teste 2 == Buscando pelo id ===");
        Department dep = departmentDao.findById(newDepartment.getId());
        System.out.println("Departamento pelo id = " + dep.getId() );
        System.out.println(dep);

        System.out.println();

        System.out.println("Teste 3 == Deletando pelo id ===");
        departmentDao.deleteById(6);
        System.out.println("Deletado com sucesso!");

        System.out.println("Teste 4 == Atualizando departamento ===");
        dep = departmentDao.findById(7);
        dep.setName("Human Resources");
        departmentDao.update(dep);
        System.out.println("Atualizado com sucesso!");

        System.out.println();

        System.out.println("Teste 5 == Listando departamentos ===");
        List<Department> deps = departmentDao.findAll();
        for(Department d : deps){
            System.out.println(d);
        }

    }
}
