example-script-remote-node-step-plugin
------

This directory contains an example script-based Remote Script Node Step Plugin.

Build
====

    make

produces:

    example-script-remote-node-step-plugin.zip

Files
=====

`example-script-remote-node-step-plugin/plugin.yaml`

:   Defines the metadata for the plugin

`example-script-remote-node-step-plugin/contents/`

:   directory containing necessary scripts or assets

`example-script-remote-node-step-plugin/contents/nodestep.sh`

:   the script defined in plugin.yaml to be executed for the plugin


Plugin metadata
=====

The `plugin.yaml` file declares one script based service provider for the `RemoteScriptNodeStep` service.

Usage
=====

Install the plugin in your `$RDECK_BASE/libext` directory:

    mv example-script-remote-node-step-plugin.zip $RDECK_BASE/libext
