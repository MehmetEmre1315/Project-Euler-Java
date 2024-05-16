import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> currency = new HashMap<>();
        currency.put("1p",  1);
        currency.put("2p", 2);
        currency.put("5p", 5);
        currency.put("10p", 10);
        currency.put("20p", 20);
        currency.put("50p", 50);
        currency.put("£1",  100);
        currency.put("£2",  200);

        int sum;
        int answer = 0;
        for (int i = 0; i <= 200 / currency.get("£2"); i++) {
            sum = i * 200;
            if (sum == 200) {
                System.out.println("£2 x " + i);
                answer++;
                break;
            }
            if (sum > 200) break;
            for (int j = 0; j <= 200 / currency.get("£1"); j++) {
                sum = i * 200 + j * 100;
                if (sum == 200) {
                    System.out.println("£2 x " + i + " £1 x " + j);
                    answer++;
                    break;
                }
                if (sum > 200) break;
                for (int k = 0; k <= 200 / currency.get("50p"); k++) {
                    sum = i * 200 + j * 100 + k * 50;
                    if (sum == 200) {
                        System.out.println("£2 x " + i + " £1 x " + j + " 50p x " + k);
                        answer++;
                        break;
                    }
                    if (sum > 200) break;
                    for (int l = 0; l <= 200 / currency.get("20p"); l++) {
                        sum = i * 200 + j * 100 + k * 50 + l * 20;
                        if (sum == 200) {
                            System.out.println("£2 x " + i + " £1 x " + j + " 50p x " + k + " 20p x " + l);
                            answer++;
                            break;
                        }
                        if (sum > 200) break;
                        for (int m = 0; m <= 200 / currency.get("10p"); m++) {
                            sum = i * 200 + j * 100 + k * 50 + l * 20 + m * 10;
                            if (sum == 200) {
                                System.out.println("£2 x " + i + " £1 x " + j + " 50p x " + k + " 20p x " + l +
                                        " 10p x " + m);
                                answer++;
                                break;
                            }
                            if (sum > 200) break;
                            for (int n = 0; n <= 200 / currency.get("5p"); n++) {
                                sum = i * 200 + j * 100 + k * 50 + l * 20 + m * 10 + n * 5;
                                if (sum == 200) {
                                    System.out.println("£2 x " + i + " £1 x " + j + " 50p x " + k + " 20p x " + l +
                                            " 10p x " + m + " 5p x " + n);
                                    answer++;
                                    break;
                                }
                                if (sum > 200) break;
                                for (int o = 0; n <= 200 / currency.get("2p"); o++) {
                                    sum = i * 200 + j * 100 + k * 50 + l * 20 + m * 10 + n * 5 + o * 2;
                                    if (sum == 200) {
                                        System.out.println("£2 x " + i + " £1 x " + j + " 50p x " + k + " 20p x " + l +
                                                " 10p x " + m + " 5p x " + n + " 2p x " + o);
                                        answer++;
                                        break;
                                    }
                                    if (sum > 200) break;
                                    for (int p = 0; p <= 200 / currency.get("1p"); p++) {
                                        sum = i * 200 + j * 100 + k * 50 + l * 20 + m * 10 + n * 5 + o * 2 + p;
                                        if (sum == 200) {
                                            System.out.println("£2 x " + i + " £1 x " + j + " 50p x " + k +
                                                    " 20p x " + l + " 10p x " + m + " 5p x " + n + " 2p x " +
                                                    o + " 1p x " + p);
                                            answer++;
                                            break;
                                        }
                                        if (sum > 200) break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Answer: " + answer);
    }
}