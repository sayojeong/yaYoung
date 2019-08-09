package swdo.team4.yayoung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import swdo.team4.yayoung.dao.LoginDao;

@Controller
public class LoginController {

	@Autowired
	LoginDao dao;
	
}
