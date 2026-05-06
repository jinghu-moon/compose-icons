package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Businessplan: ImageVector
    get() {
        if (_businessplan != null) return _businessplan!!
        _businessplan = tablerOutlineIcon(
            name = "Businessplan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 6c0 1.657 2.239 3 5 3 2.761 0 5-1.343 5-3C21 4.343 18.761 3 16 3 13.239 3 11 4.343 11 6")
            addPathData("M11 6v4c0 1.657 2.239 3 5 3 2.761 0 5-1.343 5-3v-4")
            addPathData("M11 10v4c0 1.657 2.239 3 5 3 2.761 0 5-1.343 5-3v-4")
            addPathData("M11 14v4c0 1.657 2.239 3 5 3 2.761 0 5-1.343 5-3v-4")
            addPathData("M7 9h-2.5C3.672 9 3 9.672 3 10.5 3 11.328 3.672 12 4.5 12h1C6.328 12 7 12.672 7 13.5 7 14.328 6.328 15 5.5 15h-2.5")
            addPathData("M5 15v1M5 8v1")
        }
        return _businessplan!!
    }

private var _businessplan: ImageVector? = null
