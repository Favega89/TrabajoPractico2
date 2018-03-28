Interfaz Observer : la clase que implementa esta interfaz sera notificada
sobre los cambios que sufan las clases obserbadas.

Clase Observable: las clases que hereden de observable seran observadas
por las clases observadoras y notificaran a las mismas sobre los cambios que 
sufran.

Observable.addObserver(Observer o) : Agrega un observador.
Observable.deleteObserver(Observer o): Elimina un observador.
Observable.setChanged(): ejecuta los cambios de la clase observada.
Observable.notifyObserver(Object o): Notifica a los observadores.
Observer.update(Observable o, Object args): Ejecuta cuando ha 
habido un cambio en una clase observada por la clase contendora
de este metodo. Recibe como parametro el observado de la clase
observable y el argumento como clase Object  (o heredadas.)