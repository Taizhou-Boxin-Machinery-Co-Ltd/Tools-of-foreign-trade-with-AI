package cn.boxin;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

public class Nd4jCreate {
    public static void main(String[] args) {
        //全0
        INDArray zeros = Nd4j.zeros(3, 5);
        System.out.println(zeros);
        //全1
        INDArray ones = Nd4j.ones(3, 5);
        System.out.println(ones);
        //随机生产
        INDArray rands = Nd4j.rand(3, 5);
        System.out.println(rands);
        //高斯分布
        INDArray randns = Nd4j.randn(3, 5);
        System.out.println(randns);
    }
}
