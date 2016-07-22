 function validateForm()
		{
			var x=document.forms["changePasswdForm"]["passwd"].value;
			var y=document.forms["changePasswdForm"]["confPasswd"].value;
			if (x==null || x=="") {
				  alert("No inputs ....");				  
				  return false;
			  } else if ( x.length < 6 ) {
				  alert("Password length too short.");
				  return false;
			  } else if ( x != y ) {
				  alert("Mismatched confirm password.");
				  return false;
			  }
		}

function getParameter() {
	var q_contents = location.search.split("?");
	var params = q_contents[1].split("&");
	
	var key_value = params[0].split("=");
	var id_value = params[1].split("=");
	
	document.getElementById("key_id").value = key_value[1];
	document.getElementById("protocol_id").value = id_value[1];
 	return;
}
