# 📨 Boot-Profile-NotificationSystem

## 🔹 Overview
A Spring Boot **profile-based Notification System** demonstrating how to send notifications using different services based on active profiles.  
Supports `dev`, `test`, and `prod` profiles with **clean JSON output**.  

- 🟢 **dev** → Email notifications  
- 🟡 **test** → SMS notifications  
- 🔴 **prod** → Push notifications  
- ⚪ **default** → Default notification if no profile is active  

Includes **Lombok**, **Jakarta Validation**, and **profile-specific service beans**.

---

## 🌟 Features
- 🧩 Spring Profiles (`@Profile`) for different notification services  
- 📝 JSON-formatted output using Jackson  
- 🖥️ Clean console logging with title and JSON  
- ✅ Validation of Notification model fields using `@NotNull`, `@NotBlank`, `@Size`  
- ⚪ Default notification if no profile is set  
- 📦 Maven project ready for GitHub  

---

## 🛠️ Technologies
- ☕ Java 17+ / 20  
- 🚀 Spring Boot 4.0  
- 🛠️ Lombok  
- 🖋️ Jackson (for JSON)  
- 📜 Jakarta Validation (Bean Validation API)  
- 📦 Maven  

---

## 📂 Project Structure

Boot-Profile-NotificationSystem/

├── src

│   ├── main

│   │   ├── java

│   │   │   └── com

│   │   │       └── cs

│   │   │           ├── NotificationSystemApplication.java

│   │   │           ├── config

│   │   │           │   └── AppConfig.java

│   │   │           ├── model

│   │   │           │   └── Notification.java

│   │   │           ├── runner

│   │   │           │   └── Runner.java

│   │   │           └── service

│   │   │               ├── NotificationService.java

│   │   │               ├── EmailNotificationService.java

│   │   │               ├── SMSNotificationService.java

│   │   │               ├── PushNotificationService.java

│   │   │               └── DefaultNotificationService.java

│   │   └── resources

│   │       ├── application.yml

└── pom.xml

---

## 📟 Sample Output

# No profile active:

================================

       DEFAULT NOTIFICATION      

================================

{

  "type" : "DEFAULT",
  
  "recipient" : "Chaitali",
  
  "message" : "Welcome to system!"

}

# Profile dev active:

================================

       NOTIFICATION RESULT      

================================

{

  "type" : "EMAIL",
  
  "recipient" : "Chaitali",
  
  "message" : "Welcome to system!"

}

# Profile prod active:

================================

       NOTIFICATION RESULT      

================================

{

  "type" : "Push",
  
  "recipient" : "Chaitali",
  
  "message" : "Welcome to system!"

}

# Profile test active:

================================

       NOTIFICATION RESULT      

================================

{

  "type" : "SMS",
  
  "recipient" : "Chaitali",
  
  "message" : "Welcome to system!"

}

---
## 📦 Dependencies

spring-boot-starter

spring-boot-starter-validation

lombok

jackson-databind

---

🔮 Future Enhancements

🌐 Web-based Notification API – Expose endpoints to send notifications via REST.


📅 Scheduled notifications – Send notifications at a specific time using Spring Scheduler.


🛡️ Security & authentication – Secure API endpoints with Spring Security.


💾 Database persistence – Store notifications in a database for audit/history.


⚡ Asynchronous processing – Improve performance with async notification delivery.

---

## 👩‍💻 Author

Chaitali Shende

GitHub: https://github.com/chaitali-shende

Email: chaitaliishende@gmail.com
