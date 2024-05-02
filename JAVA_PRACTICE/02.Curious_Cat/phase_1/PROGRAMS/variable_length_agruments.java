

public class variable_length_agruments{

        void add(int ... nums)
        {
            int sum = 0;
            for(int num : nums)
            {
                sum += num;
            }
            System.out.println("Sum: " + sum);
        }


        public static void main(String[] args) {
            variable_length_agruments obj = new variable_length_agruments();
            
            obj.add(2,2);
            obj.add(2,3,7);
            obj.add(2,6,8,9,10);

        }
}
