package uz.salikhdev.springbootinfinity.config;

public class Second {

  @Bean
  public String a(){
    return "hekki";
  }

  public String login(){
    return "Login";
  }


  public String logout(){
      return "logout";
  }

  public String forgot(){
      return "forgot";
  }

  public String register(){
    return "register";
  }

}
