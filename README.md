# BBP Formula Laboratory
Este laboratorio contiene la introducción a la programación con threads en Java.

## Part I - Introduction to Java Threads
Completando el método principal `CountThread` y cambiando el inicio del mismo entre los métodos `start()` y `run()` podemos encontrar que la diferencia es que el `start()` inicia el hilo y su ejecución con el método `run()` mientras que el run actúa como un método más.

## Part II - BBP Formula Exercise
![enter image description here](https://lh3.googleusercontent.com/c3xlIXbYvvEApI3c7EqXSj6KRG79NKs7oh1DPS2NSSSosUwF7e1fsbKwkKdenCYpm7WZ5sG8fDqp=s100)

## Part III - Performance Evaluation

 - Single thread.
 
 ![Java VisualVM](https://lh3.googleusercontent.com/WyGeUD-W4cFPyFPpmacYuMOB6yfNsny5fLXWBs79qFxap_dHZAkYdI1kPp00n0hqYxX01emmUcz5)
 
 - As many threads as processing cores (have the program determine this using the [Runtime API](https://docs.oracle.com/javase/7/docs/api/java/lang/Runtime.html)).
 
 ![Java VisualVM](https://lh3.googleusercontent.com/nRkoFxDzinDNRfqjrqw6sNh-aPICj4Z6qaEf3M0X0VCRNMBd-7X2QNCoKQzuqhzciTBfHOYswGJ0)
 
 - So many threads as double processing cores.
 
 ![Java VisualVM](https://lh3.googleusercontent.com/KGa_eOVgCvk_qgHLyqDp5MqfyhANRcdQSuYRVdLS-OyUmDj2x7sQYhiKcNyiz-8nFNI137ZbqFfU)
 
 - 200 threads.
 
 ![Java VisualVM](https://lh3.googleusercontent.com/SgWFMaqbQHBcFhQc_OmcsXbMbXbAbee4F8R5b0mxuE3HQJ90cyaL-nogL_6tak0EDlgGxMGXF_V4)
 
 - 500 threads.
 
 ![Java VisualVM](https://lh3.googleusercontent.com/9jiR-aOxOf-jjSaHq3TsuynmPE1qBxm272k25_UN9Iz8e5S5GCWxRB_DH9g61wYeBFLJahkeK5xy)

1. Al realizar tantas subdivisiones, el rendimiento del proceso no es notable y se está haciendo un consumo de recursos innecesario. Caso similar cuando se hace la subdivisión en 200 hilos.
2. Al hacer la comparación de tantos subprocesos como cores se tenga y el doble de los mismos, de acuerdo a las capturas de Java VisualVm, se ve que el gasto de recursos varía, pero no significativamente, así que puede ser una buena opción.
3. Si se usaran 500 subprocesos en una solo CPU en lugar de 1 en en 500 máquinas hipotéticas la ley de Amdahl se vería mejor reflejada. 

El rendimiento, sabiendo que no depende de la cantidad de subprocesos que se estén llevando a cabo, no se vería mejorado de ninguna manera; teniendo en cuenta que, los núcleos o cores del procesador pueden ayudar de manera significativa.

## Running

Compile first time the project after downloaded.

    mvn package
Make unit tests.

    mvn test
To run the whole project.

    mvn exec:java -D exec.mainClass="edu.eci.arsw.math.Main"
Generate documentation

    mvn javadoc:jar

## Authors
Michael Sebastián Preciado Garzón - Escuela Colombiana de Ingeniería Julio Garavito

Sergio Hernando Ruiz Paez - Escuela Colombiana de Ingeniería Julio Garavito

## License
This project is under GNU General Public License - see [LICENSE](https://github.com/UroBs17/Lab1_ARSW_BBP/blob/master/LICENSE) to more info.


