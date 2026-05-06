package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletUp: ImageVector
    get() {
        if (_dropletUp != null) return _dropletUp!!
        _dropletUp = tablerOutlineIcon(
            name = "DropletUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.6 11.998c-.143-.389-.323-.764-.536-1.12L13.174 3.618c-.42-.626-1.287-.804-1.936-.398-.163 .102-.303 .237-.41 .397L5.935 10.877c-1.695 2.838-1.035 6.441 1.567 8.546 1.41 1.134 3.197 1.692 5.002 1.562")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _dropletUp!!
    }

private var _dropletUp: ImageVector? = null
