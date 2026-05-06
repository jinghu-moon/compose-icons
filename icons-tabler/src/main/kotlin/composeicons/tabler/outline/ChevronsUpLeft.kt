package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronsUpLeft: ImageVector
    get() {
        if (_chevronsUpLeft != null) return _chevronsUpLeft!!
        _chevronsUpLeft = tablerOutlineIcon(
            name = "ChevronsUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 15v-8h8")
            addPathData("M11 19v-8h8")
        }
        return _chevronsUpLeft!!
    }

private var _chevronsUpLeft: ImageVector? = null
