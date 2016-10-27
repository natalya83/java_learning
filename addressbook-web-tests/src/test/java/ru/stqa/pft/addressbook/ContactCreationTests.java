package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase  {

    
    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactForm(new ContactData("Natalja", "Kastrica", "26183677", "natalya83@inbox.lv"));
        submitContactCreation();
        gotoHomePage();
    }


}
