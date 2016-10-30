package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase  {

    
    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Natalja", "Kastrica", "26183677", "natalya83@inbox.lv"));
        app.getContactHelper().submitContactCreation();
        app.gotoHomePage();
    }


}
