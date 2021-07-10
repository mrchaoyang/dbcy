########
# Java
########

export JAVA_HOME=/usr/local/opt/openjdk\@8/libexec/openjdk.jdk/Contents/Home
# export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_241.jdk/Contents/Home
export M2_HOME=/usr/local/Cellar/maven/3.8.1
export MAVEN_OPTS='-Xmx1024m -Xms256m -XX:MaxPermSize=512m'
# export \-DargLine='-Xmx1536m -Xms1536m -XX:MaxPermSize=1536m'
alias mvn='mvn -Dargline="-Xmx1536m -Xms1536m -XX:MaxPermSize=1536m"'


export PATH=/usr/local/bin:/usr/X11/bin:/usr/bin:/bin:/usr/sbin:/sbin
export PATH=$PATH:"/Applications/Visual Studio Code.app/Contents/Resources/app/bin"
export PATH="/usr/local/opt/openjdk@8/bin:$PATH"
export PATH=$M2_HOME:$PATH


########
# Git branch in prompt.
########
function parse_git_branch() {
  git branch 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/ (\1)/'
}
export PS1="\w\[\033[32m\]\$(parse_git_branch)\[\033[00m\] $ "


########
# TOMCAT
########

export TOMCAT_8_5=/Users/cyang4/tomcat/apache-tomcat-8.5.66
export TOMCAT_9_0=/Users/cyang4/tomcat/apache-tomcat-9.0.46

export TOMCAT_HOME=$TOMCAT_9_0

export catalina_home=$TOMCAT_HOME
export CATALINA_HOME=$catalina_home
export CATALINA_BASE=$CATALINA_HOME
export APP_HOME=$TOMCAT_HOME

export TOMCAT_HOME_IUS=$TOMCAT_HOME
export TOMCAT_HOME_IDM=$TOMCAT_HOME
export TOMCAT_HOME_IDX=$TOMCAT_HOME

export IDM_REPO_HOME=/Users/cyang4/code/identity-ids/idm-service
export IDX_REPO_HOME=/Users/cyang4/code/identity-ids/idx-service
export IUS_REPO_HOME=/Users/cyang4/code/identity-ids/ius-service

export OII_TOMCAT_HOME=$TOMCAT_HOME
export OII_HOME=$IUS_REPO_HOME

export APP_ENV=localhost

########
# PAuth
########
export WAR_FILE=~/code/identity-connect/partnerauth-service/pauth-webapp/target/pauth-webapp.war
alias deploywar='cp $WAR_FILE $CATALINA_HOME/webapps'


########
# Transaction Analyzer
########

# these are used for E2E, Perf, and Prod; make sure the credentials you use work for all 3
export SPLUNK_USERNAME_AWS=cto_identity_rest
export SPLUNK_PASSWORD_AWS=cto_identity123

# S3 bucket name for uploads when running locally    
export OutputBucketName=iip-transaction-analyzer-369117615820-dev-us-west-2

# Incident Assistant
export WAVEFRONT_TOKEN=...
export SLACK_TOKEN=...

export eiamCli_ta_cmd='eiamCli aws_creds -a 3691-1761-5820 -r Developer -p default'
alias eiamCli_ta='echo $eiamCli_ta_cmd; $eiamCli_ta_cmd'

# eiam
export eiamCli_ia_cmd='eiamCli aws_creds -a 8737-5002-5776 -r PowerUser -p default'
alias eiamCli_ia='echo $eiamCli_ia_cmd; $eiamCli_ia_cmd'

export eiamCli_ssh_cmd='eiamCli aws_ssh -a 181299031239 -d ~/.ssh -p id_rsa.pub'
alias eiamCli_ssh='echo $eiamCli_ssh_cmd; eiamCli aws_ssh -a 181299031239 -d ~/.ssh -p id_rsa.pub'
