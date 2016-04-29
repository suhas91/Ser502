var scopeofX = 10;

function scopeTest(testVar){

	print testVar;
	
	var scopeofY = 20;
	
	print "global scope of X testing inside a function";
	print scopeofX;
	print "local scope of variable Y";
	print scopeofY;	
	
	
}

var randvar = "scopeTest";
call scopeTest(randvar);

print "Try accessing  global variable's scope";
print scopeofX;
print "Try accessing local variable's scope";
print scopeofY;