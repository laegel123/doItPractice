package exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();
        try(obj) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외 부분입니다.");
        }
    }
}

class AutoCloseObj implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("리소스가 close() 되었습니다.");
    }
}
