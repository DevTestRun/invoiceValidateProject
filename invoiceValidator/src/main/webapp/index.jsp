<html>
<body>
	<h2>Validate Invoicing Details</h2>

	<script src="js/jquery-3.0.0.js"></script>
	<script src="js/jquery-3.0.0.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){ 
		$('#secondpage').hide();
	});
	
	 function uploadFile(event) {
         event.stopPropagation();
         event.preventDefault();
         var form = document.getElementById('form2Submit');
         var data = new FormData(form);
         postFilesData(data);
		}

     function postFilesData(data) {
         $.ajax({
             url :  'yourUrl',
             type : 'POST',
             data : data,
             cache : false,
             dataType : 'json',
             processData : false,
             contentType : false,
             success : function(data, textStatus, jqXHR) {
                 alert(data);
             },
             error : function(jqXHR, textStatus, errorThrown) {
                 alert('ERRORS: ' + textStatus);
             }
         });
     }
	function validateAndOpenNewWindow(){
		$('#firstPage').hide();
		$('#secondpage').show();	
		return false;
		}
	</script>
	<div id="firstPage">
	<form id="form2Submit">
		<div>
		 <label> Upload SOW: <input 	type="text" name="datafile" />  
		 <input 	type="file" name="datafile" />  
		 </label> <br>
		  <label> Upload DO: <input 	type="text" name="datafile" />  
		  <input 	type="file" name="datafile" />  
		  </label>
		    <br>    
		   <label> Upload ExcelSheet: <input 	type="text" name="datafile" />
		   <input 	type="file" name="datafile" />  
		     </label> <br>          
		</div>
		<div>
		<label> Validate Data: <input type="button" value="Validate Data" onclick="validateAndOpenNewWindow()"/>  </label>           
		</div>
	</form>
	</div>
	<div id="secondpage">
	<div style="display:inline-block;width:30%">ABC</div>
	<div style="display:inline-block;width:30%">XYS</div>
	<div style="display:inline-block;width:30%">PQR</div>
	</div>
</body>
</html>
