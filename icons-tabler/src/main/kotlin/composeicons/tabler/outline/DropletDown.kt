package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletDown: ImageVector
    get() {
        if (_dropletDown != null) return _dropletDown!!
        _dropletDown = tablerOutlineIcon(
            name = "DropletDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.602 12.003c-.144-.391-.324-.768-.538-1.126L13.174 3.617c-.42-.625-1.287-.803-1.936-.397-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 1.402 1.128 3.177 1.686 4.972 1.564")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _dropletDown!!
    }

private var _dropletDown: ImageVector? = null
