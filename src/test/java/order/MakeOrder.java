package order;

import PageObject.OrderElements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;





public class MakeOrder {

    private WebDriver driver;

    @Before
    public void setUp() {
//      выбираем браузер
        driver = new ChromeDriver();
//      driver = new FirefoxDriver();
//      для проверки браузера Firefox
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    @Test
    public void checkUpOrder() {
//      проверка кнопки "Заказать" вверху страницы
        OrderElements orderElements = new OrderElements(driver);
        orderElements.open();
        orderElements.clickCookie(); // закрываем куки
        orderElements.clickButtonUpOrder(); // нажимаем кнопку заказать
        orderElements.IsOrderPageOpen();
        orderElements.sendName();
        orderElements.sendSurnameName();
        orderElements.sendAdress();
        orderElements.clickMetro();
        orderElements.clickMetro();
        orderElements.sendPhoneNumber();
        orderElements.clickButtonNext();
        orderElements.IsSecondOrderPageOpen();
        orderElements.clickWhenBringOrder();
        orderElements.choiceWhenBringOrder();
        orderElements.choiceDateRent();
        orderElements.choiceColor();
        orderElements.comment();
        orderElements.clickToOrder();
        orderElements.clickYes();
        orderElements.IsThirdOrderPageOpen();
    }


    @Test
    public void checkDownOrder() {
//      проверка кнопки "Заказать" внизу страницы
        OrderElements orderElements = new OrderElements(driver);
        orderElements.open();
        orderElements.clickCookie(); // закрываем куки
        orderElements.clickButtonDownOrder(); // скролив вниз и нажимаем кнопку заказать
        orderElements.IsOrderPageOpen();
        orderElements.sendName();
        orderElements.sendSurnameName();
        orderElements.sendAdress();
        orderElements.clickMetro();
        orderElements.clickMetro();
        orderElements.sendPhoneNumber();
        orderElements.clickButtonNext();
        orderElements.IsSecondOrderPageOpen();
        orderElements.clickWhenBringOrder();
        orderElements.choiceWhenBringOrder();
        orderElements.choiceDateRent();
        orderElements.choiceColor();
        orderElements.comment();
        orderElements.clickToOrder();
        orderElements.clickYes();
        orderElements.IsThirdOrderPageOpen();
    }
    @After
    public void teardown() {
//      Закрываем браузер
        driver.quit();
    }
}
