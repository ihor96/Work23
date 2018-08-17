import com.sun.istack.internal.NotNull;
import lombok.*;

//@Getter //Ломбок добавляє всі гетери
//@Setter //Ломбок добавляє всі сеттери
//@NoArgsConstructor// Добавляє пусті конструктори
@AllArgsConstructor//Повний конструктор
//@RequiredArgsConstructor//Конструктор створюэться для тих об над якими нот нулл
//@ToString//add toString

@Data//Містить майже все зверху перечислене
public class User {
    //Lombok -бібліотека
//    @NotNull
    private int id;
//    @NotNull
    private String name;
    private boolean status;
    {

    }
}
