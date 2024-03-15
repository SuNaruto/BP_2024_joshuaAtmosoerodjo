<!DOCTYPE html>
<html lang="en">

<header>
    <img src="your_logo.png" alt="Logo">

<nav>
        <a href="index.jsp">Books</a>
        <a href="user.jsp">Users</a>
        <a href="about.jsp">About</a>
    </nav>
</header>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Overview</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="book.css">
</head>

<body>

<div class="container">
<div class="row">
    <div class="col-md-6">
        <h1 style="color: #fff;">Books Overview</h1>
    </div>
    <div class="col-md-6 text-md-end">
        <button id="createBookBtn" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#createBookModal">Create Book</button>
    </div>

</div>


    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>titel</th>
            <th>auteur</th>
            <th>aantal</th>

        </tr>
        </thead>
        <tbody id="booksTableBody"></tbody>
    </table>

    <button class="btn btn-primary" onclick="goToIndex()">Back to Index</button>
</div>

<!-- Edit Book Modal -->
<div class="modal" id="editBookModal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Edit Book</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <!-- Book edit form -->
                <form id="editBookForm">
                    <div class="form-group">
                        <label for="editTitle">Title:</label>
                        <input type="text" class="form-control" id="editTitle" name="editTitle" required>
                    </div>
                    <div class="form-group">
                        <label for="editAuthor">Author:</label>
                        <input type="text" class="form-control" id="editAuthor" name="editAuthor" required>
                    </div>
                    <!-- Added a field for Quantity -->
                    <div class="form-group">
                        <label for="editAantal">Quantity:</label>
                        <input type="number" class="form-control" id="editAantal" name="editAantal" required>
                    </div>

                    <!-- Add a hidden input field for Book ID -->
                    <input type="hidden" id="editBookID">
                    <!-- Submit button -->
                    <button type="button" class="btn btn-primary" onclick="saveBookChanges()">Update</button>
                </form>
            </div>
        </div>
    </div>
</div>


<!-- Confirmation Modal -->
<div class="modal fade" id="confirmationModal" tabindex="-1" role="dialog" aria-labelledby="confirmationModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="confirmationModalLabel">Confirm Deletion</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <p>Are you sure you want to delete this Book?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-danger" id="confirmDeleteBtn">Delete</button>
            </div>
        </div>
    </div>
</div>

<div id="alertPlaceholder"></div>
<!-- Create Book Modal -->
<div class="modal" id="createBookModal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Create Book</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <!-- Book create form -->
                <form id="createBookForm">
                    <div class="form-group">
                        <label for="createTitle">Title:</label>
                        <input type="text" class="form-control" id="createTitle" name="titel" required>
                    </div>
                    <div class="form-group">
                        <label for="createAuthor">Author:</label>
                        <input type="text" class="form-control" id="createAuthor" name="auteur" required>
                    </div>
                    <!-- Removed the Genre input because it is not present in your entity -->
                    <div class="form-group">
                        <label for="createAantal">Quantity:</label>
                        <input type="number" class="form-control" id="createAantal" name="aantal" required>
                    </div>
                    <!-- Submit button -->
                    <button type="button" class="btn btn-success" onclick="saveBook()">Save</button>

                </form>

            </div>
        </div>
    </div>
</div>




<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="boek.js"></script>
<script src="https://cdn.jsdelivr.net/npm/mixpanel-browser@latest/dist/mixpanel.min.js"></script>

<script>
    function goToIndex() {
        window.location.href = 'http://localhost:8080/prod/';
    }
</script>

</body>

</html>
