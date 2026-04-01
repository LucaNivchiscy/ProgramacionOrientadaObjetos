$ErrorActionPreference = "Stop"

$root = Split-Path -Parent $MyInvocation.MyCommand.Path
Set-Location $root

$bin = Join-Path $root "bin"
if (Test-Path $bin) {
    Remove-Item -Recurse -Force $bin
}
New-Item -ItemType Directory -Path $bin | Out-Null

$javaFiles = Get-ChildItem -Path (Join-Path $root "src") -Filter *.java -Recurse |
    ForEach-Object { $_.FullName }

& javac -d $bin $javaFiles
if ($LASTEXITCODE -ne 0) {
    exit $LASTEXITCODE
}

& java --module-path $bin -m POO/ar.com.unpaz.principal.Main
exit $LASTEXITCODE
