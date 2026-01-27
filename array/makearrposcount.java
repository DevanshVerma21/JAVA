public class makearrposcount {
    public static void main(String[] args) {
        int arr[] = { -5, 3, -2, 7 };
        int f = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     if (f % 2 == 0) {
        //         arr[i] = arr[i];
        //     } else {
        //         arr[i] = -arr[i];
        //     }
        //     f++;
        // }

        int s = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] * s < 0) {
                s = -1;
            }
            f++;
        }
        System.out.println(f);

    }
}
