package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletHalf: ImageVector
    get() {
        if (_dropletHalf != null) return _dropletHalf!!
        _dropletHalf = tablerOutlineIcon(
            name = "DropletHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.502 19.423c2.602 2.105 6.395 2.105 8.996 0 2.602-2.105 3.262-5.708 1.566-8.546L13.174 3.617c-.42-.625-1.287-.803-1.936-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546")
            addPathData("M12 3v18")
        }
        return _dropletHalf!!
    }

private var _dropletHalf: ImageVector? = null
