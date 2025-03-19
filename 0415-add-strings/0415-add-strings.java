import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
    BigInteger s=new BigInteger(num1);
       BigInteger v= new BigInteger(num2);
       BigInteger  sum=s.add(v);

    
    return sum.toString();
    }
}
    