package solutions;

public class selfCoding {
    public static void main(String[] args) {
        PasswordTest passwordTest = new PasswordTest();
        String password = null;

        try {
            passwordTest.setPassword(password);
            System.out.println("오류없음 1");
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}

class PasswordTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("비밀번호는 null 일 수 없습니다.");
        } else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자 이상 입니다.");
        } else if (password.matches("[a-zA-Z]")) {
            throw new PasswordException("비밀번호는 숫자를 포함해야 합니다.");
        }

        this.password = password;
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}


