public class Connection {
    private String name;
    private String protocol;
    private String host;
    private int port;
    private String username;

    public Connection(String name, String protocol, String host, int port, String username) {
        this.name = name;
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return name + " (" + protocol + "://" + host + ":" + port + ")";
    }
}
