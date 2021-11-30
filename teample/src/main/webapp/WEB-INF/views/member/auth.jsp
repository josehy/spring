<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>

<style type="text/css">

</style>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<style>
@import url('https://fonts.googleapis.com/css2?family=Gugi&display=swap');
</style>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/join1.css" > 
<body>
<%@ include file="../top.jsp" %>
  <script>
  var count = 0; /* 문자 중복을 막기 위한 인증번호 */
   
 $(document).ready(function() {

    $("#send").click(function() {
       
       var number = Math.floor(Math.random() * 100000) + 100000;
          if(number>100000){
             number = number - 10000;
          }

          $("#text").val(number);      /* 난수로 생성된 인증번호를 hidden name : text 에 숨긴다 */
       
       var to = $("#to").val();
       
       if(to == "" || to == null){
          alert("빈칸이나 공백을 채워주세요");
       }
       
       else {
       var con_test = confirm("해당번호로 인증문자를 발송하시겠습니까?");          
          if(con_test == true){              
             if(count < 3){              
               $.ajax({
                   url:"sendsms/" + to,
                   type:"post",
                   data:{to: $("#to").val(),
                        text: $("#text").val()
                        },
                 success:function(){
                   alert("해당 휴대폰으로 인증번호를 발송했습니다");
                   count++;
                   
                   alert(count);
                   }
                });
             } else {
                alert("휴대폰 인증 그만하세요")
             }
          
          }
             else if(con_test == false){
                
             }
         }   
    })
    $("#enterBtn").click(function() {   /* 내가 작성한 번호와 인증번호를 비교한다 */
       var userNum = $("#userNum").val();
       
       var sysNum = $("#text").val();         
       
       if(userNum == null || userNum == ""){
          alert("휴대폰으로 발송된 인증번호를 입력해주세요");
       }     
       else{     
          if(userNum.trim() == sysNum.trim()){
              alert("인증에 성공하였습니다.");   
              url : 'member/join'
           }
           else {
              alert("인증번호가 다릅니다.");
              return false;
           }          
       }
    });
  });
  </script>
  <div id="contents"> 
	<form action="join" method="post" name="frmAuth">
	<h3>휴대폰 인증</h3>
	<input type="hidden" name="step" value="1">
      	휴대폰번호 : <input type="text" id="to" name="to"/> 
    <input type="button" id="send" value="전송"/><br> 
     	인증   번호 : <input type="text" id="userNum">
  	<input type="submit" id="enterBtn" value="확인" > 
  
	  <input type="hidden" name="text" id="text"> 
	 
	</form>  
    </div>
 <div>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</div>
<%@ include file="../bottom.jsp" %>
</body>
</html>

