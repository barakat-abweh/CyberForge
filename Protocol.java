package com.example.sshclient.protocols;

public interface Protocol {
    void connect(String host, int port, String username, String password) throws Exception;
    void disconnect();
    boolean isConnected();
    void setPort(int port); // Method to set a custom port
}
