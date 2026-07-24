import React from "react";

function ListofPlayers() {

  const players = [
    { name: "Virat", score: 90 },
    { name: "Rohit", score: 45 },
    { name: "Gill", score: 78 },
    { name: "Rahul", score: 60 },
    { name: "Hardik", score: 88 },
    { name: "Jadeja", score: 50 },
    { name: "Surya", score: 72 },
    { name: "Pant", score: 65 },
    { name: "Bumrah", score: 35 },
    { name: "Shami", score: 55 },
    { name: "Siraj", score: 80 }
  ];

  const lowScorePlayers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>

      {players.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}

      <h2>Players with Score Below 70</h2>

      {lowScorePlayers.map((player, index) => (
        <p key={index}>
          {player.name} - {player.score}
        </p>
      ))}
    </div>
  );
}

export default ListofPlayers;