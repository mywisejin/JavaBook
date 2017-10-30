
package jpub.java.junit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GreetingTest {
    private Greeting target = new Greeting();

    @Test
    public void getMessage_아침시작() {
        // 실행
        String message = this.target.getMessage(5);
        
        // 검증
        assertThat(message, is(" 좋은 아침입니다"));
    }
    
    @Test
    public void getMessage_점심시작() {
        // 실행
        String message = this.target.getMessage(11);

        // 검증
        assertThat(message, is(" 안녕하세요"));
    }
        
    @Test
    public void getMessage_저녁시작() {
        // 실행
        String message = this.target.getMessage(17);
        
        // 검증
        assertThat(message, is(" 수고가 많습니다"));
    }
}