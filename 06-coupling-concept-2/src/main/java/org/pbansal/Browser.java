package org.pbansal;

public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.0.0.1";
    }
}


// In this class, we try to reduce coupling.
// if we wanted we can implement the code for findIpAddress and sendHttpRequest into one method called navigate but
// will rule out the principle of single responsibility.
// keep the irrelevant method private if they are not being called in the main method.
// that's the way in case if we call findIpAddress in the main method and if anything changes here, we need to make change in the main method.