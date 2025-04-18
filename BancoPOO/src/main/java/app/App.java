package app;

import model.EmpregadoModel;
import persistence.EmpregadoDao;

public class App {
    public static void main(String[] args){
        EmpregadoDao dao = new EmpregadoDao();
        EmpregadoModel empregado = new EmpregadoModel("Elton Kasesky", "Desenvolvedor", 15000.0);
        dao.inserir(empregado);
    }
}
