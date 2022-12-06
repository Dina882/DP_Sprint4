package questions;

import PageObject.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class ClickDropdown {
    private WebDriver driver;

    @Before
    public void setUp() {
//      выбираем браузер
        driver = new ChromeDriver();
//      driver = new FirefoxDriver();
//        для проверки браузера Firefox
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void checkAllText() {
        HomePage mainPage = new HomePage(driver);
        mainPage.open(); // открытие ссылки
        mainPage.clickCookie(); // закрываем куки
        mainPage.scrollHowMuch(); // скролл
        mainPage.clickHowMuch(); // кликаем вопрос "Сколько это стоит? И как оплатить?"
        mainPage.IsAnswerHowMuch();
        mainPage.clickWantSeveralScooters(); //кликаем вопрос "Хочу сразу несколько самокатов! Так можно?"
        mainPage.IsAnswerSeveralScooters();
        mainPage.clickHowRentalTimeCalculated(); //кликаем вопрос "Как рассчитывается время аренды?"
        mainPage.IsAnswerHowRentalTimeCalculated();
        mainPage.clickTodayOrder(); //кликаем вопрос "Можно ли заказать самокат прямо на сегодня?"
        mainPage.IsAnswerTodayOrder();
        mainPage.clickExtendOrder(); //кликаем вопрос "Можно ли продлить заказ или вернуть самокат раньше?"
        mainPage.IsAnswerExtendOrder();
        mainPage.clickCharging(); //кликаем вопрос "Вы привозите зарядку вместе с самокатом?"
        mainPage.IsAnswerCharging();
        mainPage.clickCanOrderCancellation(); //кликаем вопрос "Можно ли отменить заказ?"
        mainPage.IsAnswerCanOrderCancellation();
        mainPage.clickLiveOutsideMoscow(); //кликаем вопрос "Я жизу за МКАДом, привезёте?"
        mainPage.IsAnswerLiveOutsideMoscow();
    }
    @After
    public void teardown() {
//      Закрываем браузер
        driver.quit();
    }

}

