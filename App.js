/*
<div>   
    <div>
        <h1 id="heading">Hello</h1>
    </div>
</div>
*/


let reactHeading= React.createElement(
    "div",
    {},
    React.createElement(
        "div",
        {},
        [React.createElement(
            "h1",
            {id:"h1" ,style:{color:"blue"}},
            "Hello"
        ),
        React.createElement(
            "h2",
            {id:"h2" ,style:{color:"orange"}},
            "Hello"
        )]
    )
);
let root = ReactDOM.createRoot(document.querySelector("#root"));
    
let x=root.render(reactHeading);