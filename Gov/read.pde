import java.util.*;
import java.io.*;

class read {
  int[][] nums = new int[35][16];
  String[] names = new String[16];
  ArrayList<String> dates = new ArrayList<String>();
  Scanner scan;
  String temp;
  int a = 0;
  int b = 0;

  read() {
    try {
      scan = new Scanner(
          new File(
              "C:\\EclipseWorkspaces\\csse120\\New folder\\gov\\src\\data\\inst.txt"));
    } catch (Exception e) {
      System.out.println(e);
    }
    scan.useDelimiter("  ");

    while (scan.hasNext()) {

      if (a % 17 == 0) {
        dates.add(0,scan.nextLine());

        // System.out.println("1");
      } else {
        temp = scan.nextLine();
        if (!(temp.equals("--"))) {

          nums[34-(a / 17)][a % 17 - 1] = Integer.valueOf(temp);

          // System.out.println("2");
        }

      }

      a++;
    }
    names[0] = "The church";
    names[1] = "The Military";
    names[2] = "The U.S. Supreme Court";
    names[3] = "Banks";
    names[4] = "The public schools";
    names[5] = "Newspapers";
    names[6] = "Congress";
    names[7] = "Television News";
    names[8] = "Organized labor";
    names[9] = "The Presidency";
    names[10] = "The police";
    names[11] = "The Medical system";
    names[12] = "The criminal justice system";
    names[13] = "Big business";
    names[14] = "Small business";
    names[15] = "Health Maintenance Organizations";

    int d = 0;
    for (String k : dates) {
      dates.set(d, k.substring(0, 4));
      d++;
    }
  }

  public int[][] num() {
    return nums;
  }

  public ArrayList<String> dat() {
    return dates;
  }

  public String[] nam() {
    return names;

  }
}

