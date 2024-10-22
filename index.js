const express = require("express");
const cors = require("cors"); // Import CORS package
const { exec } = require("child_process");
const app = express();
const PORT = 5000; // Changed PORT to 5000 to match your earlier setup

// Enable CORS for all routes
app.use(cors());

// Middleware to parse JSON requests
app.use(express.json());

// Function to execute a method from the JAR file
const executeJarMethod = (className, methodName, res) => {
  const jarPath = "./myclasses.jar";

  // Construct the command to execute the specified method
  const command = `java -cp ${jarPath} ${className} ${methodName}`;

  exec(command, (error, stdout, stderr) => {
    if (error) {
      console.error(`Error executing method: ${error.message}`);
      res.status(500).send(`Error executing method: ${error.message}`);
      return;
    }
    if (stderr) {
      console.error(`Error output: ${stderr}`);
      res.status(500).send(`Error: ${stderr}`);
      return;
    }

    // Send the output from the JAR method back to the client
    res.send(stdout);
  });
};

// Define API endpoint to call methods from specific classes
app.get("/api/:className/:methodName", (req, res) => {
  const className = req.params.className;
  const methodName = req.params.methodName;

  console.log(`Executing method: ${methodName} from class: ${className}`);

  // Execute the specified method
  executeJarMethod(className, methodName, res);
});

// Start the server
app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});
