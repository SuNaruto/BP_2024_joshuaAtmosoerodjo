
function fetchBoeken() {
    fetch('http://localhost:8080/api/library/boek/all')
        .then(response => response.json())
        .then(data => displayBoeken(data))
        .catch(error => console.error('Fout bij het ophalen van boeken:', error));
}
// Function to fetch books from the server
function fetchBooks() {
    $.ajax({
        url: 'http://localhost:8080/api/library/boek/all',
        method: 'GET',
        dataType: 'json',
        success: function (data) {
            displayBooks(data);
        },
        error: function (xhr, status, error) {
            console.error('Error fetching Books:', error);
        }
    });
}

//fetchBooks();

function deleteBook(bookID) {
    // Open de bevestigingsmodal
    $('#confirmationModal').modal('show');

    // Afhandeling van klik op de "Verwijderen" knop binnen de modal
    $('#confirmDeleteBtn').off('click').on('click', function () {
        // Sluit de modal
        $('#confirmationModal').modal('hide');

        // Voer de daadwerkelijke verwijdering uit
        $.ajax({
            url: 'http://localhost:8080/api/library/boek/delete/' + bookID, // Aangepaste URL naar jouw API endpoint
            method: 'DELETE',
            success: function () {
                // Haal en toon bijgewerkte boekgegevens op
                fetchBoeken(); // Zorg ervoor dat deze functie overeenkomt met jouw functie om boeken op te halen
                location.reload();
                showAlert('Book deleted successfully!', 'success'); // Optioneel: toon een succesbericht
            },
            error: function (xhr, status, error) {
                console.error('Error deleting book:', error);
                showAlert('Failed to delete the book. Please try again!', 'danger'); // Optioneel: toon een foutbericht
            }
        });
    });
}



// Function to edit a book by ID
function editBook(bookID) {
    // Fetch the existing book information
    $.ajax({
        url: 'http://localhost:8080/api/library/boek/get/' + bookID, // Zorg ervoor dat deze URL correct is
        method: 'GET',
        dataType: 'json',
        success: function (book) {
            // Populate the form fields with existing information
            $('#editBookID').val(book.id); // Pas aan op basis van je daadwerkelijke veldnamen
            $('#editTitle').val(book.titel);
            $('#editAuthor').val(book.auteur);
            // Verwijder of voeg velden toe naar behoefte

            // Display the edit modal
            $('#editBookModal').modal('show');

            // Set up a click event for the "Save Changes" button in the modal
            $('#saveChangesBtn').off('click').on('click', function () {
                // Call the function to save the changes
                saveBookChanges(book.id); // Zorg ervoor dat deze functie correct de updates opslaat
            });
        },
        error: function (xhr, status, error) {
            console.error('Error fetching Book for edit:', error);
            // Display an error message on the page if needed
        }
    });
}

function saveBookChanges() {
    // Verzamel de geüpdatete boekgegevens uit het formulier
    var updatedData = {
        id: $('#editBookID').val(), // Zorg ervoor dat je daadwerkelijk de ID van het boek hebt
        titel: $('#editTitle').val(),
        auteur: $('#editAuthor').val(),
        aantal: parseInt($('#editAantal').val(), 10)
    };

    // AJAX request om het boek te updaten
    $.ajax({
        url: 'http://localhost:8080/api/library/boek/update', // Update deze URL naar jouw correcte API endpoint
        method: 'PUT', // Gebruik PUT (of PATCH als je backend dat ondersteunt) voor updates
        contentType: 'application/json',
        data: JSON.stringify(updatedData),
        success: function() {
            // Bij succes, sluit de modal en toon een succesmelding
            $('#editBookModal').modal('hide');
            showAlert('Book updated successfully!', 'success');
            fetchBoeken(); // Herlaad de lijst met boeken om de update te reflecteren
        },
        error: function(xhr, status, error) {
            // Toon foutmelding bij een error
            console.error('Error updating book:', error);
            showAlert('Failed to update the book. Please try again!', 'danger');
        }
    });
}





// Roep fetchBoeken aan wanneer de pagina laadt
$(document).ready(function() {
    fetchBoeken();
});

function displayBoeken(boeken) {
    var tableBody = $('#booksTableBody');
//    tableBody.empty();

    boeken.forEach(function (boek) {
        var row = '<tr>' +
            '<td>' + boek.id + '</td>' +
            '<td>' + boek.titel + '</td>' +
            '<td>' + boek.auteur + '</td>' +
            '<td>' + boek.aantal + '</td>' +
                                             // Add other fields as needed
                                            '<td>' +
                                             '<button class="btn btn-warning btn-sm" onclick="editBook(' + boek.id + ')">Edit</button> ' +
                                             '<button class="btn btn-danger btn-sm" onclick="deleteBook(' + boek.id + ')">Delete</button>' +
                                             '</td>' +
                                             '</tr>';
        tableBody.append(row);
    });
}


function saveBook() {
    var newData = {
        titel: $('#createTitle').val(),
        auteur: $('#createAuthor').val(),
        aantal: parseInt($('#createAantal').val(), 10)
    };

    $.ajax({
        url: 'http://localhost:8080/api/library/boek/add',
        method: 'POST',
        contentType: 'application/json',
        data: JSON.stringify(newData),
        success: function(data) {
            console.log('Success:', data);
            $('#createBookModal').modal('hide');
            $('#createBookForm')[0].reset();
            showAlert('Book saved successfully!', 'success');

            // Voeg het nieuwe boek toe aan de tabel.
            // Als je backend het volledige boekobject, inclusief het ID, terugstuurt, gebruik dan `data` in plaats van `newData`.
            // Je moet dan mogelijk het ID handmatig instellen of de lijst opnieuw ophalen om nauwkeurige ID's te hebben.
            addBookToTable(newData);
        },
        error: function(xhr, status, error) {
            console.error('Error:', error);
            showAlert('Failed to save the book. Please try again!', 'danger');
        }
    });
}


function showAlert(message, type) {
    var alertPlaceholder = $('#alertPlaceholder');
    var alert = $('<div class="alert alert-' + type + ' alert-dismissible fade show" role="alert">' + message + '<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button></div>');

    alertPlaceholder.append(alert);

    // Zorg ervoor dat de alert automatisch verdwijnt na 5 seconden
    setTimeout(function() {
        alert.alert('close');
    }, 5000);
}


$('#createBookModal').on('hidden.bs.modal', function () {
    // Reset het form wanneer het modal gesloten wordt.
    $('#createBookForm').trigger('reset');
});
$('.close').on('click', function () {
    $('#createBookModal').modal('hide');
});

