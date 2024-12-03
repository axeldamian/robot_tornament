Juego de robots hecho en Java Springboot con Maven y Mongodb como base.
La idea es que cuando se pueda jugar le hago un frontend en REACT.

En resumen, hay 10 equipos con 6 robots, en total 60 robots distintos.


En cada fecha pelean todos los equipos. Es un versus de todos los equipos.


Cada robot tiene un rol en el equipo vanguardia, retaguardia, flanco izquierdo, flanco derecho, reserva y principal.


Va a haber un mercado de robots para cada equipo según su performance, cada equipo gana dinero en cada fecha según su posición.


## Endpoints:

```
POST /robots/create
```


body json
```
{
    "name":"test",
    "setup":"test"
}
```


```
POST /teams/create
```


body json:
```
{
    "name":"Epsilon Delta Limit",
    "budget":10000000
}
```

```
GET /teams/show
```


se volvió muy largo para una descripción en github, así que lo hice en google docs:


https://docs.google.com/document/d/1qMZjXT1r2274XlFIzsrgPtO2h0wjr4sFdIapUQ3cw2w/edit?tab=t.0
https://docs.google.com/document/d/1ymrzWpDjToog23m4tMo2iH-FafBF-wB5jtyf_5i1k-M/edit?tab=t.0
https://docs.google.com/document/d/1BibvNbw-RUYBDuxvXPmXDL_Xs3-_saNQVXsR7rAsUGg/edit?tab=t.0

Para visualizar los documentos de mongo uso MongoDB Compass

<img width="59" alt="Captura de pantalla 2024-12-02 a la(s) 22 37 58" src="https://github.com/user-attachments/assets/696f25bc-9132-4073-9745-20faed51fc1f">


<br>
<img width="237" alt="Captura de pantalla 2024-12-02 a la(s) 22 38 11" src="https://github.com/user-attachments/assets/386f2ef9-9815-4f60-b7aa-721d63db2233">
<br>

<img width="1024" alt="Captura de pantalla 2024-12-02 a la(s) 22 38 32" src="https://github.com/user-attachments/assets/0a256e33-3449-4451-b148-5026e8d3eaf8">








