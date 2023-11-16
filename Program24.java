package mypackages;

// Importing the ExternalClass from the externalpackage
import externalpackage.ExternalClass;

public class SamePackageClass {
    public int samePackageVar = 20;

    public void samePackageMethod() {
        System.out.println("This is a method in the same package");
    }

    public static void main(String[] args) {
        ExternalClass externalObj = new ExternalClass();
        
        // Accessing member of the ExternalClass from a different package
        System.out.println("External variable accessed from SamePackageClass: " + externalObj.externalVar);
        externalObj.externalMethod();
        
        SamePackageClass samePackageObj = new SamePackageClass();
        
        // Accessing member of the SamePackageClass within the same package
        System.out.println("Same package variable accessed from SamePackageClass: " + samePackageObj.samePackageVar);
        samePackageObj.samePackageMethod();
    }
}
