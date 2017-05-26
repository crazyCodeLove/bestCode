package com.huitong.jianzhiOffer;

/**
 * Created by allen on 2017/5/26.
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class ConstructTree {

     public static Node reConstructBinaryTree(int[] pre, int[] in){
          return reConstractBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
     }

     private static Node reConstractBinaryTree(int[] pre, int startP, int endP, int[] in, int startI, int endI){
          if( startP>endP || startI>endI)
               return null;

          Node root = new Node(pre[startP]);

          for(int i=startI;i<=endI;i++){
               if (in[i] == pre[startP]){
                    root.left = reConstractBinaryTree(pre, startP+1,startP + i-startI, in, startI, i-1);
                    root.right = reConstractBinaryTree(pre, startP+i-startI+1, endP, in, i+1,endI);
                    break;
               }
          }

          return root;
     }

     public static void showTree(Node treeNode){
          if (treeNode==null)
               return;
          System.out.print(treeNode.val + " ");
          if (treeNode.left!=null)
               showTree(treeNode.left);

          if (treeNode.right != null)
               showTree(treeNode.right);
     }

     public static void main(String[] args) {
          int[] pre = {1,2,4,7,3,5,6,8};
          int[] in = {4,7,2,1,5,3,8,6};
          Node root = reConstructBinaryTree(pre, in);
          showTree(root);
     }
}

class Node {
     int val;
     Node left;
     Node right;
     Node(int x) { val = x; }
}
