package AbstractClassAndMethodsAndInterface;

public interface Run extends Walk{

    default int getSpeed() {
        return 10;
    }

}
