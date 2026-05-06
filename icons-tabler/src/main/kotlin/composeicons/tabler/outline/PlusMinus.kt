package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = tablerOutlineIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7h6")
            addPathData("M7 4v6")
            addPathData("M20 18h-6")
            addPathData("M5 19 19 5")
        }
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
