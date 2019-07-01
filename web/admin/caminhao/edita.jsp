<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>
<!-- FORMULÁRIO PARA REGISTRAR OS CAMINHÕES-->
<div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
    <div class="card-header">
        <h5 class="title">Alterar Caminhão</h5>
    </div>
    <div class="card-body">
        <!--MODIFICAR PARA ADD-->
        <form action="UploadWS" method="POST" enctype="multipart/form-data">
            <input type="hidden" name="urldestino" value="AdminWS">
            <div class="row">
                <div class="col-md-5 pr-md-1"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Modelo</label>
                        <input type="text" name="txtModelo" required class="form-control" ><!-- placeholder="Nome"-->
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Montadora</label>
                        <input type="text" name="txtMontadora" required class="form-control" >
                    </div>
                </div>
            </div>
           
            <div class="row">
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Ano</label>
                        <input type="text" name="txtAno" required class="form-control" >
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Placa</label>
                        <input type="text" name="txtPlaca" required class="form-control" >
                    </div>
                </div>
            </div>
             <div class="row">
                <div class="col-md-5 pr-md-1"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Consumo</label>
                        <input type="number" name="txtConsumo" required class="form-control" placeholder="Km/l">
                    </div>
                </div>
            </div>
            <div class="row">
                
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Renavam</label>
                        <input type="text" name="txtRenavam" required class="form-control">
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