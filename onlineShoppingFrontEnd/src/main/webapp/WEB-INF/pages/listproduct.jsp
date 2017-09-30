<div class="container">

	<div class="row">
		<!-- Would be to display sidebar -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<div class="col-md-9">
			<!-- added Breadcrumb component -->

			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllproducts==true}">
						<ol class="breadcrumb">
							<li><a href="${rootContext}/home">Home </a><span class="active">/ All Product</span></li>
							
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts==true}">
						<ol class="breadcrumb">
							<li><a href="${rootContext}/home">Home </a><span class="active">/ Category</span>
							<span class="active">/ ${category.name}</span>
							</li>
						</ol>
					</c:if>

				</div>

			</div>

		</div>

	</div>
	<!-- To display the actual product -->


</div>