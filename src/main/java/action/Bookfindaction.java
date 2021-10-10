package action;

import com.opensymphony.xwork2.ActionSupport;
import dto.Book;
import org.apache.struts2.ServletActionContext;
import service.Bookservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Bookfindaction extends ActionSupport {
    
    private Bookservice bookservice;

    private HttpServletRequest request;
    
    public String execute() throws Exception {

        request= ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String bkname=request.getParameter("book_name");
        bookservice=new Bookservice();
        Book result=bookservice.getBookByName(bkname);
        session.setAttribute("book_info",result);
        return "find_one";
    }
}
