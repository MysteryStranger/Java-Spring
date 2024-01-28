package com.example.lec_1;

public class DIPrinciple {
}
interface IWorker{
    void work();
}

class Worker implements IWorker{
    public void work(){
        System.out.println("working...");
    }
}

class ManPowerWorker implements IWorker{
    public void work(){
        System.out.println("working more for less :(...");
    }
}

class Manager{
    // the boss have a worker
    IWorker worker;
// setter
    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void manage(){
        worker.work();
    }
}

