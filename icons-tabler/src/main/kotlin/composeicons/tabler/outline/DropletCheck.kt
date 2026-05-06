package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletCheck: ImageVector
    get() {
        if (_dropletCheck != null) return _dropletCheck!!
        _dropletCheck = tablerOutlineIcon(
            name = "DropletCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.967 13.594c-.098-.961-.406-1.889-.903-2.717L13.174 3.617c-.42-.625-1.287-.803-1.936-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 1.152 .928 2.564 1.475 4.04 1.565")
            addPathData("M15 19l2 2 4-4")
        }
        return _dropletCheck!!
    }

private var _dropletCheck: ImageVector? = null
