package com.bit.bo;

public class LoginValidatorBO {

	public boolean validate(String userName, String password) {
		if ((userName != null && userName.equals("bharath"))
				&& (password != null && password.equals("bharath"))) {
			return true;
		}
		return false;
	}

}
