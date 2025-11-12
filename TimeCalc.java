public class TimeCalc {
    public static void main(String[] args)
     {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int mToAdd = Integer.parseInt(args[1]);
        int totalM = (hours * 60) + minutes + mToAdd;
        int totalH = totalM / 60;
        int newHour = totalH % 24;
        int newMinutes = totalM - (totalH*60);
        if (newHour<10)
        {
            System.out.print("0" + newHour + ":");
        }
        else if (newHour == 0) 
        {
            System.out.print("00:");
        }
        else
        {
            System.out.print(newHour + ":");
        }
        if (newMinutes<10)
        {
            System.out.println("0" + newMinutes);
        }
        else if (newMinutes == 0) 
        {
            System.out.println("00");
        }
        else
        {
            System.out.println(newMinutes);
        }
    }
}
