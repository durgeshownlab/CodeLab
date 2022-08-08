import React from 'react'

export const Center = () => {
  const resizableTextArea={
    "resize": "none"
  }
  return (
    <>
      <div className="container">
        <div className="mb-3">
          <h4>Enter your text to Beautify</h4>
          <textarea className="form-control" id="exampleFormControlTextarea1" rows="10" style={resizableTextArea}></textarea>
        </div>

        <button type="button" className="btn btn-primary btn-sm m-2">UpperCase</button>
        <button type="button" className="btn btn-primary btn-sm m-2">Lowercase</button>
        <button type="button" className="btn btn-primary btn-sm m-2">Copy</button>
        <button type="button" className="btn btn-primary btn-sm m-2">Clear</button>
      </div>
    </>
  )
}
