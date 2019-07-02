package obseverPattern.jdkObserver;

import java.util.Observable;
import java.util.Observer;

public class Dehumidifier implements Observer {
    private Observable observable;
    private boolean active;
    private double humidity;

    Dehumidifier(Observable observable) {
        this.active = false;
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            double _humidity = ((WeatherData) o).getHumidity();
            if (active) {
                if (_humidity < 40) {
                    stop();
                    this.active = false;
                    this.humidity = _humidity;
                } else if (_humidity < 60 && this.humidity > 80) {
                    normalMode();
                    this.humidity = _humidity;
                } else if (_humidity <= 80) {
                    turboMode();
                    this.humidity = _humidity;
                }
            } else {
                if (_humidity >= 80) {
                    turboMode();
                    this.active = true;
                    this.humidity = _humidity;
                } else if (_humidity > 60) {
                    normalMode();
                    this.active = true;
                    this.humidity = _humidity;
                }
            }
        }
    }

    private void stop() {
        System.out.println("쾌적환 환경입니다. 제습기 작동을 중지합니다.");
    }

    private void normalMode() {
        System.out.println("습도가 기준치 이상입니다. 제습모드를 시작합니다.");
    }

    private void turboMode() {
        System.out.println("실내 습도가 높습니다. 터보모드를 시작합니디.");
    }
}
