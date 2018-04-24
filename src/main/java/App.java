public class App {

    public static void main(String[] args) {

        ITestService testService = new TestService();

        System.out.println(testService.helloMessage());
    }
}
