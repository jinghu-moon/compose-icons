package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletExclamation: ImageVector
    get() {
        if (_dropletExclamation != null) return _dropletExclamation!!
        _dropletExclamation = tablerOutlineIcon(
            name = "DropletExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.602 12.004c-.144-.392-.324-.769-.538-1.127L13.174 3.617c-.42-.625-1.287-.803-1.936-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 2.142 1.734 5.092 2.04 7.519 .919")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _dropletExclamation!!
    }

private var _dropletExclamation: ImageVector? = null
