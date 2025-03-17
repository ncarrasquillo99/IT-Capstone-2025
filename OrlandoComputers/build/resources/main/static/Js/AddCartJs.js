document.addEventListener("DOMContentLoaded", function () {//Waits for the DOM to load before running. DOM - Document Object Model
    let addCartButtons = document.querySelectorAll('.cart_button');
    let cartCountElement = document.querySelector('.cart_count'); // Updated selector
    let cartCount = 0;

    if (!cartCountElement) {
        console.error("Cart count element not found!");
        return;
    }

    addCartButtons.forEach((button) => {
        button.addEventListener('click', () => {
            cartCount++;
            cartCountElement.innerText = cartCount; // Ensure innerText is updated
            console.log(`Cart count updated: ${cartCount}`);
        });
    });
});
// It finds all elements in the document that have the class "cart_button"