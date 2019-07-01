<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>
<!-- FORMULÁRIO PARA REGISTRAR OS FRETES-->
<div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
    <div class="card-header">
        <h5 class="title">Registrar Frete</h5>
    </div>
    <div class="card-body">
        <!--MODIFICAR PARA ADD-->
        <form action="index.jsp" method="POST" enctype="multipart/form-data"> <!--UploadWS-->
            <input type="hidden" name="urldestino" value="index.jsp"><!--AdminWS-->
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
                        <input type="text" name="txtDestinoCarga" required class="form-control" >
                    </div>
                </div>
            </div>
            <div class="row">
                
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Tipo de carga</label>
                        <input type="text" name="txtTipoCarga" required class="form-control">
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Quilometragem percorrida</label>
                        <input type="text" name="txtKmPercorrida" required class="form-control">
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Data de entrega</label>
                        <input type="date" name="txtDataEntrega" required class="form-control">
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                <div class="form-group">
                        <label>Forma de Pagamento</label>
                        <input type="text" name="txtFormaPagamento" required class="form-control">
                    </div>
                </div>
            </div>
            <div class="row">
                
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Horário da entrega</label>
                        <input type="text" name="txtHorarioEntrega" required class="form-control">
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Valor</label>
                        <input type="text" name="txtValor" required class="form-control">
                    </div>
                </div>
            
            </div>


            <button class="btn btn-primary btn-round text-center" type="submit">
                <i class="tim-icons icon-cloud-upload-94"></i> Salvar
            </button>
            <a class="btn btn-primary btn-round text-center" href="index.jsp"><!--AdminWS?acao=list-->
                <i class="tim-icons icon-bullet-list-67"></i> Listar
            </a>
        </form>
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
</div>
    <%@include file="../rodape.jsp" %>