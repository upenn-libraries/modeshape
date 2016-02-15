### Configurable FileSystemConnector

Provide protected (subclass) access to more nuanced handling of 
filesystem metadata; motivated by a desire to accommodate 
[git-annex](http://git-annex.branchable.com/)-aware treatment 
of "broken" symbolic links.

Managed to build with 
```
mvn -DpreferIpv4 -s settings.xml clean install
```

optionally since we're based on a release version, with minimal 
changes (limited to refactoring):
```
mvn -DskipTests=true -DpreferIpv4 -s settings.xml clean install
```

