import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Calendar

//Thu Oct 29 2015 15:17:11 GMT+0000 (GMT Standard Time)
Calendar c = Calendar.getInstance();

c.setTime(new Date()); // Now use today date.

c.add(Calendar.HOUR, 7);

dateFormatter = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss zzzZZZZZ (zzzzzzzzzzz)")
dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT"))

//println dateFormatter.format(c.getTime())

def filename = "bob.txt"
def file = new File(filename)

def inString = dateFormatter.format(c.getTime())
println inString
boolean fileSuccessfullyDeleted =  new File(filename).delete()  
if(fileSuccessfullyDeleted){
	file << inString
	} else {
		err = new File("warbandTime.err")
		err << "Timer file not deleted"
	}
