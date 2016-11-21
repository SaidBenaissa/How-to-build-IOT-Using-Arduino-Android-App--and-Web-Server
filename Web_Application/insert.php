<?php 
 require "conn.php";
 $command = $_POST["command"];
 $connection = Database::connect();
 $connection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
 //$api = new Database_API();
 if($command=="Turn On Lamp 1")
 {
      $query ="Update Parameters set Lamp1= ?";
      $q = $connection->prepare($query);
      $q->execute(array("1"));
  //$api->updateLamp1Status($connection,1)
 }
 else if($command == "Turn Off Lamp 1")
 {

      $query ="Update Parameters set Lamp1= ?";
      $q = $connection->prepare($query);
      $q->execute(array("0"));
 }
 else if($command == "Turn On Lamp 2")
 {
      $query ="Update Parameters set Lamp2= ?";
      $q = $connection->prepare($query);
      $q->execute(array("1"));
 }
 else if($command== "Turn Off Lamp 2")
 {
      $query ="Update Parameters set Lamp2= ?";
      $q = $connection->prepare($query);
      $q->execute(array("0"));
 }
 else if($command=="Turn On Lamp 3")
 {
      $query ="Update Parameters set Lamp3= ?";
      $q = $connection->prepare($query);
      $q->execute(array("1"));
 }
 else if($command=="Turn Off Lamp 3")
{
      $query ="Update Parameters set Lamp3= ?";
      $q = $connection->prepare($query);
      $q->execute(array("0"));
}
else if($command=="Turn On Lamp 4")
{
      $query ="Update Parameters set Lamp4= ?";
      $q = $connection->prepare($query);
      $q->execute(array("1"));
}
else if($command=="Turn Off Lamp 4")
{
      $query ="Update Parameters set Lamp4= ?";
      $q = $connection->prepare($query);
      $q->execute(array("0"));
}
else if($command=="Motor Forward")
{
      $query ="Update Parameters set Motor = ?";
      $q = $connection->prepare($query);
      $q->execute(array("1"));
}
else if($command=="Motor Reverse")
{
      $query ="Update Parameters set Motor = ?";
      $q = $connection->prepare($query);
      $q->execute(array("0"));
}
 // foreach($pdo->query($sql) as$row) 
  //{
   //echo $row["Test1"];
  //}

  //if($command=="Login")
  //{

  	//echo "Test Succedded";
  //}
  //else
  //{
  	//echo "failed";
  //}
?>