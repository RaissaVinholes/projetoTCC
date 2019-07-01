<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>
<!-- FORMULÁRIO PARA EDITAR AS MANUTENÇÕES-->
<div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
    <div class="card-header">
        <h5 class="title">Alterar Manutenção</h5>
    </div>
     <div class="card-body">
        <!--MODIFICAR PARA ADD-->
        <form action="index.jsp" method="POST" enctype="multipart/form-data"> <!--UploadWS-->
            <input type="hidden" name="urldestino" value="index.jsp"><!--AdminWS-->
            <div class="row">
                <div class="col-md-5 pr-md-1"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Oficina</label>
                        <input type="text" name="txtOficina" required class="form-control" ><!-- placeholder="Nome"-->
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Endereço</label>
                        <input type="text" name="txtEndereco" required class="form-control" >
                    </div>
                </div>
            </div>
            <div class="row">
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
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Data da Manutenção</label>
                        <input type="date" name="txtDataManut" required class="form-control" >
                    </div>
                </div>
            </div>
            
             <div class="row">
                <div class="col-md-10"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Problema</label>
                        <input type="text" name="txtProblema" required class="form-control" >
                    </div>
                </div>
            </div>
            <div class="row">
                
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Valor</label>
                        <input type="number" step="0.01" name="txtValor" required class="form-control" placeholder="R$" >
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