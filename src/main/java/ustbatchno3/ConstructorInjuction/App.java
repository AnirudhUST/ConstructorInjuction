package ustbatchno3.ConstructorInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import ustbatchno3.DI_SetterInjuction.Roles;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("application1.xml");  
         Roles1 r=context.getBean("ANIRUDH",Roles1.class);
         r.display();
    }
}
