package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by User on 30.10.2016.
 */
public class ContactModificationTests extends TestBase  {

  @Test(enabled = false)
  public void testContactModification () {
    app.goTo().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Natalja", "Kastrica", "26183677", "natalya83@inbox.lv", "test1"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Natalja", "Kastrica", "26183677", "natalya83@inbox.lv", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }
}
