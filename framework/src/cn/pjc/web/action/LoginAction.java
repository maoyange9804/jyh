package cn.pjc.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.pjc.core.Action;
import cn.pjc.core.ActionForm;
import cn.pjc.core.ActionForward;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(HttpServletRequest arg0,
			HttpServletResponse arg1, ActionForm arg2) {
		
		
		return new ActionForward("aaa");
	}

}
