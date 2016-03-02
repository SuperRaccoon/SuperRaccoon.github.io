<?php
  $name = $_POST[‘contact-name'];
  $visitor_email = $_POST[‘contact-email'];
  $message = $_POST[‘contact-msg];

  $email_from = 'isab.officer@gmail.com';
  $email_subject = "ISAB website message";
  $email_body = "Message from the viewer: $name.\n".
  				"Their email is: $visitor_email.\n".
                "Here is the message:\n $message".

  $to = “kriswjma@gmail.com;
  $headers = "From: $visitor_email \r\n";
  $headers .= "Reply-To: $visitor_email \r\n";
 
  mail($to,$email_subject,$email_body,$headers);

  sleep(5);



?>
