int val = 0;
int lamp1 = 13;
int lamp2 = 12;
int lamp3 = 8;
int lamp4 = 7;
int motorForward = 4;
int motorReverse = 2;

void setup()
{
  Serial.begin(9600);
  pinMode(lamp1, OUTPUT);
  pinMode(lamp2,OUTPUT);
  pinMode(lamp3,OUTPUT);
  pinMode(lamp4,OUTPUT);
  pinMode(motorForward,OUTPUT);
  pinMode(motorReverse,OUTPUT);
}
void loop()
{
  delay(100);
}
void serialEvent() // To check if there is any data on the Serial line
{
  while (Serial.available())
  {
    val = Serial.parseInt();
    if(val == 1)   //Switch on the LED, if the received value is 1.
    {
      digitalWrite(lamp1, HIGH);
      
     
    }
    else if(val == 2) //Switch off the LED, if the received value is 1.
    {
      digitalWrite(lamp2, LOW);
     
    }
    else if(val==3)
    {
      digitalWrite(lamp2, HIGH);
    }
    else if(val==0)
    {
      digitalWrite(lamp1, LOW);
    }
    else if(val==4)
    {
      digitalWrite(lamp3, LOW);
    }
    else if(val==5)
    {
      digitalWrite(lamp3, HIGH);
    }
    else if(val==6)
    {
      digitalWrite(lamp4, LOW);
    }
    else if(val==7)
    {
      digitalWrite(lamp4, HIGH);
    }
    else if(val==8)
    {
       digitalWrite(motorReverse, LOW);
       delay(10000);
       digitalWrite(motorForward, HIGH);
       
       
    }
    else if(val==9)
    {
       digitalWrite(motorForward, LOW);
       delay(10000);
       digitalWrite(motorReverse, HIGH);
    }
  }

}
