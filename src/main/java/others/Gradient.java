package others;

import java.util.Arrays;

/**
 * 梯度下降算法
 * Created by starqiu on 16-8-4.
 */

public class Gradient {

    /***
     * 批量梯度下降
     * @param inputDataMatrix 输入数据矩阵X
     * @param expectResult 预期结果y
     * @param theta 初始化参数，不包含
     * @param learningRate 学习曲率alpha
     * @param iterNum 迭代次数
     * @param maxLoss 最大损失值
     * @return 优化后的参数
     */
    public double[] batchGradientDescent(double[][] inputDataMatrix, double[] expectResult, double[] theta,
                                         double learningRate, int iterNum, double maxLoss) {
        inputDataMatrix = addOneColumn4Arr2D(inputDataMatrix,1d);

        int rows = inputDataMatrix.length;
        int cols = inputDataMatrix[0].length;
        if (theta.length<rows){
            theta = addOneColumn4Arr(theta,1d);
        }
        double loss = maxLoss + 1;
        int i = 0;
        for (; i < iterNum && loss>maxLoss; i++) {
            double errSum = 0d;
            for (int j = 0; j < rows; j++) {
                double h = 0d;
                for (int k = 0; k < cols; k++) {
                    h += inputDataMatrix[j][k] * theta[k];
                }

                errSum = h - expectResult[j];
                for (int k = 0; k < cols; k++) {
                    theta[k] -= learningRate * errSum * inputDataMatrix[j][k];
                }
            }

            System.out.println(String.format("theta=%s", Arrays.toString(theta)));
            for (int j = 0; j < rows; j++) {
                double sum = 0d;
                for (int k = 0; k < cols; k++) {
                    sum += inputDataMatrix[j][k] * theta[k];
                }

                loss = Math.pow(expectResult[j] - sum, 2)/2;
            }
//            System.out.println(String.format("迭代%d次，此时损失函数的值为:%f",i, loss));
        }
        System.out.println(String.format("总共迭代%d次，此时损失函数的值为:%f",i, loss));

        return theta;
    }

    /***
     * 批量梯度下降
     * @param inputDataMatrix 输入数据矩阵X
     * @param expectResult 预期结果y
     * @param theta 初始化参数，不包含
     * @param learningRate 学习曲率alpha
     * @param iterNum 迭代次数
     * @param maxLoss 最大损失值
     * @return 优化后的参数
     */
    public double[] stochasticGradientDescent(double[][] inputDataMatrix, double[] expectResult, double[] theta,
                                          double learningRate, int iterNum, double maxLoss) {
        inputDataMatrix = addOneColumn4Arr2D(inputDataMatrix,1d);

        int rows = inputDataMatrix.length;
        int cols = inputDataMatrix[0].length;
        if (theta.length<rows){
            theta = addOneColumn4Arr(theta,1d);
        }
        double loss = maxLoss + 1;
        int i = 0;
        for (; i < iterNum && loss>maxLoss; i++) {
            double errSum = 0d;
            int j = Double.valueOf(Math.random()*rows).intValue();
            double h = 0d;
            for (int k = 0; k < cols; k++) {
                h += inputDataMatrix[j][k] * theta[k];
            }

            errSum = h - expectResult[j];
            for (int k = 0; k < cols; k++) {
                theta[k] -= learningRate * errSum * inputDataMatrix[j][k];
            }

            System.out.println(String.format("theta=%s", Arrays.toString(theta)));
            double sum = 0d;
            for (int k = 0; k < cols; k++) {
                sum += inputDataMatrix[j][k] * theta[k];
            }

            loss = Math.pow(expectResult[j] - sum, 2)/2;
            System.out.println(String.format("迭代%d次，此时损失函数的值为:%f",i, loss));
        }
        System.out.println(String.format("总共迭代%d次，此时损失函数的值为:%f",i, loss));

        return theta;
    }

    public double[] addOneColumn4Arr(double[] arr, double x) {
        int oldLen = arr.length;
        double[] newArr = new double[oldLen+1];
        newArr[0] = x;
        System.arraycopy(arr, 0, newArr, 1, oldLen);
        return newArr;
    }

    public double[][] addOneColumn4Arr2D(double[][] arr, double x) {
        int rows = arr.length;
        int cols = arr[0].length;
        double[][] newArr = new double[rows][cols+1];
        for (int i = 0; i < rows; i++) {
            newArr[i][0] = x;
            System.arraycopy(arr[i],0,newArr[i],1,cols);
        }

        return newArr;
    }

    public double[] expand2Arr(double[] arr, double x) {
        Arrays.fill(arr,x);
        return arr;
    }


    public void printArr2(double[][] arr2){
        int rows = arr2.length;
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }


    public static void main(String[] args) {
        Gradient bg = new Gradient();
//        bg.batchGradientDescent();

        double inputDataMatrix[][] = { { 1d, 4d }, { 2d, 5d }, { 5d, 1d }, { 4d, 2d } }; // X输入
        double expectResult[] = { 19d, 26d, 19d, 20d }; // 期望输出值
        double theta[] = { 2d, 6d }; // 权重参数 因为这里只涉及到两个变量 ，即X为两列输入
        double learningRate = 0.01;
        double maxLoss = 0.0001; // 损失值
//        bg.batchGradientDescent(inputDataMatrix, expectResult, theta, learningRate,100,maxLoss);
//        bg.stochasticGradientDescent(inputDataMatrix, expectResult, theta, learningRate,100,maxLoss);

        double[][] newTheta = bg.addOneColumn4Arr2D(inputDataMatrix,1d);
        bg.printArr2(newTheta);

        System.out.println(Arrays.toString(bg.addOneColumn4Arr(theta,1d)));

    }
}