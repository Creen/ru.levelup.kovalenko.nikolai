package ru.levelup.Lesson03.Homework_V2;

public class App {

    public static void main(String[] args) {
        OneLinkedListStack<String> oneLinkedListStack = new OneLinkedListStack<>(4);
        oneLinkedListStack.push("1");
        oneLinkedListStack.push("2");
        oneLinkedListStack.push("3");
        oneLinkedListStack.push("3");


        System.out.println(oneLinkedListStack.peek());
        System.out.println(oneLinkedListStack.peek());
        System.out.println(oneLinkedListStack.peek());

    }
}