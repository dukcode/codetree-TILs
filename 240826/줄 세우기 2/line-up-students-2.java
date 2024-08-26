import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    PriorityQueue<Student> students = new PriorityQueue<>(
        (a, b) -> a.h == b.h ? a.w - b.w : a.h - b.h);
    List<Student> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int h = sc.nextInt();
      int w = sc.nextInt();

      Student student = new Student(h, w);
      ans.add(student);
      students.add(student);
    }

    for (int i = 1; i <= n; i++) {
      students.poll().setIdx(i);
    }

    for (int i = 0; i < n; ++i) {
      System.out.println(ans.get(i));
    }
  }

  private static class Student {

    private int h;
    private int w;
    private int idx;

    public Student(int h, int w) {
      this.h = h;
      this.w = w;
    }

    public void setIdx(int idx) {
      this.idx = idx;
    }

    @Override
    public String toString() {
      return h + " " + w + " " + idx;
    }
  }

}