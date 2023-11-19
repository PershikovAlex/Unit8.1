package ru.netology.test;

import com.codeborne.selenide.Configuration;
//import lombok.var;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class AuthTest {
    @BeforeEach
    void setUp() {
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void validLoginTest() {
        var loginPage = open("http://localhost:9999", LoginPage.class);
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
    }
}
