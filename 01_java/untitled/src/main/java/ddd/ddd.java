package ddd;

public class ddd {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        System.out.println("더하기 결과 : " + (a + b));
        System.out.println("뺘기 결과 : " + (a - b));
        System.out.println("곱하기 결과 : " + (a * b));
        System.out.println("나누기한 몫 : " + (a / b));
        System.out.println("나누기한 나머지 : " + (a % b));

        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println(charNumber);

        float k_point = 80.5f;
        float m_point = 50.6f;
        float e_point = 70.8f;

        System.out.println("총점 : " + (int)(k_point + m_point + e_point));
        System.out.println("평균 : " + (int)((k_point + m_point + e_point)/3));

    }
}
