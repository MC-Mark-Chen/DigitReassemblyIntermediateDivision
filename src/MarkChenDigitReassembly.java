import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MarkChenDigitReassembly {
    public static void sum() throws FileNotFoundException 
    {
        File file = new File("/Users/mark/Library/CloudStorage/OneDrive-个人/AP CSA/Assignments/digit-reassembly-intermediate-sampledata.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine())
        {

            String target = scanner.next();
            int index = scanner.nextInt();
            int length = target.length();
            Long output = 0L;

            while(length > 0)
            {   

                if(length == index)
                {

                    output += Long.parseLong(target.substring(0, index));
                    break;

                }

                output += Long.parseLong(target.substring(0, index));
                target = target.substring(1);
                length--;

            }

            System.out.println("Sum = " + output);

        }
    }
}