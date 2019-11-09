package mvc;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class HelloController {

    @GET
    @Controller
    public String hello() {
        return "hello.jsp";
    }
}
