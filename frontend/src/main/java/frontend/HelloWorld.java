package main.java.frontend;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import service.SessionBean;

@ManagedBean(name = "helloWorld")
@SessionScoped
public class HelloWorld {

    @EJB
    private SessionBean sessionBean;

    public HelloWorld() {
	System.out.println("Hello world started");
    }

    public String getMessage() {
	return this.sessionBean.print();
    }
}
