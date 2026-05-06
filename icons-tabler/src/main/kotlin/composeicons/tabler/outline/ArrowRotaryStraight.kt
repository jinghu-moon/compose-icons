package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRotaryStraight: ImageVector
    get() {
        if (_arrowRotaryStraight != null) return _arrowRotaryStraight!!
        _arrowRotaryStraight = tablerOutlineIcon(
            name = "ArrowRotaryStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 13c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M13 16v5")
            addPathData("M13 3v7")
            addPathData("M9 7 13 3l4 4")
        }
        return _arrowRotaryStraight!!
    }

private var _arrowRotaryStraight: ImageVector? = null
