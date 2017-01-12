package com.leetcode.algorithms.HammingDistance;

/**
 * 计算两个数字的汉明距离
 * 
 * @author jingtao
 * @version $Id: Solution.java, v 0.1 2017年1月12日 上午10:12:47 jingtao Exp $
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        char[] xArray = transferNumber2CharArray(x, 32);
        char[] yArray = transferNumber2CharArray(y, 32);

        //比较相同位数的不同值
        int rtvCount = 0;
        for (int i = 0; i < 32; i++) {
            if (xArray[i] != yArray[i]) {
                rtvCount++;
            }
        }

        return rtvCount;
    }

    public char[] transferNumber2CharArray(int number, int dimensionOfCharArray) {
        char[] src = Integer.toBinaryString(number).toCharArray();
        char[] dest = new char[dimensionOfCharArray];
        System.arraycopy(src, 0, dest, dimensionOfCharArray - src.length, src.length);
        for (int i = 0; i < 32 - src.length; i++)
            dest[i] = '0';
        return dest;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingDistance(1, 4));
    }
}
