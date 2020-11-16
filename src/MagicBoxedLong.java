public class MagicBoxedLong {
    public static void main(String[] args) {
        for (int index = 0; index < 199; index++){
            Long long1 = Long.valueOf(String.valueOf(index));
            Long long2 = Long.valueOf(String.valueOf(index));
            boolean isEqual = long1 == long2;
            System.out.println("oldValue is " + long1 +", newValue is " + long2 +", result is "+ isEqual);
        }
    }
}
