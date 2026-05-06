package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletPause: ImageVector
    get() {
        if (_dropletPause != null) return _dropletPause!!
        _dropletPause = tablerOutlineIcon(
            name = "DropletPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.952 13.456c-.112-.912-.415-1.791-.888-2.579L13.174 3.617c-.42-.625-1.287-.803-1.936-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 1.551 1.245 3.549 1.791 5.517 1.507")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _dropletPause!!
    }

private var _dropletPause: ImageVector? = null
