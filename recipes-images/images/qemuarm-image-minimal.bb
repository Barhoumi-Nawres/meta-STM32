SUMMARY = "QEMU-ARM minimal image "
DESCRIPTION = " QEMU based ARM architecture "

inherit core-image 

IMAGE_ROOTFS_SIZE ?= "8192"
#=8MB this variable specifies the size (in kilobytes) of the root 
#file system image that yocto will generate 
IMAGE_INSTALL:append = " net-snmp-server net-snmp-server-snmpd net-snmp-libs net-snmp-mibs net-snmp-client"

IMAGE_INSTALL = "packagegroup-core-boot "  
#IMAGE_INSTALL:append = " rauc"

