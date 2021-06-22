package sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Controller {
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getIsMonitor() {
        return isMonitor;
    }

    public void setIsMonitor(Integer isMonitor) {
        this.isMonitor = isMonitor;
    }

    public Controller(String ip, Integer isMonitor) {
        this.ip = ip;
        this.isMonitor = isMonitor;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "ip='" + ip + '\'' +
                ", isMonitor=" + isMonitor +
                '}';
    }

    private String ip;

    private Integer isMonitor;
}
