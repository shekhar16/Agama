[#ftl output_format="HTML"]
<!DOCTYPE html>
<html lang="en">
<head><meta charset="UTF-8"><meta http-equiv="X-UA-Compatible" content="IE=edge"><meta name="viewport" content="width=device-width, initial-scale=1.0"><title>Blank_Template
	</title></head>
<body>

  
	
	
	
	
  
  
	<h2>Redirect to a Webpage
	</h2>
	<p>The replace() method replaces the current document with a new one:
	</p>
	<button type="button">Replace document</button>
  
  
</body>

<script>
	var redirecturl = "${url}"
	console.log("before replacing : " + redirecturl);
	redirecturl = redirecturl.replace(/&amp;/g, "&");
	console.log("post replacing : " + redirecturl);
	window.location.href=redirecturl;
  </script>
</html>