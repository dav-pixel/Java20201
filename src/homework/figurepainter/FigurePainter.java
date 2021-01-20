package homework.figurepainter;

public class FigurePainter {

    /**
     * Գրել կոդ, որը կպատկերի այս եռանկյունը։
     * *
     * * *
     * * * *
     * * * * *
     */


    void figureOne(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();

        }

    }

    //        /**
//         * Գրել կոդ, որը կպատկերի այս եռանկյունը։
//         *
//         *             *
//         *           * *
//         *         * * *
//         *       * * * *
//         *
//         * */
    void figureTwo() {

        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }

    /**
     * Գրել կոդ, որը կպատկերի այս եռանկյունը։
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     */

    void figureThree() {

        System.out.println();
        for (int i = 4; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

    /**
     * Գրել կոդ, որը կպատկերի այս եռանկյունը։
     * <p>
     * * * * *
     * * * *
     * * *
     * *
     */
    void figureFour() {
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");

            }
            for (int j = 4; j > i; j--) {

                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println();

    }
    /**
     * Գրել կոդ, որը կպատկերի այս եռանկյունը։
     *
     *
     *        *
     *       * *
     *      * * *
     *     * * * *
     *      * * *
     *       * *
     *        *
     * */
    void figureFive(){
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }





}



