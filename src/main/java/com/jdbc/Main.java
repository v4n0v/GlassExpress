package com.jdbc;

public class Main{

    public static void main(String[] args) {
        DatabaseConnection connection = new DatabaseConnection();
        connection.connect();



        connection.disconnect();


    }
}
