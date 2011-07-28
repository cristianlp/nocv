package ar.com.imaginatic.nocv.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;



/*@Controller
@RequestMapping("/admin/users*")*/
public class UserController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		Map model =  new HashMap();
		model.put("user1", "juan");
		return new ModelAndView("userList", model);
	}
    

  /*  @Autowired
    public void setUserManager(UserManager userManager) {
      
    }*/

  /*  @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest(@RequestParam(required = false, value = "q") String query) throws Exception {
        return new ModelAndView("admin/userList", "userlist", null);
    }*/
}
