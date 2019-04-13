package com.company;

public class AbstractWorker implements Worker {

    @Override
    public void make() {
        start();
        String s = doLogic();
        finish(s);
    }

    @Override
    public void start() {
        System.out.println("I am starting");
    }

    @Override
    public String doLogic() {
        return null;
    }

    @Override
    public void finish(String s) {
        System.out.println("I am finishing with result - " + s);
    }
}
