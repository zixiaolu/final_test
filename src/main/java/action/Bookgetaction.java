package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import service.Bookservice;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Bookgetaction extends ActionSupport {
    private Bookservice bookservice;
    private HttpServletRequest request;

    @Override
    public String execute() throws Exception {

        bookservice =new Bookservice();
        request = ServletActionContext.getRequest();
        HttpSession session=request.getSession();
        session.setAttribute("all_book",bookservice.getAllBook());

        return "find_all";
    }
}
