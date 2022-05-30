package pramudito.rh.generic.application;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> intNumber = new NumberData<>(100);
        NumberData<Long> longNumber = new NumberData<>(10L);
        // NumberData<String> strNumber = new NumberData<String>("ERROR"); // ERROR not within bound

    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
