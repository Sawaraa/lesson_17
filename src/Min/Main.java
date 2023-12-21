package Min;

import Min.Collection;


public class Main {
    public static void main(String[] args) {

        Number[] array = {1, 2, 3, 4, 5, 6, 7};

        Collection collection = new Collection(array);

        Collection.First firstIterator = collection.new First();

        System.out.println("First inner class");

        while (firstIterator.hasNext()){
            System.out.println(firstIterator.next());
        }

        System.out.println();


        System.out.println("Second inner class");

        Collection.Second secondIterator = collection.new Second();

        while (secondIterator.hasNext()){
            System.out.println(secondIterator.next());
        }

        System.out.println();

        firstIterator.replaceOddWithZero();

    }
}