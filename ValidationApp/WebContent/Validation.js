function validation()
{
	var name=document.myform.t1.value;
	var age=document.myform.t2.value;
	document.myform.vflag.value="yes";
	if(name=="")
		{
		alert("Name is Mandatory");
		document.myform.t1.focus();
		return false;
		}
	if(age=="")
		{
		alert("Age is Mandatory");
		document.myform.t2.focus();
		return false;
		}
	else
		{
		if(isNaN(age))
			{
			alert("Age must be Numeric");
			document.myform.t2.value="";
			document.myform.t2.focus();
			return false
			}
		}
	return true;
}