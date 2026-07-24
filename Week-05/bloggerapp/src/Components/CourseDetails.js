import React from "react";

function CourseDetails() {
  const courses = [
    {
      id: 1,
      course: "Angular",
      date: "4/5/2021"
    },
    {
      id: 2,
      course: "React",
      date: "6/3/20201"
    }
  ];

  return (
    <div>
      <h1>Course Details</h1>

      {courses.map((course) => (
        <div key={course.id}>
          <h2>{course.course}</h2>
          <h3>{course.date}</h3>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;