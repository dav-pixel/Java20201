public class Box {
    double width;
    double height;
    double depth;
    // конструктор, используемый, когда
    // указываются все размеры
    Box(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    // конструктор, используемый, когда
    //ни один из размеров не указан
    Box() {
        width = -1;   // использовать значение -1 для
        height = -1;  // обозначения неинициализированного
        depth = -1;   //параллелепипеда

    }

    // конструктор, используемый при создании куба
    Box(double len){
        width = height = depth = len;

    }
    // рассчитать и возвратить объем
    double volume(){
        return width*height*depth;
    }
}

