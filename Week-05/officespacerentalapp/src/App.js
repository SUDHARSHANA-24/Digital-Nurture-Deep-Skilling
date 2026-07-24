import React from "react";
import officeImage from "./Images/Office.png";

function App() {

  const office = {
    name: "Skyline Business Center",
    rent: 55000,
    address: "MG Road, Bengaluru"
  };

  const officeList = [
    {
      name: "Skyline Business Center",
      rent: 55000,
      address: "MG Road, Bengaluru"
    },
    {
      name: "Tech Park Office",
      rent: 75000,
      address: "Whitefield, Bengaluru"
    },
    {
      name: "City Towers",
      rent: 45000,
      address: "Anna Salai, Chennai"
    }
  ];

  return (
    <div style={{ textAlign: "center" }}>
      <h1>Office Space Rental App</h1>

      <img
        src={officeImage}
        alt="Office"
        width="500"
        height="300"
      />

      <h2>Featured Office</h2>

      <p><b>Name:</b> {office.name}</p>

      <p>
        <b>Rent:</b>
        <span
          style={{
            color: office.rent < 60000 ? "red" : "green"
          }}
        >
          {" "}₹{office.rent}
        </span>
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      <h2>Available Office Spaces</h2>

      {officeList.map((item, index) => (
        <div
          key={index}
          style={{
            border: "1px solid gray",
            margin: "20px",
            padding: "15px"
          }}
        >
          <h3>{item.name}</h3>

          <p>
            <b>Rent:</b>

            <span
              style={{
                color: item.rent < 60000 ? "red" : "green"
              }}
            >
              {" "}₹{item.rent}
            </span>
          </p>

          <p><b>Address:</b> {item.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;