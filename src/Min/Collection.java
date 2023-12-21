package Min;

public class Collection {

    Number [] number;

    public Collection(Number[] number) {
        this.number = number;
    }

     class First implements Iterator{

        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < number.length;
        }

        @Override
        public Number next() {
            return number[count++];
        }

        public void replaceOddWithZero() {
            for (int i = 0; i < number.length; i++) {
                if (number[i].intValue() % 2 != 0) {
                    number[i] = 0;
                }
            }
            System.out.println("Масив після заміни непарних на нуль:");
            for (Number num : number) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    class Second implements Iterator{

        private int count = number.length - 1;

        @Override
        public boolean hasNext() {
            return count >= 0;
        }

        @Override
        public Number next() {
            return number[count--];
        }
    }

    }


