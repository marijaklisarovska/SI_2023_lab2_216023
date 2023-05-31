# SI_2023_lab2_216023
#### Марија Клисаровска 216023
1. **Control flow graph** <br/>
![cfg_lab](https://github.com/marijaklisarovska/SI_2023_lab2_216023/assets/128065239/66b90a22-0b94-43e1-bca7-c18cf2833b07)

2. **Цикломатска комплексност = 11** <br/>
Цикломатската комплексност е пресметана со Ојлеровата формула E-V+2. <br/>
Број на ребра-33 <br/>
Број на јазли-24 <br/>
33-24+2=11 <br/>

3. **Every branch**<br/>

4. **Multiple conditions** <br/>

TXX | user=User(null, " ", " ")
--- | ---
FTX | user!=null, user.getPassword()==null, user=User(user, , " ")
FFT | user!=null, user.getPassword()!=null, user.getEmail()==null
FFF | user!=null, user.getPassword()!=null, user.getEmail()!=null

