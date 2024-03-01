public class Radio {
    private int currentStation;

   // public void setToMaxStation() {  //устанавливаем максимальное значение станций
   //     currentStation = 9;
   // }

    public int getCurrentStation() {
        return currentStation;
    }// считываем состояние радиостанции

    public void setCurrentStation(int newCurrentStation) {   //описываем порядок установки станции
        if (newCurrentStation < 0) { //если меньше 0, то оставляем станцию как есть
            return;
        } else {
            if (newCurrentStation > 9) {
                return;
            } //если больше 9, то оставляем станцию как есть
            else {
                currentStation = newCurrentStation;  //устанавливаем станцию
            }
        }

    }


}
