# AD-PSP-TiposHerencia

## 3 - JOINED

 - Se crean dos entidades, una padre y otra hija.
 - Con la anotación @Inheritance se especifica la estrategia de herencia que vamos a usar.
   
![joined1](https://github.com/SebastianMillan/AD-PSP-TiposHerencia/assets/114216417/be8c8a41-c05d-4423-b12a-0c476fd9f342)
![joined2](https://github.com/SebastianMillan/AD-PSP-TiposHerencia/assets/114216417/04ce8e26-1518-43e9-a6e3-6ab93ee37cc6)

- Creamos los repositorios de ambas entidades.
- Se introducen en el InitData valores de prueba para comprobar que se genera correctamente nuestras tablas

![joined3](https://github.com/SebastianMillan/AD-PSP-TiposHerencia/assets/114216417/cacf409c-0d60-4bfd-814a-3dbcb04314b9)
![joined4](https://github.com/SebastianMillan/AD-PSP-TiposHerencia/assets/114216417/ba56f7fb-bdf7-4608-a37f-fcc00bb04240)
![joined5](https://github.com/SebastianMillan/AD-PSP-TiposHerencia/assets/114216417/1645ee01-12b9-4b51-9cdf-8a33cc54e368)
![joined6](https://github.com/SebastianMillan/AD-PSP-TiposHerencia/assets/114216417/acd2e34d-7e8d-4ecd-8a25-24150cade302)

## 4 - TABLE PER CLAS 

- Creamos las entidades, una padre y otra hija.
- La clase padre debe estar anotada con @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) y la hija extender al padre.
- Esta forma de herencia genera una tabla por cada clase.
![1](https://github.com/SebastianMillan/AD-PSP-TiposHerencia/assets/114216879/5c5c45f8-aba8-4bb4-b370-9529ad196fdb)
![2](https://github.com/SebastianMillan/AD-PSP-TiposHerencia/assets/114216879/4f97dcb3-970f-4377-a1a6-53b7cdda76e1)
![3](https://github.com/SebastianMillan/AD-PSP-TiposHerencia/assets/114216879/ef6c1794-7307-4a53-911a-ee4e30a6dd94)
