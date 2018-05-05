package cn.cinling.srv.controller;

import cn.cinling.srv.model.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController extends BaseController {
    @RequestMapping("/")
    public String Home() {
        return "index";
    }

    @RequestMapping("/index")
    public String Index() {
        return Home();
    }

    @RequestMapping("/get-menu")
    @ResponseBody
    public String GetMenu() {
        return Menu.GetInstance().GetMenuJSONObject().toJSONString();
    }
}
