<?php 
class Database_API
{
	//This class will give you the functions necessary to access the database
	 public function __construct() {
        
    }

	//function to update the status of Lamp1
	public function updateLamp1Status($connection,$status)
	{
		 $sql ="Update Parameters set Lamp1= ?";
         $query = $connection->prepare($sql);
 		 $query->execute(array($status));
	}
	//Function to update status of Lamp2
	public function updateLamp2Status($connection,$status)
	{
		$sql ="Update Parameters set Lamp2= ?";
        $query = $connection->prepare($sql);
 		$query->execute(array($status));
	}
	//Function to update status  of Lamp3
	public function updateLamp3Status($connection,$status)
	{
		$sql = "Updtae Parameters Set Lamp3 = ?";
		$query = $connection->prepare($sql);
		$query->execute(array($status));
	}
	//Function to update status of Lamp4
	public function updateLamp4Status($connection,$status)
	{
		$sql = "Updtae Parameters Set Lamp4 = ?";
		$query = $connection->prepare($sql);
		$query->execute(array($status));
	}
	//Function to update status of Motor
	public function updateMotorStatus($connection,$status)
	{
		$sql = "Updtae Parameters Set Motor = ?";
		$query = $connection->prepare($sql);
		$query->execute(array($status));
	}

}

?>