/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author andres.friss
 */
public class TelaPrincipalController implements Initializable {
    

    @FXML
    private Button botonLaboratorio;

    @FXML
    private Button botonDisponibilidad;

    @FXML
    private Button botonReporteDeVentas;

    @FXML
    private Button botonCadastros;

    @FXML
    private Button botonSemillaBasica;

    @FXML
    private Button botonProtocolos;

    @FXML
    private Button botonDocumentos;

    @FXML
    private Button botonResultados;

    @FXML
    private Button botonReclamos;

    @FXML
    private TabPane tabPainelLaboratorio;

    @FXML
    private Tab tabLaboratorioCadastroMuestras;

    @FXML
    private Button botonLaboratorioMuestraSoja;

    @FXML
    private Button botonLaboratorioMuestraMaiz;

    @FXML
    private Button botonLaboratorioMuestraTrigo;

    @FXML
    private Tab tabLaboratorioRegistroResultados;

    @FXML
    private Button botonLaboratorioCargarResultados;

    @FXML
    private Tab tabLaboratorioLiberacionLotes;

    @FXML
    private Button botonLaboratorioLiberarLotes;

    @FXML
    private TabPane tabPainelDisponibilidad;

    @FXML
    private Button botonDisponibilidadQuitar;

    @FXML
    private TabPane tabPainelReporteVentas;

    @FXML
    private Tab tabVentasInternas;

    @FXML
    private Button botonReporteVentasAgrotec;

    @FXML
    private Tab tabVentasNacionales;

    @FXML
    private Button botonReporteVentasNacionales;

    @FXML
    private TabPane tabPainelCadastro;

    @FXML
    private Tab tabCadastroSoja;

    @FXML
    private Button botonCadastroVariedadesSoja;

    @FXML
    private Button botonCadastroObtentoresSoja;

    @FXML
    private Button botonCadastroLotesSoja;

    @FXML
    private Tab tabCadastroMaiz;

    @FXML
    private Button botonCadastroVariedadesMaiz;

    @FXML
    private Button botonCadastroObtentoresMaiz;

    @FXML
    private Button botonCadastroLotesMaiz;

    @FXML
    private Tab tabCadastroTrigo;

    @FXML
    private Button botonCadastroVariedadesTrigo;

    @FXML
    private Button botonCadastroObtentoresTrigo;

    @FXML
    private Button botonCadastroLotesTrigo;

    @FXML
    private TabPane tabPainelSemillaBasica;

    @FXML
    private Button botonSemillaBasicaCosto;

    @FXML
    private Button botonSemillaBasicaPropuestaFinalObtentor;

    @FXML
    private Button botonSemillaBasicaHistorico;

    @FXML
    private Button botonSemillaBasicaFlowContrato;

    @FXML
    private Button botonSemillaBasicaRoyalties;

    @FXML
    private TabPane tabPainelProtocolos;

    @FXML
    private Button botonProtocoloVerificacionDeCampo;

    @FXML
    private Button botonProtocoloPreCosecha;

    @FXML
    private Button botonProtocoloCosecha;

    @FXML
    private Button botonProtocoloRecepcion;

    @FXML
    private Button botonProtocoloProcesamiento;

    @FXML
    private Button botonProtocoloLaboratorio;

    @FXML
    private TabPane tabPainelDocumentos;

    @FXML
    private Button botonDocumentosInscripciónDeCampos;

    @FXML
    private Button botonDocumentosDisponibilidadDeSemillas;

    @FXML
    private Button botonDocumentosSolicitudDeEtiquetas;

    @FXML
    private Button botonDocumentosEmisiónCertificados;

    @FXML
    private Button botonDocumentosReporteDeCalidadSoja;

    @FXML
    private Button botonDocumentosReporteDeCalidadMaiz;

    @FXML
    private Button botonDocumentosReporteDeCalidadTrigo;

    @FXML
    private TabPane tabPainelResultados;

    @FXML
    private Button botonResultadosCargarEnsayos;

    @FXML
    private Button botonResultadosEnsayosResultados;

    @FXML
    private Button botonResultadosCargarParcelasComerciales;

    @FXML
    private Button botonResultadosParcelasComercialesResultados;

    @FXML
    private TabPane tabPainelReclamos;

    @FXML
    private Button botonReclamosCargarReclamo;

    @FXML
    private Button botonReclamosEditarReclamo;

    @FXML
    private Button botonReclamosVerReclamo;
    
    @FXML
    void mostrarPainelCadastro(ActionEvent event) {

    }

    @FXML
    void mostrarPainelDisponibilidad(ActionEvent event) {

    }

    @FXML
    void mostrarPainelDocumentos(ActionEvent event) {

    }

    @FXML
    void mostrarPainelLaboratorio(ActionEvent event) {

    }

    @FXML
    void mostrarPainelProtocolos(ActionEvent event) {

    }

    @FXML
    void mostrarPainelReclamos(ActionEvent event) {

    }

    @FXML
    void mostrarPainelResultados(ActionEvent event) {

    }

    @FXML
    void mostrarPainelSemillaBasica(ActionEvent event) {

    }

    @FXML
    void mostrarPainelVendas(ActionEvent event) {

    }


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cerrarTabPaineles();
        tabPainelLaboratorio.setVisible(true);
        
        botonCadastros.setOnMouseClicked((MouseEvent e) -> {
            cerrarTabPaineles();
            tabPainelCadastro.setVisible(true);
        });
        
        botonDisponibilidad.setOnMouseClicked((MouseEvent e) -> {
            cerrarTabPaineles();
            tabPainelDisponibilidad.setVisible(true);
        });
        
        botonDocumentos.setOnMouseClicked((MouseEvent e) -> {
            cerrarTabPaineles();
            tabPainelDocumentos.setVisible(true);
        });
        
        botonLaboratorio.setOnMouseClicked((MouseEvent e) -> {
            cerrarTabPaineles();
            tabPainelLaboratorio.setVisible(true);
        });
        
        botonProtocolos.setOnMouseClicked((MouseEvent e) -> {
            cerrarTabPaineles();
            tabPainelProtocolos.setVisible(true);
        });
        
        botonReclamos.setOnMouseClicked((MouseEvent e) -> {
            cerrarTabPaineles();
            tabPainelReclamos.setVisible(true);
        });
        
        botonReporteDeVentas.setOnMouseClicked((MouseEvent e) -> {
            cerrarTabPaineles();
            tabPainelReporteVentas.setVisible(true);
        });
        
        botonResultados.setOnMouseClicked((MouseEvent e) -> {
            cerrarTabPaineles();
            tabPainelResultados.setVisible(true);
        });
        
        botonSemillaBasica.setOnMouseClicked((MouseEvent e) -> {
            cerrarTabPaineles();
            tabPainelSemillaBasica.setVisible(true);
        });
    }    
    
    //github
    
    private void cerrarTabPaineles(){
        tabPainelCadastro.setVisible(false);
        tabPainelDisponibilidad.setVisible(false);
        tabPainelDocumentos.setVisible(false);
        tabPainelLaboratorio.setVisible(false);
        tabPainelProtocolos.setVisible(false);
        tabPainelReclamos.setVisible(false);
        tabPainelReporteVentas.setVisible(false);
        tabPainelResultados.setVisible(false);
        tabPainelSemillaBasica.setVisible(false);
    }
}
