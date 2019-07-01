<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../cabecalho.jsp" %>
<!-- FORMA PARA MOSTRAR AS INFORMAÇÕES MANUTENÇÕES-->
<div class="content">
        <div class="row">
          <div class="col-md-12">
            <div class="card">
    <div class="card-header">
        
        <h5 class="title">Informações da Manutenção </h5>
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
                <div class="col-md-5 pr-md-1"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Oficina</label>
                        <input type="text" name="txtOficina" required class="form-control" readonly><!-- placeholder="Nome"-->
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Endereço</label>
                        <input type="text" name="txtEndereco" required class="form-control" readonly>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 pr-md-1"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Caminhão</label>
                        <select class="form-control" name="txtCaminhao" >
                            <c:forEach items="${caminhao}" var="obj">
                                <option value="${obj.id}" >${obj.modelo}</option>
                            </c:forEach>
                        </select> 
                    </div>
                </div>
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Data da Manutenção</label>
                        <input type="date" name="txtDataManut" required class="form-control" readonly>
                    </div>
                </div>
            </div>
            
             <div class="row">
                <div class="col-md-10"> <!--class="col-md-5 pr-md-1"-->
                    <div class="form-group">
                        <label>Problema</label>
                        <input type="text" name="txtProblema" required class="form-control" readonly>
                    </div>
                </div>
            </div>
            <div class="row">
                
                <div class="col-md-5 pr-md-1">
                    <div class="form-group">
                        <label>Valor</label>
                        <input type="number" step="0.01" name="txtValor" required class="form-control" placeholder="R$" readonly>
                    </div>
                </div>
            </div>

    <div class="card-footer">
         <a class="btn btn-primary btn-round text-center" href="index.jsp"><!--AdminWS?acao=list-->
                <i class="tim-icons icon-bullet-list-67"></i> Listar
            </a>
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