import React, { useState } from "react";

import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function LoginControl() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  let page;

  if (isLoggedIn) {
    page = <UserPage />;
  } else {
    page = <GuestPage />;
  }

  return (
    <div style={{ textAlign: "center" }}>

      {page}

      <br />

      {isLoggedIn ? (
        <button onClick={() => setIsLoggedIn(false)}>
          Logout
        </button>
      ) : (
        <button onClick={() => setIsLoggedIn(true)}>
          Login
        </button>
      )}

    </div>
  );
}

export default LoginControl;