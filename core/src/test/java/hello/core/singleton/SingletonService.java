package hello.core.singleton;

public class SingletonService {
    //static이므로 클래스 레벨에 올라가기 때문에 딱 하나만 가지게 된다는 것이다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
