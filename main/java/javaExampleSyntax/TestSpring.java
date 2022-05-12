package javaExampleSyntax;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        JavaSyntax javaSyntax = context.getBean("javasyntax", JavaSyntax.class);
        System.out.println(javaSyntax.getName());
        context.close();
    }
}
