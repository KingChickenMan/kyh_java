package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3; //(2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); //sum3과 같다.
        System.out.println("sum3 = " + sum3); //sum3 = 13
        System.out.println("sum4 = " + sum4); //sum3 = 13

        /*
        1. 괄호 ()
        2. 단항 연산자 (예: `++` , `--` , `!` , `~` , `new` , `(type)` )
        3. 산술 연산자 (`*` , `/` , `%` 우선,그다음에 `+` , `-` )
        4. Shift 연산자 ( `<<` , `>>` , `>>>` )
        5. 비교 연산자 ( `<` , `<=` , `>` , `>=` , `instanceof` )
        6. 등식 연산자 (`==` , `!=` )
        7. 비트 연산자 (`&` ,`^` ,`|` )
        8. 논리 연산자 (`&&` , `||` )
        9. 삼항 연산자 (`?:` )
         */
    }
}
