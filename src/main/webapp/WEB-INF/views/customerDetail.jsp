<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="table table-sm table-hover">
    <thead>
    <tr>
        <th>Name</th>
        <th>Address</th>
        <th>Email</th>
        <th>Contact No</th>
        <th>NIC</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="customer" varStatus="loop">
        <tr>
            <td scope="row"><a href="#" onclick="editCus(${customer.cusId})">${customer.cName}</a></td>
            <td>${customer.cAddress}</td>
            <td>${customer.cEmail}</td>
            <td>${customer.cContact}</td>
            <td>${customer.nic}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script>
    function editCus(id) {
        $('#side_pages').load('/edit-' + id + '-customer');
    }
</script>