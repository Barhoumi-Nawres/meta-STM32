
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"



SRC_URI:append =" file://snmpd.conf  file://snmptrapd.conf "


do_install:append (){

  install -d ${D}${sysconfdir}/snmp
  install -m 0644 ${WORKDIR}/snmpd.conf ${D}${sysconfdir}/snmp/snmpd.conf
  install -m 0644 ${WORKDIR}/snmptrapd.conf ${D}${sysconfdir}/snmp/snmptrapd.conf


}
