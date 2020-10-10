public class Browser {
    public void navigate(String addr) {
        String ip = findIPAddress(addr);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIPAddress(String address) {
        return "127.0.0.1";
    }
}
//findIpAddress and sendHttpRequest are both private methods because they are passed into navigate method
//we won't need to see the other two methods
//this is abstraction
//this is also reducing coupling