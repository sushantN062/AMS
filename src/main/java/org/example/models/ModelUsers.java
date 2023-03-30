package org.example.models;

public class ModelUsers {

        private final int id;
        private final String username;
        private final String password;

        public ModelUsers(int id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }

    public static void add(ModelUsers modelUsers1) {

    }

    public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

    public int getUser_id() {
        return 0;
    }
}

