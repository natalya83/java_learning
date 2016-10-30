package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by User on 30.10.2016.
 */
public class ContactHelper extends HelperBase{

  public ContactHelper(FirefoxDriver wd) {
    super (wd);
  }

  public void submitContactCreation() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
      type(By.name("firstname"),contactData.getSurname());
      type(By.name("lastname"), contactData.getSurname());
      type(By.name("mobile"), contactData.getPhone());
      type(By.name("email"), contactData.getEmail());

  }

  public void initContactCreation() {
      click(By.linkText("add new"));
  }
}
