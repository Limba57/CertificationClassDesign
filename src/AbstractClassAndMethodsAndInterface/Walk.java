package AbstractClassAndMethodsAndInterface;

public interface Walk {

    default int getSpeed() {
        return 5;
    }

}
