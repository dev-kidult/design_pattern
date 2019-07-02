package obseverPattern.customObserver;

public class WeatherApp implements Observer {
    private Observable observable;

    WeatherApp(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o) {
        if (o instanceof WeatherData) {
            notifyMessage((WeatherData) o);
        }
    }

    private void notifyMessage(WeatherData weatherData) {
        WeatherStatus weatherStatus = weatherData.getWeatherStatus();
        switch (weatherStatus) {
            case RAINY:
                System.out.println("비가 옵니다. 우산을 챙겨주세요.");
                break;
            case SNOWY:
                System.out.println("눈이 옵니다. do you wanna build a snowman?");
                break;
            case SUNNY:
                System.out.println("맑은 날입니다! 빨래를 널어도 좋을꺼 같아요.");
                break;
            case CLOUDY:
                System.out.println("흐린날이네요. 곧 비가 올지도 모르겠어요.");
                break;
            default:
                System.out.println("등록된 상태가 없어요.");
                break;
        }
    }
}
