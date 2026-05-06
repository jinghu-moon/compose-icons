package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpHead: ImageVector
    get() {
        if (_httpHead != null) return _httpHead!!
        _httpHead = tablerOutlineIcon(
            name = "HttpHead",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16v-8")
            addPathData("M7 8v8")
            addPathData("M3 12h4")
            addPathData("M14 8h-4v8h4")
            addPathData("M10 12h2.5")
            addPathData("M17 16v-6c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v6")
            addPathData("M17 13h4")
        }
        return _httpHead!!
    }

private var _httpHead: ImageVector? = null
