AC_PREREQ(2.57)
AC_INIT(sipXproxy, 0.0.4.5.2, sipx-dev@list.sipfoundry.org)
AC_CONFIG_AUX_DIR(config)
m4_include([config/general.m4])
m4_include([config/sipXlib.m4])
AM_INIT_AUTOMAKE(foreign tar-ustar)
SFAC_AUTOMAKE_VERSION([1.6])
AC_CONFIG_SRCDIR([src/sipXproxymain.cpp])
AM_CONFIG_HEADER([src/config.h])
AC_PROG_LIBTOOL
AC_PATH_PROG([BASH], [bash])
AC_PROG_CXX
AX_COMPILER_VENDOR
AC_PROG_CC
CHECK_XARGS_REPLACE
AM_CONDITIONAL(IS_RPMBUILD, test x$enable_rpmbuild = xyes)
SFAC_STRICT_COMPILE_NO_WARNINGS_ALLOWED
SFAC_INIT_FLAGS
SFAC_LIB_COMMSERVER
SFAC_FEATURE_SIP_TLS
CHECK_STUNNEL
CHECK_RUBY([1.8.2])
CHECK_RAKE([0.5.3])
CHECK_GEM([0.8.11])
CHECK_ODBC
AC_ARG_ENABLE(cse-tests,
  AC_HELP_STRING([--enable-cse-tests], [Run unit tests that test saving CSE data to postgres db setup]),
  enable_cse_tests=yes)
if test x$enable_cse_tests = xyes
then
  AC_SUBST(SIPXTEST_DATABASE, SIPXDB-TEST)
fi
AM_CONDITIONAL(ENABLE_CSE_TESTS, test x$enable_cse_tests = xyes)
CHECK_POSTGRES
AC_CONFIG_FILES([Makefile])
AC_CONFIG_FILES([src/Makefile])
AC_CONFIG_FILES([src/test/Makefile])
AC_CONFIG_FILES([include/Makefile])
AC_CONFIG_FILES([lib/Makefile])
AC_CONFIG_FILES([lib/authplugins/Makefile])
AC_CONFIG_FILES([lib/authplugins/NatTraversalAgent/Makefile])
AC_CONFIG_FILES([lib/authplugins/test/Makefile])
AC_CONFIG_FILES([bin/Makefile])
AC_CONFIG_FILES([meta/Makefile])
AC_CONFIG_FILES([etc/Makefile])
AC_CONFIG_FILES([etc/database/Makefile])
AC_CONFIG_FILES([src/cdr/Makefile])
AC_OUTPUT
