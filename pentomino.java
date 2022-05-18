public class pentomino {
   public int d;

   public pentomino(int d) {
      this.d = d;
   }

   public int[][][] pentomino_pieces() {
      int[][][] array =  {{{0, 0}, {1, 0}, {2, 0}, {3, 0}, {4, 0}}, {{0, 0}, {1, 0}, {2, 0}, {3, 0}, {3, 1}}, {{0, 0}, {0, 1}, {1, 0}, {2, 0}, {3, 0}}, {{0, 0}, {0, 1}, {0, 2}, {1, 2}, {0, 3}}, {{0, 0}, {0, 1}, {1, 1}, {0, 2}, {0, 3}}, {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}, {{0, 0}, {1, 0}, {2, 0}, {1, 1}, {2, 1}}, {{0, 0}, {1, 0}, {2, 0}, {0, 1}, {1, 1}}, {{0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 4}}, {{0, 0}, {1, 0}, {0, 1}, {0, 2}, {0, 3}}, {{0, 0}, {0, 1}, {0, 2}, {0, 3}, {1, 3}}, {{0, 0}, {1, 0}, {0, 1}, {0, 2}, {1, 2}}, {{0, 0}, {0, 1}, {0, 2}, {1, 2}, {0, 3}}, {{0, 0}, {0, 1}, {0, 2}, {-1, 2}, {0, 3}}, {{0, 0}, {0, 1}, {1, 1}, {0, 2}, {0, 3}}, {{0, 0}, {0, 1}, {-1, 1}, {0, 2}, {0, 3}}, {{0, 0}, {1, 0}, {2, 0}, {3, 0}, {2, -1}}, {{0, 0}, {1, 0}, {1, -1}, {2, 0}, {3, 0}}, {{0, 0}, {1, 0}, {0, 1}, {1, 1}, {0, 2}}, {{0, 0}, {1, 0}, {0, 1}, {1, 1}, {1, 2}}, {{0, 0}, {0, 1}, {1, 1}, {2, 1}, {2, 0}}, {{0, 0}, {1, 0}, {1, 1}, {1, 2}, {0, 2}}, {{0, 0}, {1, 0}, {1, 1}, {2, 1}, {2, 2}}, {{0, 0}, {1, 0}, {0, 1}, {-1, 1}, {-1, 2}}, {{0, 0}, {0, 1}, {1, 1}, {1, 2}, {2, 2}}, {{0, 0}, {0, 1}, {-1, 1}, {-1, 2}, {-2, 2}}, {{0, 0}, {0, 1}, {-1, 1}, {0, 2}, {1, 2}}, {{0, 0}, {0, 1}, {1, 1}, {0, 2}, {-1, 2}}, {{0, 0}, {1, 0}, {2, 0}, {1, 1}, {2, -1}}, {{0, 0}, {0, 1}, {1, 1}, {2, 1}, {1, 2}}, {{0, 0}, {0, 1}, {1, 1}, {2, 1}, {2, 2}}, {{0, 0}, {0, 1}, {-1, 1}, {-2, 1}, {-2, 2}}, {{0, 0}, {1, 0}, {2, 0}, {2, 1}, {2, -1}}, {{0, 0}, {0, 1}, {0, 2}, {1, 2}, {2, 2}}, {{0, 0}, {0, 1}, {0, 2}, {-1, 2}, {1, 2}}, {{0, 0}, {1, 0}, {2, 0}, {1, 1}, {1, 2}}, {{0, 0}, {0, 1}, {-1, 1}, {1, 1}, {1, 2}}, {{0, 0}, {0, 1}, {1, 1}, {1, 2}, {1, 3}}, {{0, 0}, {0, 1}, {-1, 1}, {-1, 2}, {-1, 3}}, {{0, 0}, {1, 0}, {1, -1}, {2, -1}, {3, -1}}, {{0, 0}, {1, 0}, {2, 0}, {2, 1}, {3, 1}}, {{0, 0}, {1, 0}, {2, 0}, {2, -1}, {3, -1}}, {{0, 0}, {1, 0}, {1, 1}, {2, 1}, {3, 1}}, {{0, 0}, {0, 1}, {0, 2}, {-1, 2}, {-1, 3}}, {{0, 0}, {0, 1}, {0, 2}, {1, 2}, {1, 3}}, {{0, 0}, {1, 0}, {0, 1}, {0, 2}, {-1, 2}}, {{0, 0}, {1, 0}, {1, 1}, {1, 2}, {2, 2}}, {{0, 0}, {1, 0}, {1, 1}, {2, 1}, {1, 2}}, {{0, 0}, {1, 0}, {0, 1}, {0, 2}, {-1, 1}}, {{0, 0}, {0, 1}, {1, 0}, {2, 0}, {1, -1}}, {{0, 0}, {1, 0}, {1, -1}, {2, 0}, {2, 1}}, {{0, 0}, {0, 1}, {0, 2}, {0, 3}, {-1, 3}}, {{0, 0}, {1, 0}, {1, 1}, {1, 2}, {1, 3}}, {{0, 0}, {0, 1}, {1, 1}, {2, 1}, {3, 1}}, {{0, 0}, {1, 0}, {2, 0}, {3, 0}, {3, -1}}, {{0, 0}, {1, 0}, {2, 0}, {-1, 0}, {-1, 1}}, {{0, 0}, {1, 0}, {2, 0}, {1, -1}, {2, -1}}, {{0, 0}, {0, 1}, {1, 1}, {0, 2}, {1, 2}}, {{0, 0}, {0, 1}, {-1, 1}, {0, 2}, {-1, 2}}, {{0, 0}, {0, 1}, {0,2 }, {1, 2}, {2, 2}}, {{0, 0}, {0, 1}, {0, 2}, {-1, 2}, {-2, 2}}, {{0, 0}, {1, 0}, {2, 0}, {2, 1}, {2, 2}}, {{0, 0}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}};
      return array;
   }

   public static void main(String[] args) {
      System.out.println("hello world");
   }
}