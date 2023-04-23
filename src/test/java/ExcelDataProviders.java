import org.testng.annotations.DataProvider;

public class ExcelDataProviders {
    @DataProvider
    public Object[][]usersFromSheet1() throws Exception {
        String path = "src/main/resources/user.xlsx";
        ExcelReader excelReader = new ExcelReader(path);//экземпляр
        return excelReader.getSheetDataForTDD();//чтение с перового листа
    }

    @DataProvider
    public Object[][] usersFromSheet2() throws Exception {
        String path = "src/main/resources/user.xlsx";
        ExcelReader excelReader = new ExcelReader(path,"Лист2");
        return excelReader.getCustomSheetForTDD();
    }
}
