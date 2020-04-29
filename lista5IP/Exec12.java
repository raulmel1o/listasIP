//finalizado

public class Exec12 {
    public static double moreSalesFacility (double[][] a) {
        double fil = 0;
        double great = 0;
        double temp = 0;

        //iterates through all matrix elements except the headers
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                temp += a[i][j];
            }

            if (temp > great) {
                temp = great;
                fil = a[i][0];
            }
        }

        return fil;
    }

    public static double moreSalesMonth (double[][] a) {
        double month = -1;
        double sales = 0;
        double temp = 0;

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                temp += a[j][i];
            }

            if (temp > sales) {
                sales = temp;
                month = a[0][i];
            }
        }

        return month;
    }

    public static double[] moreSalesMonthFacility (double[][] a) {
        double[] res = new double[2];
        double temp = 0;
        double great = 0;

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                temp = a[i][j];

                if (temp > great) {
                    great = temp;
                    res[0] = a[i][0];
                    res[1] = a[i][j];
                }
            }
        }

        return res;
    }

    public static double salesBalanceSemester (double[][] a) {
        double mean = 0;
        double sum = 0;
        double counter = 0;

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                sum += a[i][j];
                counter++;
            }
        }

        mean = sum / counter;

        return mean;
    }

    public static double salesMarchToMay (double[][] a) {
        double sum = 0;

        for (int i = 1; i < a.length; i++) {
            for (int j = 3; j < 6; j++) {
                sum += a[i][j];
            }
        }

        return sum;
    }

    public static double[][] firstTrimesterBalance (double[][] a) {
        double[][] firstTri = new double[5][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                firstTri[i][j] = a[i][j];
            }
        }

        return firstTri;
    }

    public static double[] salesBalancePerMonth (double[][] a) {
        double[] monthMean = new double[6];
        double sum = 0;
        int counter = 0;

        for (int i = 1; i < a[i].length; i++) {
            for (int j = 1; j < a.length; j++) {
                sum = a[j][i];
                counter++;
            }
            monthMean[i - 1] = sum / counter;
        }

        return monthMean;
    }

    public static double[] salesBalancePerFacility (double[][] a) {
        double[] salesBalance = new double[4];
        double sum = 0;
        int counter = 0;

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                sum += a[i][j];
                counter++;
            }
            salesBalance[i - 1] = sum / counter;
        }

        return salesBalance;
    }

    public static void main (String[] args) {
        double [][] a = {
                {-1, 0, 1, 2, 3, 4, 5},
                {0, 20_000.00, 35_000.00, 2_000.20, 20_832.00, 10_500.00, 12_000.00},
                {1, 15_453.00, 5_300.00, 42_000.00, 135_832.00, 18_580.36, 85_200.00},
                {2, 14_320.00, 55_800.00, 12_356.00, 2_563.00, 100_000.00, 62_325.00},
                {3, 12_345.00, 44_823.00, 14_863.25, 56_483.55, 93_000.00, 4_852.33},
        };
    }
}
