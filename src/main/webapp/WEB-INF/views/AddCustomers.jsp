<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Customer</title>

</head>
<style>
    .red {
        color: red;
    }

    .form-area {
        background-color: #FAFAFA;
        padding: 10px 40px 60px;
        margin: 10px 0px 60px;
        border: 1px solid GREY;
    }
</style>


<body>
<div class="container">
    <div class="col-md-5">
        <div class="form-area">
            <form:form name="AddEmp" id="AddEmp" modelAttribute="customer">
                <form:input type="hidden" path="cusId" id="cusId"/>
                <br style="clear:both">
                <h3 style="margin-bottom: 25px; text-align: center;">Add Customer</h3>
                <div class="form-group">
                    <form:input type="text" class="form-control" id="name" path="cName"
                                placeholder="Name"/>
                </div>
                <div class="form-group">
                    <form:input type="text" class="form-control" id="address" path="cAddress"
                                placeholder="Address"
                    />
                </div>
                <div class="form-group">
                    <form:input type="text" class="form-control" id="email" path="cEmail" placeholder="Email"
                    />
                </div>
                <div class="form-group">
                    <form:input type="text" class="form-control" id="contact" path="cContact" placeholder="Contact No"
                    />
                </div>
                <div class="form-group">
                    <form:input type="text" class="form-control" id="nic" path="nic" placeholder="NIC"/>
                </div>
                <c:choose>
                    <c:when test="${edit}">
                        <button type="button" name="btnUpdate" id="btnUpdate" class="btn btn-primary pull-right">
                            <span>Update Customer</span></button>
                    </c:when>
                    <c:otherwise>
                        <button type="button" name="btnSave" id="btnSave" class="btn btn-primary pull-right">
                            <span>Save Customer</span></button>
                    </c:otherwise>
                </c:choose>
            </form:form>
        </div>
    </div>
    <div id="customerDetail" class="col-md-7"></div>
</div>
<div>

</div>
<script>
    $(function () {
        $('#customerDetail').load('/loadAllCustomers');
    });

    $("#btnSave").click(function (e) {
        try {
            $.ajax({
                url: "/saveCustomer",
                type: 'GET',
                data: $("#AddEmp").serialize(),
                beforeSend: function (xhr, opts) {
                    if (!validate()) {
                        xhr.abort();
                    }
                },
                success: function (data) {
                    alert(data);
                    $("#AddEmp").closest('form').find("input[type=text], textarea").val("");
                    $('#customerDetail').load('/loadAllCustomers');
                },
                error: function (errorThrown) {
                    alert("error " + errorThrown);
                }
            });
        } catch (exception) {
            alert("ERROR");
            console.error(exception);
        }
        e.preventDefault();
    });

    $("#btnUpdate").click(function (e) {
        try {
            var cusId = $("#cusId").val();
            $.ajax({
                url: "/update-" + cusId + "-customer",
                type: 'GET',
                data: $("#AddEmp").serialize(),
                beforeSend: function (xhr, opts) {
                    if (!validate()) {
                        xhr.abort();
                    }
                },
                success: function (data) {
                    alert(data);
                    $("#AddEmp").closest('form').find("input[type=text], textarea").val("");
                    $('#customerDetail').load('/loadAllCustomers');
                },
                error: function (errorThrown) {
                    alert("error " + errorThrown);
                }
            });
        } catch (exception) {
            alert("ERROR");
            console.error(exception);
        }
        e.preventDefault();
    });

    function validate() {
        var name = $("#name");
        var email = $("#email");
        var mobile = $("#contact");

        if ($.trim(name.val()).length < 1) {
            alert("Enter a valid name");
            name.focus();
            return false;
        } else if ($.trim(email.val()) == 0) {
            alert('Please enter valid email address');
            email.focus();
            return false;
        } else if ($.trim(email.val()) >= 7) {
            if (!validateEmail($.trim(email.val()))) {
                alert('Please enter valid email address');
                email.focus();
                return false;
            }

        } else if ($.trim(mobile.val()) <= 8) {
            alert("Enter a valid mobile number");
            mobile.focus();
            return false;
        } else {
            return true;
        }
    }

    function validateEmail(Email) {
        var pattern = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;

        return $.trim(Email).match(pattern) ? true : false;
    }
</script>
</body>
</html>
