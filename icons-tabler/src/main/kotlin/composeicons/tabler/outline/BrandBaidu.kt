package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBaidu: ImageVector
    get() {
        if (_brandBaidu != null) return _brandBaidu!!
        _brandBaidu = tablerOutlineIcon(
            name = "BrandBaidu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 9.5C4 10.328 4.448 11 5 11c.552 0 1-.672 1-1.5C6 8.672 5.552 8 5 8 4.448 8 4 8.672 4 9.5")
            addPathData("M14.463 11.596c1.282 1.774 3.476 3.416 3.476 3.416 0 0 1.921 1.574 .593 3.636-1.328 2.063-4.892 1.152-4.892 1.152 0 0-1.416-.44-3.06-.088-1.644 .356-3.06 .22-3.06 .22 0 0-2.055-.22-2.47-2.304C4.634 15.544 6.968 13.99 7.152 13.77c.182-.222 1.409-.966 2.284-2.394 .875-1.428 3.337-2.287 5.027 .221")
            addPathData("M8 4.5C8 5.328 8.448 6 9 6c.552 0 1-.672 1-1.5C10 3.672 9.552 3 9 3 8.448 3 8 3.672 8 4.5")
            addPathData("M14 4.5C14 5.328 14.448 6 15 6c.552 0 1-.672 1-1.5C16 3.672 15.552 3 15 3c-.552 0-1 .672-1 1.5")
            addPathData("M18 9.5c0 .828 .448 1.5 1 1.5 .552 0 1-.672 1-1.5C20 8.672 19.552 8 19 8c-.552 0-1 .672-1 1.5")
        }
        return _brandBaidu!!
    }

private var _brandBaidu: ImageVector? = null
