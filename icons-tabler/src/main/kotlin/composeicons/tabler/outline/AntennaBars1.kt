package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AntennaBars1: ImageVector
    get() {
        if (_antennaBars1 != null) return _antennaBars1!!
        _antennaBars1 = tablerOutlineIcon(
            name = "AntennaBars1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 18v.01")
            addPathData("M10 18v.01")
            addPathData("M14 18v.01")
            addPathData("M18 18v.01")
        }
        return _antennaBars1!!
    }

private var _antennaBars1: ImageVector? = null
