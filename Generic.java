public class Generic<T> {

    T object;
    T number;
    T status;
    
    public Generic() {
    }

    public Generic(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Generic [object=" + object + "]";
    }
    
}
