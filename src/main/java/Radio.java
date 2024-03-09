public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {          //конструктор для задания максимального количества станций по умолчанию
        this.maxStation = 10;

    }

    public Radio(int maxStation) {    //конструктор для задания максимального количества станций
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }   // считываем состояние радиостанции

    public int getCurrentVolume() {
        return currentVolume;
    } // считываем установленную громкость

    public void setCurrentStation(int newCurrentStation) {   //описываем порядок установки станции
        if (newCurrentStation < 0) { //если меньше 0, то оставляем станцию как есть
            return;
        } else {
            if (newCurrentStation >= maxStation) {
                return;
            } //если больше 9, то оставляем станцию как есть
            else {
                this.currentStation = newCurrentStation;  //устанавливаем станцию
            }
        }

    }

    public void next() {  //описываем условия переключения станций вперед
        if (currentStation == maxStation - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() { //описываем условия переключения станций назад
        if (currentStation == 0) {
            currentStation = maxStation - 1;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() { //описываем условия переключения громкости вперед
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() { //описываем условия переключения громкости назад
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
