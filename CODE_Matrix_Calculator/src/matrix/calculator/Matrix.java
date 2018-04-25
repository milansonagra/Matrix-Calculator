package matrix.calculator;

/**
 *
 * @author Milan Sonagra
 */
public class Matrix {

    private final int r;
    private final int c;
    public double[][] M;

    /*      Matrix storage - Data Stucture      */
    Matrix(int r, int c) {
        this.r = r;
        this.c = c;

        if (this.r <= 0 || this.c <= 0) {
            new InValidInput().setVisible(true);
        } else {
            M = new double[this.r][this.c];
        }
    }

    /*      GET THE VALUE OF PRIVATE DATA MEMEBER OF CALSS FOR OUT OF THE WORLD     */
    int getRow() {
        return r;
    }

    int getColumn() {
        return c;
    }

    /*  --------------------------------------------------------------------------  */
    public Matrix addition(Matrix B) {
        Matrix Ans = new Matrix(r, c);
        if (r == B.r && c == B.c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    Ans.M[i][j] = M[i][j] + B.M[i][j];
                }
            }
        } else {
            MatrixCalculatorDesign.setScreen = false;
            new CanNotPerfom().setVisible(true);

        }
        return Ans;
    }

    public Matrix subtraction(Matrix B) {
        Matrix Ans = new Matrix(r, c);

        if (this.r == B.r && this.c == B.c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    Ans.M[i][j] = this.M[i][j] - B.M[i][j];
                }
            }
        } else {
            MatrixCalculatorDesign.setScreen = false;
            new CanNotPerfom().setVisible(true);

        }
        return Ans;
    }

    public Matrix multiplication(Matrix B) {
        Matrix Ans = new Matrix(this.r, B.c);

        if (this.c == B.r) {
            for (int i = 0; i < this.r; i++) {
                for (int j = 0; j < B.c; j++) {
                    for (int k = 0; k < c; k++) {
                        Ans.M[i][j] += this.M[i][k] * B.M[k][j];
                    }
                }
            }
        } else {
            MatrixCalculatorDesign.setScreen = false;
            new CanNotPerfom().setVisible(true);

        }

        return Ans;
    }

    public Matrix transpose() {
        Matrix Ans = new Matrix(c, r);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Ans.M[j][i] = M[i][j];
            }
        }
        return Ans;
    }

    public Matrix constantMultiplication(double k) {
        Matrix Ans = new Matrix(r, c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Ans.M[i][j] = k * M[i][j];
            }
        }
        return Ans;
    }

    public double determinant(double A[][], int N) {
        double det = 0;
        if (r == c) {
            if (N == 1) {
                det = A[0][0];
            } else if (N == 2) {
                det = A[0][0] * A[1][1] - A[1][0] * A[0][1];
            } else {
                det = 0;
                for (int j1 = 0; j1 < N; j1++) {
                    double[][] m = new double[N - 1][];
                    for (int k = 0; k < (N - 1); k++) {
                        m[k] = new double[N - 1];
                    }
                    for (int i = 1; i < N; i++) {
                        int j2 = 0;
                        for (int j = 0; j < N; j++) {
                            if (j == j1) {
                                continue;
                            }
                            m[i - 1][j2] = A[i][j];
                            j2++;
                        }
                    }
                    det += Math.pow(-1.0, 1.0 + j1 + 1.0) * A[0][j1] * determinant(m, N - 1);
                }
            }
            return det;
        } else {
            MatrixCalculatorDesign.setScreen = false;
            new CanNotPerfom().setVisible(true);

            return '\0';
        }
    }

    public Matrix adjoint() {

        int R = M.length;

        Matrix Ans = new Matrix(R, R);
        if (r == c) {
            int ii, ij, ia, ja;
            double det;

            for (int i = 0; i < R; i++) {
                for (int j = 0; j < R; j++) {
                    ia = ja = 0;

                    double ap[][] = new double[R - 1][R - 1];
                    Matrix T = new Matrix(R - 1, R - 1);

                    for (ii = 0; ii < R; ii++) {
                        for (ij = 0; ij < R; ij++) {

                            if ((ii != i) && (ij != j)) {
                                ap[ia][ja] = M[ii][ij];
                                ja++;
                            }

                        }
                        if ((ii != i) && (ij != j)) {
                            ia++;
                        }
                        ja = 0;

                        for (int x = 0; x < R - 1; x++) {
                            for (int y = 0; y < R - 1; y++) {
                                T.M[x][y] = ap[x][y];
                            }
                        }
                    }

                    det = T.determinant(T.M, T.r);
                    Ans.M[i][j] = (double) Math.pow(-1, i + j) * det;
                }
            }

            Ans = Ans.transpose();
            return Ans;
        } else {
            MatrixCalculatorDesign.setScreen = false;
            new CanNotPerfom().setVisible(true);

            return null;
        }

    }

    public Matrix inverce() {
        Matrix Ans = new Matrix(r, c);
        double det = determinant(M, r);
        if (det != 0) {
            Ans = adjoint().constantMultiplication(1 / det);
        } else {
            MatrixCalculatorDesign.setScreen = false;
            new CanNotPerfom().setVisible(true);
        }
        return Ans;
    }
}
