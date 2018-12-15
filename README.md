# Eye-Assistant
Using android mobile application to help the visiually impaired.

In this project our main motive was to make an application that can make life easier for the visually impaired. Blind people always need assistance in order to know what object is around them. So we made an app that detect an object when camera is opened scans it and tells the user what object it is. The app doesn’t need you to take picture and then detect the object. The application recognizes objects using real time object detection by scanning them. The application runs on the device both with and without the need for any remote server. Our solution uses a voice over based method for recognition. To enable robust recognition in a cluttered environment, we first segment the object from the background using tensor flow algorithm based on iterative graph cuts. We formulate the recognition problem as an instance retrieval task and the user gets to know the object through a voice telling them. 

The target audience being the visually impaired introduces additional challenges. The user is unaware of the condition of the surrounding environment — other objects, lighting, contrast, and even whether the object is properly placed in the field of view of the camera or not. The application we intend to make will only have one interface. When the user will tell the phone to open the app via google assistant, the app opens and instantly the camera is turned on. The user has to hold the object before the camera so that the app can detect it and scan and then a voice will say what object it is. Our app will have text to speech api to read text in real time so that the user can know what object they scan at real time. We will also use real time object detection api to recognize object the moment it is scanned.

Youtube promo video link: https://youtu.be/TMot84ylDqQ
EyeAssistant.apk | NsuAlpha | Android app for visually impaired | Bangladesh | 
