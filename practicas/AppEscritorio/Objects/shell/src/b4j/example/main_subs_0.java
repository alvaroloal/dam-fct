package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,22);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 22;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(4194304);
main._mainform = _form1;
 BA.debugLineNum = 24;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\") ' Cargar";
Debug.ShouldStop(8388608);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Layout1")));
 BA.debugLineNum = 25;BA.debugLine="MainForm.Show";
Debug.ShouldStop(16777216);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 28;BA.debugLine="cmbOpciones.Items.AddAll(Array As String(\"Opción";
Debug.ShouldStop(134217728);
main._cmbopciones.runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Opción 1"),BA.ObjectToString("Opción 2"),RemoteObject.createImmutable("Opción 3")})))));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnagregar_click() throws Exception{
try {
		Debug.PushSubsStack("btnAgregar_Click (main) ","main",0,main.ba,main.mostCurrent,81);
if (RapidSub.canDelegate("btnagregar_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnagregar_click");}
RemoteObject _nuevaopcion = RemoteObject.createImmutable("");
 BA.debugLineNum = 81;BA.debugLine="Sub btnAgregar_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim nuevaOpcion As String = txtNuevaOpcion.Text.T";
Debug.ShouldStop(131072);
_nuevaopcion = main._txtnuevaopcion.runMethod(true,"getText").runMethod(true,"trim");Debug.locals.put("nuevaOpcion", _nuevaopcion);Debug.locals.put("nuevaOpcion", _nuevaopcion);
 BA.debugLineNum = 83;BA.debugLine="If nuevaOpcion <> \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",_nuevaopcion,BA.ObjectToString(""))) { 
 BA.debugLineNum = 84;BA.debugLine="cmbOpciones.Items.Add(nuevaOpcion)";
Debug.ShouldStop(524288);
main._cmbopciones.runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_nuevaopcion)));
 BA.debugLineNum = 85;BA.debugLine="txtNuevaOpcion.Text = \"\" ' Limpiar el campo";
Debug.ShouldStop(1048576);
main._txtnuevaopcion.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 86;BA.debugLine="Label1.Text = \"Opción añadida.\"";
Debug.ShouldStop(2097152);
main._label1.runMethod(true,"setText",BA.ObjectToString("Opción añadida."));
 }else {
 BA.debugLineNum = 88;BA.debugLine="Label1.Text = \"Escribe una opción antes de añadi";
Debug.ShouldStop(8388608);
main._label1.runMethod(true,"setText",BA.ObjectToString("Escribe una opción antes de añadir."));
 };
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnguardar_click() throws Exception{
try {
		Debug.PushSubsStack("btnGuardar_Click (main) ","main",0,main.ba,main.mostCurrent,56);
if (RapidSub.canDelegate("btnguardar_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnguardar_click");}
RemoteObject _respuesta = RemoteObject.createImmutable(0);
RemoteObject _texto = RemoteObject.createImmutable("");
 BA.debugLineNum = 56;BA.debugLine="Sub btnGuardar_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="If chkAceptar.Checked And cmbOpciones.Value <> Nu";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",main._chkaceptar.runMethod(true,"getChecked")) && RemoteObject.solveBoolean("N",main._cmbopciones.runMethod(false,"getValue")) && RemoteObject.solveBoolean("!",main._cmbopciones.runMethod(false,"getValue"),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 58;BA.debugLine="Dim respuesta As Int = fx.Msgbox2(MainForm, \"¿De";
Debug.ShouldStop(33554432);
_respuesta = main._fx.runMethodAndSync(true,"Msgbox2",(Object)(main._mainform),(Object)(BA.ObjectToString("¿Deseas guardar la información?")),(Object)(BA.ObjectToString("Confirmar")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)(main.__c.getField(false,"Null")));Debug.locals.put("respuesta", _respuesta);Debug.locals.put("respuesta", _respuesta);
 BA.debugLineNum = 60;BA.debugLine="If respuesta = fx.DialogResponse.POSITIVE Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_respuesta,BA.numberCast(double.class, main._fx.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 61;BA.debugLine="Dim texto As String = \"Nombre: \" & txtNombre.Te";
Debug.ShouldStop(268435456);
_texto = RemoteObject.concat(RemoteObject.createImmutable("Nombre: "),main._txtnombre.runMethod(true,"getText"),RemoteObject.createImmutable(", Opción: "),main._cmbopciones.runMethod(false,"getValue"),main.__c.getField(true,"CRLF"));Debug.locals.put("texto", _texto);Debug.locals.put("texto", _texto);
 BA.debugLineNum = 62;BA.debugLine="File.WriteString(File.DirApp, \"datos.txt\", text";
Debug.ShouldStop(536870912);
main.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("datos.txt")),(Object)(_texto));
 BA.debugLineNum = 63;BA.debugLine="Label1.Text = \"Datos guardados correctamente.\"";
Debug.ShouldStop(1073741824);
main._label1.runMethod(true,"setText",BA.ObjectToString("Datos guardados correctamente."));
 };
 }else {
 BA.debugLineNum = 66;BA.debugLine="Label1.Text = \"Faltan datos para guardar.\"";
Debug.ShouldStop(2);
main._label1.runMethod(true,"setText",BA.ObjectToString("Faltan datos para guardar."));
 };
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlimpiar_click() throws Exception{
try {
		Debug.PushSubsStack("btnLimpiar_Click (main) ","main",0,main.ba,main.mostCurrent,47);
if (RapidSub.canDelegate("btnlimpiar_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnlimpiar_click");}
 BA.debugLineNum = 47;BA.debugLine="Sub btnLimpiar_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="txtNombre.Text = \"\" ' Vacía el campo de texto";
Debug.ShouldStop(32768);
main._txtnombre.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 49;BA.debugLine="cmbOpciones.SelectedIndex = -1 ' Deselecciona cua";
Debug.ShouldStop(65536);
main._cmbopciones.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 50;BA.debugLine="chkAceptar.Checked = False ' Desmarca el CheckBox";
Debug.ShouldStop(131072);
main._chkaceptar.runMethod(true,"setChecked",main.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="txtNuevaOpcion.Text = \"\" ' Vacía el campo para ag";
Debug.ShouldStop(262144);
main._txtnuevaopcion.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 52;BA.debugLine="Label1.Text = \"Campos limpiados.\"";
Debug.ShouldStop(524288);
main._label1.runMethod(true,"setText",BA.ObjectToString("Campos limpiados."));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnverdatos_click() throws Exception{
try {
		Debug.PushSubsStack("btnVerDatos_Click (main) ","main",0,main.ba,main.mostCurrent,71);
if (RapidSub.canDelegate("btnverdatos_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnverdatos_click");}
RemoteObject _contenido = RemoteObject.createImmutable("");
 BA.debugLineNum = 71;BA.debugLine="Sub btnVerDatos_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="If File.Exists(File.DirApp, \"datos.txt\") Then";
Debug.ShouldStop(128);
if (main.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("datos.txt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="Dim contenido As String = File.ReadString(File.D";
Debug.ShouldStop(256);
_contenido = main.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(main.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("datos.txt")));Debug.locals.put("contenido", _contenido);Debug.locals.put("contenido", _contenido);
 BA.debugLineNum = 74;BA.debugLine="fx.Msgbox(MainForm, contenido, \"Datos Guardados\"";
Debug.ShouldStop(512);
main._fx.runVoidMethodAndSync ("Msgbox",(Object)(main._mainform),(Object)(_contenido),(Object)(RemoteObject.createImmutable("Datos Guardados")));
 }else {
 BA.debugLineNum = 76;BA.debugLine="Label1.Text = \"No hay datos guardados.\"";
Debug.ShouldStop(2048);
main._label1.runMethod(true,"setText",BA.ObjectToString("No hay datos guardados."));
 };
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.ba,main.mostCurrent,32);
if (RapidSub.canDelegate("button1_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","button1_click");}
RemoteObject _seleccion = RemoteObject.createImmutable("");
 BA.debugLineNum = 32;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="If chkAceptar.Checked Then";
Debug.ShouldStop(1);
if (main._chkaceptar.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 34;BA.debugLine="Dim seleccion As String = cmbOpciones.Value ' Ob";
Debug.ShouldStop(2);
_seleccion = BA.ObjectToString(main._cmbopciones.runMethod(false,"getValue"));Debug.locals.put("seleccion", _seleccion);Debug.locals.put("seleccion", _seleccion);
 BA.debugLineNum = 36;BA.debugLine="If seleccion <> Null And seleccion <> \"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("N",_seleccion) && RemoteObject.solveBoolean("!",_seleccion,BA.ObjectToString(""))) { 
 BA.debugLineNum = 37;BA.debugLine="Label1.Text = \"Hola \" & txtNombre.Text & \", ele";
Debug.ShouldStop(16);
main._label1.runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Hola "),main._txtnombre.runMethod(true,"getText"),RemoteObject.createImmutable(", elegiste: "),_seleccion));
 }else {
 BA.debugLineNum = 39;BA.debugLine="Label1.Text = \"Por favor, selecciona una opción";
Debug.ShouldStop(64);
main._label1.runMethod(true,"setText",BA.ObjectToString("Por favor, selecciona una opción."));
 };
 }else {
 BA.debugLineNum = 42;BA.debugLine="Label1.Text = \"Debes aceptar los términos.\"";
Debug.ShouldStop(512);
main._label1.runMethod(true,"setText",BA.ObjectToString("Debes aceptar los términos."));
 };
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Private Button1 As Button";
main._button1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private btnLimpiar As Button";
main._btnlimpiar = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private btnGuardar As Button";
main._btnguardar = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private btnVerDatos As Button";
main._btnverdatos = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private btnAgregar As Button";
main._btnagregar = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private Label1 As Label";
main._label1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private txtNombre As TextField";
main._txtnombre = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtNuevaOpcion As TextField";
main._txtnuevaopcion = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private chkAceptar As CheckBox";
main._chkaceptar = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private cmbOpciones As ComboBox";
main._cmbopciones = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}