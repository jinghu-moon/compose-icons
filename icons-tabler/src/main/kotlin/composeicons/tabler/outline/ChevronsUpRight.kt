package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChevronsUpRight: ImageVector
    get() {
        if (_chevronsUpRight != null) return _chevronsUpRight!!
        _chevronsUpRight = tablerOutlineIcon(
            name = "ChevronsUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 7h8v8")
            addPathData("M5 11h8v8")
        }
        return _chevronsUpRight!!
    }

private var _chevronsUpRight: ImageVector? = null
