package HW_ONE.secondHomeWork.chapter3.FourFive;

public class IntSequenceImpl implements  IntSequence {

    //          ANONYMOUS
    public IntSequence intSequence1=new IntSequence() {
        @Override
        public String of(int... val) {
            StringBuilder result=new StringBuilder("");
            for (int value:val
            ) {
                result.append(value+" ");
            }
            return result.toString();
        }
    };

    @Override
    public String of(int... val) {
        StringBuilder result=new StringBuilder("");
        for (int value:val
             ) {
            result.append(value+" ");
        }
        return result.toString();
    }


    public void constant(int newConst){
        try {
            while (true) {
                System.out.print("" + newConst + " ");
            }
        }catch (StackOverflowError ex){
            System.out.println("the end");
        }
    }


    public static void main(String[] args) {
        IntSequenceImpl intSequence=new IntSequenceImpl();
        System.out.println(intSequence.of(8,9,13,-6));

        System.out.println(intSequence.intSequence1.of(9,5,-2,7));
        //intSequence.constant(5);



        // OR
        /*
        IntSequence intSequence2=(int...val) -> {
            StringBuilder result=new StringBuilder("");
            for (int value:val
            ) {
                result.append(value+" ");
            }
            return result.toString();
        };
         */
    }
}
