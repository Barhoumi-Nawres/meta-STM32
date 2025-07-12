SUMMARY = "STM32 minimal image "
DESCRIPTION = "STM32MP1 based ARM architecture "

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
#=8MB this variable specifies the size (in kilobytes) of the root 
#file system image that yocto will generate 

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"




