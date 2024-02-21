(() => {
  'use strict'

  const forms = document.querySelectorAll('.needs-validation')


  Array.from(forms).forEach(form => {
    form.addEventListener('submit', event => {
      if (!form.checkValidity()) {
        event.preventDefault()
        event.stopPropagation()
      }

      form.classList.add('was-validated')
    }, false)
  })
})()


    // Function to get URL parameter by name
function getUrlParameter(name) {
  name = name.replace(/[[]/, '\\[').replace(/[\]]/, '\\]');
  var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
  var results = regex.exec(location.search);
  return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};

  // Get the email parameter from the URL and set it as the value of the email input field
  var email = getUrlParameter('email');
  document.getElementById('email').value = email;
