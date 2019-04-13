package com.company;

public class TitleGenerationWorker extends AbstractWorker {

    @Override
    public String doLogic() {
        return "Generated title";
    }

    @Override
    public void start() {
        super.start();
        System.out.println("you are in title generator");
    }
}



