package br.com.ivan.estudo.treads;

import java.util.concurrent.*;

public class Treads {
    static class SimpleTask implements Runnable {
        private final int taskId;

        public SimpleTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            try {
                System.out.println("Tarefa " + taskId + " está sendo executada no thread " + Thread.currentThread().getName());
                Thread.sleep(1000);
                System.out.println("Tarefa " + taskId + " foi concluída no thread " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(5, 5,
                0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<>(10));

        for (int i = 0; i < 500; i++) {
            executor.submit(new SimpleTask(i));
        }

        executor.shutdown();

        System.out.println("Todas as tarefas foram submetidas ao pool.");
    }
}
