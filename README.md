# SI_2023_lab2_216023
#### Марија Клисаровска 216023
1. **Control flow graph** <br/>
![cfg_lab](https://github.com/marijaklisarovska/SI_2023_lab2_216023/assets/128065239/508dea64-4a50-4e91-a64d-1eb29790997e)


2. **Цикломатска комплексност = 11** <br/>
Цикломатската комплексност е пресметана со Ојлеровата формула E-V+2. <br/>
Број на ребра-33 <br/>
Број на јазли-24 <br/>
33-24+2=11 <br/>

3. **Every branch**<br/>
Потребни се 5 тестови.
#1) user = null да се исполни условот за exception. Се изминуваат само гранките 1-2 и 2-24. <br/>
2)user=User(username = null,  password="ab mk@gmailcom", email="mk@gmailcom") <br/>
Email-от е неправилен односно му недостасува '@' или '.', а password-от има празно место и го содржи имејлот. <br/>
3)user=User(username="mk", password="password!!" email="mk@yahoo.com") <br/>
Username-от не е null, email-от е правилен, password-от содржи специјален карактер, со цел да се изминат сите гранки од 6 до 14. <br/>
4)user=User(username="mk", password="m k", email="mk@yahoo.com")  <br/>
Пасвордот содржи празно место, со цел да се измине гранката 19-23. <br/>
5)username==mk, email=mk@yahoo.com, password='mk' <br/>
Пасвордот не содржи специјален карактер. <br/>

4. **Multiple conditions** <br/>

TXX | user=null
--- | ---
FTX | user!=null, user.getPassword()==null, X
FFT | user!=null, user.getPassword()!=null, user.getEmail()==null
FFF | user!=null, user.getPassword()!=null, user.getEmail()!=null
<br/>
Кај логичко 'или' доволно е барем еден од условите да биде точен за да се смета if-от за  исполнет. Доколку првиот услов е точен, вредноста на вториот и третиот се ирелевантни. Доколку првиот е неточен а вториот е точен, вредноста на третиот е ирелевантна. Доколку првите два се неточни, третиот мора да е точен. Четврт случај е сите три услови да се неточни, така не се влегува во if-от. <br/>

