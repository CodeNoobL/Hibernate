package com.csair.study.springHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 罗昭钦
 * @date 2018年9月18日
 */
public class App {
   
    private static SessionFactory sessionFactory;

    
    public static void main(String[] args) {
        //加载bean
        new ClassPathXmlApplicationContext("beans.xml");
        //session
        Session session = sessionFactory.openSession();
        User user = new User();
        user.setName("luomoumou");
        user.setAge(66);
        session.save(user);
        System.out.println("Appmain is done");
    }
    
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
    public static void setSessionFactory(SessionFactory sessionFactory){
        App.sessionFactory = sessionFactory;
    }
}
