import org.testng.annotations.Test;

public class ExcelTest {

    //чтение эксель файла с помощью массива аргументов
    @Test(dataProvider = "usersFromSheet1", dataProviderClass = ExcelDataProviders.class)
    public void readExcelSheetDefault(String... params){
        System.out.println("Id: " + params[0] + " Имя: " + params[1] );
    }

    @Test(dataProvider = "usersFromSheet2", dataProviderClass = ExcelDataProviders.class)
    public void readExcelSheet2(String ...params){
        System.out.println("Логин:" + params[1]);
        System.out.println("Пароль:" + params[2]);
        System.out.println("lastName:" + params[0]);
    }
}
