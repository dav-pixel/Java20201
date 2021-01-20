package stack;

// В этом классе определяется целочисленный стек,
// который может содержать 10 значений
public class Stack {
    /* Теперь переменные stck и tos являются закрытыми.
     Это означает, что они не могут быть случайно или
    намеренно изменены таким образом, чтобы нарушить стек
     */
    private int stck[] = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Cтeк заполнен.");
          else
            stck[++tos] = item;
        }
    //извлечь элемент из стека
    int pop(){
        if(tos<0){
            System.out.println("Cтeк не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
    }

