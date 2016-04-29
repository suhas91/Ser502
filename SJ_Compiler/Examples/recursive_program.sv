var ct = 0;
function recurse_func(x){
	
	if(ct < x){
		print x;
		x = x - 1;
		call recurse_func(x);
	}else{
		print "executed";
	}
	
}

var a = 10;
call recurse_func(a);