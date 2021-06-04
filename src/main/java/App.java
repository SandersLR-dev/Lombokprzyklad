import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@RequiredArgsConstructor//tworzy konstruktor dla argumentow które są private final
public class App {
    private String name;
    private String lastName;
    private int age;
}
