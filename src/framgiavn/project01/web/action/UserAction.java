package framgiavn.project01.web.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import framgiavn.project01.web.business.UserBusiness;
import framgiavn.project01.web.model.User;

public class UserAction extends ActionSupport {

  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  // private Logit2 log = Logit2.getInstance(UserAction.class);

  private UserBusiness      userBusiness     = null;
  private User              user             = null;

  public void setUserBusiness(UserBusiness userBusiness) {

    this.userBusiness = userBusiness;
  }

  public User getUser() {

    return user;
  }

  public void setUser(User user) {

    this.user = user;
  }

  public String findByUserId() {

    try {
      user = userBusiness.findByUserId(user.getUserId());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return SUCCESS;
  }

  public String findByUsername() {

    try {
      user = userBusiness.findByUsername(user.getUsername());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return SUCCESS;
  }

  public String findByEmail() {

    try {
      user = userBusiness.findByEmail(user.getEmail());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return SUCCESS;
  }

  public String checkLogin() {

    try {
      user = userBusiness.checkLogin(user);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return SUCCESS;
  }

  public String signup() {
      
     user.setCreatedAt(new Date());
      try {
        userBusiness.signup(user);
      } catch (Exception e) {
        e.printStackTrace();
      }
      return SUCCESS;
  }

  public String homePage() {

    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    return SUCCESS;
  }

  public String getSuccess() {

    return SUCCESS;
  }

//  public void validate() {
//
//    if (user != null) {
//      if ("tuantuan".equals(user.getUsername())) {
//        addActionMessage("You are valid user!");
//      } else {
//        addActionError("I don't know you, dont try to hack me!");
//      }
//    }
//  }
}
