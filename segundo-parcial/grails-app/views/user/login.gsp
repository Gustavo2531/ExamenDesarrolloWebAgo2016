

 <!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'login.label', default: 'Login')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
       <table>
    <tbody>
    <tr>
        <td>
            Username:
        </td>
        <td>
            <input type="text" name="username" id="username" />
        </td>
    </tr>
    <tr>
        <td>
            Password:
        </td>
        <td>
            <input type="password" name="password" id="password" />
        </td>
    </tr>
    <tr>
    <fieldset class="buttons">
                    <input type="submit" name="login" class="login" value="Login" id="login">
                </fieldset>
    </body>
</html>