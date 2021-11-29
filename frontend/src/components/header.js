import logo1 from '../img/imageedit_3_3114255606.webp'
import pic1 from '../img/header-pic-1.jpeg'
import pic2 from '../img/header-pic-2.jpeg'
import pic3 from '../img/header-pic-3.jpeg'
import pic4 from '../img/header-pic-4.jpeg'
import pic5 from '../img/hunger-free-future-logo@2x-150x150.webp'
import pic6 from '../img/donations.jpg'
import '../index.css';


const Header = () => {
    return (
        <header className='header'>
            <img src={logo1} alt='pic-one' />
            <img src={pic1} alt='pic-two' />
            <img src={pic2} alt='pic-three' />
            <img src={pic3} alt='pic-four' />
            <img src={pic4} alt='pic-five' />
            <img src={pic5} alt='pic-five' />
            <img src={pic6} alt='pic-five' />
        </header>
    )
}

export default Header
