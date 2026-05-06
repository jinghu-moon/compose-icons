package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletOff: ImageVector
    get() {
        if (_dropletOff != null) return _dropletOff!!
        _dropletOff = tablerOutlineIcon(
            name = "DropletOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.963 14.938c.15-1.415-.166-2.841-.899-4.06L13.174 3.618c-.42-.626-1.287-.804-1.936-.398-.163 .102-.303 .237-.41 .397L9.546 5.517M7.921 7.932 5.935 10.878c-1.695 2.837-1.035 6.44 1.567 8.545 2.602 2.105 6.395 2.105 8.996 0 .531-.428 .995-.933 1.376-1.499")
            addPathData("M3 3 21 21")
        }
        return _dropletOff!!
    }

private var _dropletOff: ImageVector? = null
