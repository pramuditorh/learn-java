package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {
    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull() {
        // Cek apakah array model sudah penuh
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIfFull() {
        // Jika penuh, resize ukuran array model menjadi 2x lipat
        if (isFull()) {
            // Variable temprary untuk menampung isi array model existing
            var temp = data;

            // Resize, jika tidak di backup maka data yang sudah diisi sebelumnya akan hilang
            data = new TodoList[data.length * 2];

            // Copy isi dari variable temp kembali ke array model
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todoList) {
        resizeIfFull();

        // Tambahkan data ke posisi array yang masih NULL
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todoList;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        // Cek apakah index data yang akan dihapus lebih besar sama dengan panjang array nya
        if ((number - 1) >= data.length) {
            return false;
        }
        // Cek apakah data yang akan dihapus bernilai null
        else if (data[number - 1] == null) {
            return false;
        } else {
            // Perulangan untuk menggeser data yang dihapus ke paling ujung kanan (index paling besar)
            for (int i = (number - 1); i < data.length; i++) {
                // Cek apakah index paling kanan, ubah data menjadi null
                if (i == (data.length - 1)) {
                    data[i] = null;
                }
                // Tukar data index sekarang dengan data index selanjutnya
                else {
                    data[i] = data[i + 1];
                }
            }
            return true;
        }
    }
}
