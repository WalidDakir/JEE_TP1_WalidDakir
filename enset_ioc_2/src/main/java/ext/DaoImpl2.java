package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
       System.out.println("Version Capteurs");
       double temp;
        temp = 8000;
        return temp;
    }
    
}
