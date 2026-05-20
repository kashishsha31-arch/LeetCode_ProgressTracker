class Solution {
    public int[] plusOne(int[] digits) {
//if the lsd is >9 then +1 to the prev one 
    for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;//making first digit as 1 
return digits;
}
}