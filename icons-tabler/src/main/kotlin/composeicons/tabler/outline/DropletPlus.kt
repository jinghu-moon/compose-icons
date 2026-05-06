package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletPlus: ImageVector
    get() {
        if (_dropletPlus != null) return _dropletPlus!!
        _dropletPlus = tablerOutlineIcon(
            name = "DropletPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.602 12.004c-.144-.392-.324-.769-.538-1.127L13.174 3.617c-.42-.625-1.287-.803-1.936-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 1.418 1.141 3.218 1.699 5.033 1.56")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _dropletPlus!!
    }

private var _dropletPlus: ImageVector? = null
