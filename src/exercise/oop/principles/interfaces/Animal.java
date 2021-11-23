package exercise.oop.principles.interfaces;


public interface Animal extends Atom, World{

    /*
    1. Функции по умолчанию public, abstract, static
    2. Функции в подклассе должны быть обязательно реализованы
     */
    void eat();
    void travel();
}
