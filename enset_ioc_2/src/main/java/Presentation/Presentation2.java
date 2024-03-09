package Presentation;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import dao.IDao;
import metier.IMetier;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("enset_ioc_2\\config.txt"));

        String daoClassName = scanner.nextLine();
        Class<?> cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();

        Method method = cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier, dao);

        System.out.println("Resultat=>" + metier.calcul());
        
        scanner.close();
    }
}
