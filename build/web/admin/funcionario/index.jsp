<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>
<!-- TABLE PARA MOSTRAR O RESUMO DOS Motoristas-->


        
   <div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Lista de Funcionários</h5>
              </div>
              <div class="card-body">
                <div class="table-responsive">
                  <table class="table">
                    <thead class=" text-primary">
                     <th>
                       ID
                     </th>
                     <th>
                        Nome
                      </th>
                      <th>
                        Telefone
                      </th>
                      <th > <!--class="text-right"-->
                        Endereço
                      </th>
                      <th>
                        Email
                      </th>
                      
                      <th>
                        Informações
                      </th>
                    </thead>
                    <tbody>
                         <tr>
                            <td>1</td> <!---->
                            <td>raissa</td> <!---->
                            <td>999598748</td><!---->
                            <td>${obj.endereco}</td><!---->
                            <td>${obj.email}</td><!---->
                            
                            <td>
                                <a class="now-ui-icons travel_info" href="info.jsp"><!--AdminWS?acao=edit&id= obj.id -->
                                    <i class="tim-icons icon-pencil"></i>
                                </a>
                            </td>
                    <c:forEach items="${lista}" var="obj">
                       
                    </c:forEach>        
                </tbody>
                  </table>
                </div>
                   <a class="now-ui-icons ui-1_simple-add" href="add.jsp">
            <i class="tim-icons icon-pencil"> </i> Adiciona
        </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    <%@include file="../rodape.jsp" %>
                            