package com.webupload.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.webupload.model.UserAccount;
import com.webupload.service.IndexService;

@Controller
@Scope("prototype")
@SuppressWarnings("serial")
public class IndexAction extends ActionSupport {

	@Resource
	private IndexService indexService;
	
	private String name;
	private String password;
	private List<UserAccount> uas;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserAccount> getUas() {
		System.out.println("getUas");
		return uas;
	}
	
	public void setUas(List<UserAccount> uas) {
		System.out.println("setUas");
		this.uas = uas;
	}

	public String login(){
		if(name!=null&&password!=null&&indexService.login(name, password)){
			uas = indexService.getAllUserList();
			return SUCCESS;
		}
		return ERROR;
	}
}
