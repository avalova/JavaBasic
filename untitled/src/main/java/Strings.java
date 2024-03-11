public class Strings {
    public static void main(String[] args){
        int x = 5; //С маленькой буквы. Объект, под которые выделилось 4 байта.
        String myString = "Hello"; //Ссылочная переменная. Начинается с заглавной буквы. Является ссылкой на класс String, но задавая значение мы создаем объект класса Стринг. с выделением памяти.
        String space = " ";
        String name = "Bob";
        System.out.println(myString+space+name);
        System.out.println(7+name);
    }
}
