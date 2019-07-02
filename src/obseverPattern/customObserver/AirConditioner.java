package obseverPattern.customObserver;

public class AirConditioner implements Observer {
    private Observable observable;
    private boolean active;
    private double temperature;

    AirConditioner(Observable observable) {
        this.active = false;
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o) {
        if (o instanceof WeatherData) {
            double _temperature = ((WeatherData) o).getTemperature();
            if (active) {
                if (_temperature < 24) {
                    stop();
                    this.active = false;
                    this.temperature = _temperature;
                } else if (_temperature < 28 && this.temperature > 34) {
                    normalMode();
                    this.temperature = _temperature;
                } else if (_temperature <= 34) {
                    turboMode();
                    this.temperature = _temperature;
                }
            } else {
                if (_temperature >= 34) {
                    turboMode();
                    this.active = true;
                    this.temperature = _temperature;
                } else if (_temperature > 28) {
                    normalMode();
                    this.active = true;
                    this.temperature = _temperature;
                }
            }
        }
    }

    private void stop() {
        System.out.println("쾌적환 환경입니다. 에어컨 작동을 중지합니다.");
    }

    private void normalMode() {
        System.out.println("후덥지근한 날씨가 되었습니다. 에어컨 작동을 시작합니다.");
    }

    private void turboMode() {
        System.out.println("더워 못살겠습니다. 터보모드를 시작합니디.");
    }
}
