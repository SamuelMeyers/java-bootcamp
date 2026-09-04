package com.academy.library;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class ReportService {

    private final LibraryService libraryService;

    public ReportService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void displaySummaryReport() {

        int totalBooks =
                libraryService.getBooks().size();

        int borrowedBooks =
                libraryService.getBorrowRecords().size();

        int availableBooks =
                totalBooks - borrowedBooks;

        int totalMembers =
                libraryService.getMembers().size();

        String mostPopularCategory =
                findMostPopularCategory();

        System.out.println("===== Library Summary Report =====");
        System.out.println("Total Books : " + totalBooks);
        System.out.println("Borrowed : " + borrowedBooks);
        System.out.println("Available : " + availableBooks);
        System.out.println("Total Members : " + totalMembers);
        System.out.println(
                "Most Popular Category : "
                        + mostPopularCategory
        );
    }

    public Path exportReportToFile(String fileName) throws IOException {
        // Bonus / full-path feature — implement after core borrow/return/summary TODOs.
        System.out.println(
                "Bonus / full-path feature — implement after core TODOs."
        );
        return Path.of(fileName);
    }

    private String findMostPopularCategory() {

        return libraryService
                .getCategoryBookCount()
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("N/A");
    }
}
