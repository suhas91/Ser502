function fact(n){
 	result = 1;
 	
	print "number_is";	
	print n;
 	
	while(n>1){
		result = result*n;
		n = n-1;
	}
	
	print "Factorial_is";
	print result;
}

rand = 5;
call fact(rand);



