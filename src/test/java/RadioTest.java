import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldSetStation() { //проверить установку радиостанции с допустимым значением
        Radio station = new Radio();

        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //установить станцию из граничного значения 0

    @Test
    public void shouldLBSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //установить станцию из граничного значения 9

    @Test
    public void shouldUpBSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //установить станцию следующее значение за большим допустимым

    @Test
    public void shouldBigSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    //установить станцию следующее значение за меньшим допустимым

    @Test
    public void shoulSmollSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {  //переключить на одну станцию вперед при установленном значении от 0 до 8
        Radio station = new Radio(30);

        station.setCurrentStation(28);
        station.next();

        int expected = 29;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTestMax() { //переключить на одну станцию вперед при установленном граничном значении 9
        Radio station = new Radio(30);

        station.setCurrentStation(29);
        station.next();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTest() {  //переключить на одну станцию назад при установленном значении от 1 до 9
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.prev();

        int expected = 4;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTestMin() {  //переключить на одну станцию назад при установленном граничном значении 0
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prev();

        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() { //увеличить звук от нулевого значения
        Radio station = new Radio();

        for (int i = 0; i < 2; i++) {
            station.increaseVolume();
        }

        int expected = 2;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMaxTest() {//увеличить звук больше 100 раз
        Radio station = new Radio();

        for (int i = 0; i < 101; i++) {
            station.increaseVolume();
        }

        int expected = 100;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMinTest() { //уменьшить звук от нулевого значения
        Radio station = new Radio();

        for (int i = 0; i < 2; i++) {
            station.decreaseVolume();
        }

        int expected = 0;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTest() { //уменьшить звук после повышения
        Radio station = new Radio();

        for (int i = 0; i < 21; i++) {
            station.increaseVolume();
        }

        for (int i = 0; i < 10; i++) {
            station.decreaseVolume();
        }

        int expected = 11;
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
