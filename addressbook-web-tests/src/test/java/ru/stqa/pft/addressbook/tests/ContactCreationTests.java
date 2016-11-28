package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase  {

    
    @Test(enabled = false)
    public void testContactCreation() {
        app.goTo().gotoHomePage();
        app.getContactHelper().createContact(new ContactData("Natalja", "Kastrica", "26183677", "natalya83@inbox.lv", "test1"));
    }


}
