import javax.swing.*;


public static void main(String[] args) {
    String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre:");
    System.out.println("Bienvenido, " + nombreUsuario + ".");

    int codMenuPpal=0, codMenuTipico=0, codMenuCarta=0, codMenuInternacional=0, codMenuProcesado=0;
    int countTipico = 0, countCarta = 0, countInternacional = 0, countProcesado = 0;
    int totalAmount = 0;

    do {
        String menu= "MENU RESTAURANTE\n\n";
        menu+="1. Plato Tipico\n";
        menu+="2. Plato a la carta\n";
        menu+="3. Plato internacional\n";
        menu+="4. Plato procesado\n";
        menu+="5. salir\n";
        menu+="Por favor seleccione una opcion\n";
        codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (codMenuPpal){
            case 1:
                do {
                    String menuTipico="MENU TIPICO\n\n";
                    menuTipico+="1. frijoles - 12.000\n";
                    menuTipico+="2. sopa de verduras - 8.000\n";
                    menuTipico+="3. regresar\n\n";
                    menuTipico+="por favor seleccione una opcion \n";
                    codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                    switch (codMenuTipico){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Se ha  solicitado un plato de frijoles, el costo es de $12000");
                            totalAmount += 12000;
                            countTipico++;
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se ha  solicitado una sopa de verduras, el costo es de $8000");
                            totalAmount += 8000;
                            countTipico++;
                            break;
                        case 3:
                            break;
                        default:   JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido",
                                "Advertencia", JOptionPane.WARNING_MESSAGE);
                            break;
                    }

                    codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu tipico, de lo contrario regresara al menu principal "));
                    if (codMenuTipico!=1){
                        codMenuTipico=3;
                    }
                }while (codMenuTipico!=3);
                break;
            case 2:
                do {
                    String menuCarta="MENU CARTA\n\n";
                    menuCarta+="1. Ensalada César - 15.000\n";
                    menuCarta+="2. Pasta Carbonara - 18.000\n";
                    menuCarta+="3. regresar\n\n";
                    menuCarta+="por favor seleccione una opcion \n";
                    codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

                    switch (codMenuCarta){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Se ha  solicitado una Ensalada César, el costo es de $15000");
                            totalAmount += 15000;
                            countCarta++;
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se ha  solicitado una Pasta Carbonara, el costo es de $18000");
                            totalAmount += 18000;
                            countCarta++;
                            break;
                        case 3:
                            break;
                        default:   JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido","advertencia", JOptionPane.WARNING_MESSAGE);
                            break;
                    }

                    codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu tipico, de lo contrario regresara al menu principal "));
                    if (codMenuCarta!=1){
                        codMenuCarta=3;
                    }
                }while (codMenuCarta!=3);
                break;
            case 3:
                do {
                    String menuIntenacional="MENU INTERNACIONAL\n\n";
                    menuIntenacional+="1. Pizza Margherita - 22.000\n";
                    menuIntenacional+="2.  Risotto alla Milanese - 22,000\n";
                    menuIntenacional+="3. regresar\n\n";
                    menuIntenacional+="por favor seleccione una opcion \n";
                    codMenuInternacional=Integer.parseInt(JOptionPane.showInputDialog(menuIntenacional));

                    switch (codMenuInternacional){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Se ha  solicitado una Pizza Margherita, el costo es de $22000");
                            totalAmount += 22000;
                            countInternacional++;
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se ha  solicitado un  Risotto alla Milanese, el costo es de $22000");
                            totalAmount += 22000;
                            countInternacional++;
                            break;
                        case 3:
                            break;
                        default:   JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido","advertencia", JOptionPane.WARNING_MESSAGE);
                            break;
                    }

                    codMenuInternacional=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu tipico, de lo contrario regresara al menu principal "));
                    if (codMenuInternacional!=1){
                        codMenuInternacional=3;
                    }
                }while (codMenuInternacional!=3);
                break;
            case 4:
                do {
                    String menuProcesado="MENU TIPICO\n\n";
                    menuProcesado+="1. Arroz chino - 30,000\n";
                    menuProcesado+="2. Arroz criollo - $25,000\n";
                    menuProcesado+="3. regresar\n\n";
                    menuProcesado+="por favor seleccione una opcion \n";
                    codMenuProcesado=Integer.parseInt(JOptionPane.showInputDialog(menuProcesado));

                    switch (codMenuProcesado){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Se ha  solicitado un Arroz chino, el costo es de $30000");
                            totalAmount += 30000;
                            countProcesado++;
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se ha  solicitado un Arroz criollo, el costo es de $25000");
                            totalAmount += 25000;
                            countProcesado++;
                            break;
                        case 3:
                            break;
                        default:   JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido","advertencia", JOptionPane.WARNING_MESSAGE);
                            break;
                    }

                    codMenuProcesado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu tipico, de lo contrario regresara al menu principal "));
                    if (codMenuProcesado!=1){
                        codMenuProcesado=3;
                    }
                }while (codMenuProcesado!=3);
                break;
            case 5:
                break;

            default:
                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido","advertencia", JOptionPane.WARNING_MESSAGE);
                break;
        }

    }while (codMenuPpal!=5);

    String factura = "Factura:\n\n";
    factura += "Nombre del usuario: " + nombreUsuario + "\n";
    factura += "Platos Típicos: " + countTipico + "\n";
    factura += "Platos a la Carta: " + countCarta + "\n";
    factura += "Platos Internacionales: " + countInternacional + "\n";
    factura += "Platos Procesados: " + countProcesado + "\n";
    factura += "Total a pagar: $" + totalAmount + "\n";

    JOptionPane.showMessageDialog(null, factura);
}