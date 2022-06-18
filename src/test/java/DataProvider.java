
public class DataProvider {
    @org.testng.annotations.DataProvider(name = "RegistrationDataProvider")
    public Object [][]  getdata  () {
        Object [][] data = { {"Michael", "Brown", "123456789" }, {"Jonh", "Walker", "987654321"}, {"Jimmy", "Lee", "321654987"} };
        return data;
    }

}
