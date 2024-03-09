package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul Calcul;
    @Test
    public void testSomme(){
        Calcul=new Calcul();
        double a=5; double b=6;
        double expected=11;
        double res=Calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
