<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>
<div class="content">
	<div class="main-list">
	    <div class="list">
  		   <div class="poplink" poplink="#pop1">
				<img src="${pageContext.request.contextPath}/resources/images/asdf.png">
                <label>
                    이미지 라벨
                </label>
                <p>이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1이름1</p>
			    <c:if test="${sessionScope.id == 'admin'}">
					<form action="updateBizData.do" method="post" id="updateForm">
						<input type="hidden" name="bizDatano" value="1">
			            <button type="button" class="update-btn">삭제</button>
					</form>
				</c:if>
            </div>
            
            <div class="poplink" poplink="#pop2">
     	       <img src="${pageContext.request.contextPath}/resources/images/img_none.jpg">
                <label>
                    이미지 라벨
                </label>
                <p>이름2</p>
				<form action="updateBizData.do" method="post" id="updateForm">
					<input type="hidden" name="bizDatano" value="2">
					<c:choose>
					    <c:when test="${sessionScope.id == 'admin'}">
				            <button type="button" class="update-btn">삭제</button>
				        </c:when>
				    </c:choose>
				</form>
            </div>
            <div class="poplink" poplink="#pop3">
            	<img src="${pageContext.request.contextPath}/resources/images/수박앵.png">
                <label>
                    이미지 라벨
                </label>
                <p>이름3</p>
                <form action="updateBizData.do" method="post" id="updateForm">
					<input type="hidden" name="bizDatano" value="3">
					<c:choose>
					    <c:when test="${sessionScope.id == 'admin'}">
				            <button type="button" class="update-btn">삭제</button>
				        </c:when>
				    </c:choose>
				</form>
            </div>
	    </div>
	</div>
</div>