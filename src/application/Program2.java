package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args){
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        //Teste 1 == Atualizando departamento
        Department newDepartment = new Department(null, "Cars");
        departmentDao.insert(newDepartment);
        System.out.println("Novo departamento inserido com sucesso! Id = " + newDepartment.getId() );
    }
}
