package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = tablerOutlineIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 10l7.383 7.418c.823 .82 .823 2.148 0 2.967-.823 .819-2.153 .819-2.976 0L10 13")
            addPathData("M6 9l4 4")
            addPathData("M13 10 9 6")
            addPathData("M3 21h7")
            addPathData("M6.793 15.793 3.207 12.207c-.39-.391-.39-1.023 0-1.414L5.5 8.5 6 9 9 6 8.5 5.5 10.793 3.207c.391-.39 1.023-.39 1.414 0l3.586 3.586c.39 .39 .39 1.023 0 1.414l-2.293 2.293L13 10l-3 3 .5 .5L8.207 15.793c-.39 .39-1.023 .39-1.414 0")
        }
        return _gavel!!
    }

private var _gavel: ImageVector? = null
