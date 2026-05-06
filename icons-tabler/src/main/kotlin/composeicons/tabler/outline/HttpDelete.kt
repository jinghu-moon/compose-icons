package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HttpDelete: ImageVector
    get() {
        if (_httpDelete != null) return _httpDelete!!
        _httpDelete = tablerOutlineIcon(
            name = "HttpDelete",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8v8h2c1.105 0 2-.895 2-2v-4C7 8.895 6.105 8 5 8h-2")
            addPathData("M14 8h-4v8h4")
            addPathData("M10 12h2.5")
            addPathData("M17 8v8h4")
        }
        return _httpDelete!!
    }

private var _httpDelete: ImageVector? = null
