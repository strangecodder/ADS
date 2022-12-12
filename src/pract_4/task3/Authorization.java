package pract_4.task3;

public class Authorization{
    public boolean enter(String login,String password){
        if(login== User.getLogin() && password == User.getPassword()){
            System.out.println("Вход подтверждён");
            return true;
        } else {
            System.out.println("Введите логин и пароль ещё раз");
            return false;
        }
    }
    public void authorizationInterface(String login, String password){
        boolean f = false;
        System.out.println("Введите пароль");
        while (f==false){
            f = enter(login,password);
        }
    }
}
