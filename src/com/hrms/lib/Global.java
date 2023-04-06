package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//test steps or Elements  and Objects can be acessed in whole project
	//Test Steps
	public String url="http://183.82.103.245/nareshit/login.php";
	public String usname="nareshit";
	public String password="nareshit";
	public String Lastname="Jada";
	public String Firstname="Naveen";
	
	
	
	//Test Objects
	public String text_Username="txtUserName";
	public String text_Password="txtPassword";
	public String login="Submit";
	public String ramename="rightMenu";
	public String  addbutton="//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
	public String Emplastname="txtEmpLastName";
	public String Empfirstname="txtEmpFirstName";
	public String savebutton="btnEdit";
  public String backbutton="/html/body/div[5]/input";
	public String linktext="Logout";
	public WebDriver driver;

}
