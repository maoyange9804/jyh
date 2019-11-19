package cn.pjc.web.form;

import cn.pjc.core.ActionForm;

public class LoginForm extends ActionForm{
	private int age;
	
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "LoginForm [age=" + age + "]";
	}




	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}

}
