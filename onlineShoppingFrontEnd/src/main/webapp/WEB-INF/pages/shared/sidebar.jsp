<h1 class="my-4">Catagories</h1>
<div class="list-group">
	<c:forEach var="cat" items="${catagories }">
		<a href="${rootContext}/show/cat/${cat.id}/products" class="list-group-item" id="a_${cat.name}">${cat.name }</a>
	</c:forEach>

</div>