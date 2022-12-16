import enums.Genre;
import enums.Language;
import model.Book;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.

        ArrayList<Book> books = new ArrayList<>();
       Book book1 = new Book(1,"Jamilya",Genre.ROMANCE,450,"Chyngyz Aitmatov",Language.KYRGYZ,1995);
       Book book2 = new Book(2,"Birinchi Mugalim",Genre.ROMANCE,545,"Chyngyz Aitmatov",Language.KYRGYZ,1990);
       Book book3 = new Book(3,"Nakazanie",Genre.ROMANCE,500,"Dostaevskiy",Language.KYRGYZ,1985);





        

    }
}