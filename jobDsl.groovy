def scmBlock = { 
    git("https://github.com/Praqma/circus-master.git")
}

job ("LUCI_Create_machines") {
  scm scmBlock

  steps {
    shell "./gradlew initializeAllHosts"
  }
  
}

job ("LUCI_Create_workshop_lucibox") {
  scm scmBlock

  steps {
    shell "./gradlew workshopUp"
  }
  
}
