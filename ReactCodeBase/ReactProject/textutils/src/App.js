import { TextForm } from './components/TextForm';
import { Navbar } from './components/Navbar';

function App() {
  return (
    <>
      <Navbar title="TextUtils"/>
      <TextForm title="Enter your text to analyze" />
    </>
  );
}

export default App;
