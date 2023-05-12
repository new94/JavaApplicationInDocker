package org.example;

/**
 * Команды для терминала:
 * ./gradlew clean - очищаем директорию build
 * ./gradlew build - сборка приложения
 * ./gradlew run - запуск приложения
 * ./gradlew jar - упаковка приложения в jar
 *
 * Docker Desktop должен быть запущен для выполнения следующих команд:
 * docker image build -t java-docker-application-jar:latest C:\Users\yvnenak2\IdeaProjects\JavaApplicationInDocker\ - build образа для Docker
 * docker run java-docker-application-jar:latest - запуск приложения в Docker
 *
 * docker-compose up - поднять сервисы через docker-compose
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            Thread.sleep(30_000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End");
    }
}