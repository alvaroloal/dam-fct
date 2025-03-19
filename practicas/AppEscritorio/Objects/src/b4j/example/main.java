package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnlimpiar = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnguardar = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnverdatos = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnagregar = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombre = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnuevaopcion = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkaceptar = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cmbopciones = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\") ' Cargar";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="cmbOpciones.Items.AddAll(Array As String(\"Opción";
_cmbopciones.getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Opción 1","Opción 2","Opción 3"}));
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="End Sub";
return "";
}
public static String  _btnagregar_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnagregar_click", false))
	 {return ((String) Debug.delegate(ba, "btnagregar_click", null));}
String _nuevaopcion = "";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub btnAgregar_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Dim nuevaOpcion As String = txtNuevaOpcion.Text.T";
_nuevaopcion = _txtnuevaopcion.getText().trim();
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="If nuevaOpcion <> \"\" Then";
if ((_nuevaopcion).equals("") == false) { 
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="cmbOpciones.Items.Add(nuevaOpcion)";
_cmbopciones.getItems().Add((Object)(_nuevaopcion));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="txtNuevaOpcion.Text = \"\" ' Limpiar el campo";
_txtnuevaopcion.setText("");
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Label1.Text = \"Opción añadida.\"";
_label1.setText("Opción añadida.");
 }else {
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="Label1.Text = \"Escribe una opción antes de añadi";
_label1.setText("Escribe una opción antes de añadir.");
 };
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="End Sub";
return "";
}
public static String  _btnguardar_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnguardar_click", false))
	 {return ((String) Debug.delegate(ba, "btnguardar_click", null));}
int _respuesta = 0;
String _texto = "";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub btnGuardar_Click";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="If chkAceptar.Checked And cmbOpciones.Value <> Nu";
if (_chkaceptar.getChecked() && _cmbopciones.getValue()!= null && (_cmbopciones.getValue()).equals((Object)("")) == false) { 
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Dim respuesta As Int = fx.Msgbox2(MainForm, \"¿De";
_respuesta = _fx.Msgbox2(_mainform,"¿Deseas guardar la información?","Confirmar","Sí","","No",anywheresoftware.b4a.keywords.Common.Null);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="If respuesta = fx.DialogResponse.POSITIVE Then";
if (_respuesta==_fx.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Dim texto As String = \"Nombre: \" & txtNombre.Te";
_texto = "Nombre: "+_txtnombre.getText()+", Opción: "+BA.ObjectToString(_cmbopciones.getValue())+anywheresoftware.b4a.keywords.Common.CRLF;
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="File.WriteString(File.DirApp, \"datos.txt\", text";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"datos.txt",_texto);
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="Label1.Text = \"Datos guardados correctamente.\"";
_label1.setText("Datos guardados correctamente.");
 };
 }else {
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="Label1.Text = \"Faltan datos para guardar.\"";
_label1.setText("Faltan datos para guardar.");
 };
RDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="End Sub";
return "";
}
public static String  _btnlimpiar_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnlimpiar_click", false))
	 {return ((String) Debug.delegate(ba, "btnlimpiar_click", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub btnLimpiar_Click";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="txtNombre.Text = \"\" ' Vacía el campo de texto";
_txtnombre.setText("");
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="cmbOpciones.SelectedIndex = -1 ' Deselecciona cua";
_cmbopciones.setSelectedIndex((int) (-1));
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="chkAceptar.Checked = False ' Desmarca el CheckBox";
_chkaceptar.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="txtNuevaOpcion.Text = \"\" ' Vacía el campo para ag";
_txtnuevaopcion.setText("");
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Label1.Text = \"Campos limpiados.\"";
_label1.setText("Campos limpiados.");
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="End Sub";
return "";
}
public static String  _btnverdatos_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnverdatos_click", false))
	 {return ((String) Debug.delegate(ba, "btnverdatos_click", null));}
String _contenido = "";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub btnVerDatos_Click";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If File.Exists(File.DirApp, \"datos.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"datos.txt")) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Dim contenido As String = File.ReadString(File.D";
_contenido = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"datos.txt");
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="fx.Msgbox(MainForm, contenido, \"Datos Guardados\"";
_fx.Msgbox(_mainform,_contenido,"Datos Guardados");
 }else {
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Label1.Text = \"No hay datos guardados.\"";
_label1.setText("No hay datos guardados.");
 };
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
String _seleccion = "";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If chkAceptar.Checked Then";
if (_chkaceptar.getChecked()) { 
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Dim seleccion As String = cmbOpciones.Value ' Ob";
_seleccion = BA.ObjectToString(_cmbopciones.getValue());
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="If seleccion <> Null And seleccion <> \"\" Then";
if (_seleccion!= null && (_seleccion).equals("") == false) { 
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Label1.Text = \"Hola \" & txtNombre.Text & \", ele";
_label1.setText("Hola "+_txtnombre.getText()+", elegiste: "+_seleccion);
 }else {
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="Label1.Text = \"Por favor, selecciona una opción";
_label1.setText("Por favor, selecciona una opción.");
 };
 }else {
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Label1.Text = \"Debes aceptar los términos.\"";
_label1.setText("Debes aceptar los términos.");
 };
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="End Sub";
return "";
}
}