<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>
<!-- FORMA PARA MOSTRAR AS INFORMAÇÕES DOS FRETES-->
<div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
    <div class="card-header">
        
        <h5 class="title">Informações do Frete </h5>
        
    </div>
                
                <div class="col-md-10 pr-md-1" style="text-align: right">
                                <a class="fa fa-trash fa-2x pull fa-border" href="index.jsp"> <!--btn btn-info btn-fab btn-icon btn-round // LivroWS?acao=edit&id=${obj.id}-->
                <i class="tim-icons icon-pencil"></i>
            </a>
                           
                                <a class="fa fa-edit fa-2x pull fa-border" href="edita.jsp"> <!--btn btn-info btn-fab btn-icon btn-round // LivroWS?acao=edit&id=${obj.id}-->
                <i class="tim-icons icon-pencil" ></i>
            </a>
            </div>
   <div class="card-body">
        <!--MODIFICAR PARA ADD-->
       <div class="row">
                <div class="col-md-3 pr-md-1">
                    <div class="form-group">
                        <label>Id</label>
                        <input type="text" class="form-control" name="txtId" placeholder="Id" value="${obj.id}" readonly>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Cliente</label>
                        <select class="form-control" name="txtCliente">
                            <c:forEach items="${cliente}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select> 
                    </div>
                </div>
                 <div class="col-md-5 pr-md-1"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Caminhão</label>
                        <select class="form-control" name="txtCaminhao">
                            <c:forEach items="${caminhao}" var="obj">
                                <option value="${obj.id}">${obj.modelo}</option>
                            </c:forEach>
                        </select> 
                    </div>
                </div>
            </div>
           
            <div class="row">
                 <div class="col-md-5 pr-md-1"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Motorista</label>
                        <select class="form-control" name="txtMotorista">
                            <c:forEach items="${motorista}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select> 
                    </div>
                </div>
                 <div class="col-md-5 pr-md-1"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Funcionários</label>
                        <div class="form-group">
                        <select class="form-control" name="txtFuncionario1">
                            <c:forEach items="${funcionario}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select> 
                        </div>
                        <div class="form-group">
                        <select class="form-control" name="txtFuncionario2">
                            <c:forEach items="${funcionario}" var="obj">
                                <option value="${obj.id}">${obj.nome}</option>
                            </c:forEach>
                        </select> 
                        </div>
                    </div>
                </div>
            </div>
             <div class="row">
                <div class="col-md-10"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Destino da carga</label>
                        <input type="text" name="txtDestinoCarga" required class="form-control" readonly >
                    </div>
                </div>
            </div>
            <div class="row">
                
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Tipo de carga</label>
                        <input type="text" name="txtTipoCarga" required class="form-control" readonly>
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Quilometragem percorrida</label>
                        <input type="text" name="txtKmPercorrida" required class="form-control" readonly>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Data de entrega</label>
                        <input type="date" name="txtDataEntrega" required class="form-control" readonly>
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                <div class="form-group">
                        <label>Forma de Pagamento</label>
                        <input type="text" name="txtFormaPagamento" required class="form-control" readonly>
                    </div>
                </div>
            </div>
            <div class="row">
                
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Horário da entrega</label>
                        <input type="text" name="txtHorarioEntrega" required class="form-control" readonly>
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Valor</label>
                        <input type="text" name="txtValor" required class="form-control" readonly>
                    </div>
                </div>
            
            </div>
        <a class="btn btn-primary btn-round text-center" href="index.jsp"><!--AdminWS?acao=list-->
                <i class="tim-icons icon-bullet-list-67"></i> Listar
            </a>
    </div>

    <div class="card-footer">
         
        <c:if test = "${not empty msg}">
            <div class="alert alert-primary alert-dismissible fade show" role="alert">
                ${msg}
                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                    <i class="tim-icons icon-simple-remove"></i>
                </button>
            </div>
        </c:if>
        
    </div>
</div>
</div>
              </div>
            </div>
          </div>
        </div>

    <%@include file="../rodape.jsp" %>