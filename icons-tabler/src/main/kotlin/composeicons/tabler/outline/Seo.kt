package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Seo: ImageVector
    get() {
        if (_seo != null) return _seo!!
        _seo = tablerOutlineIcon(
            name = "Seo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8h-3C3.448 8 3 8.448 3 9v2c0 .552 .448 1 1 1h2c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-3")
            addPathData("M14 16h-4v-8h4")
            addPathData("M11 12h2")
            addPathData("M17 9c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-2c-.552 0-1-.448-1-1v-6")
        }
        return _seo!!
    }

private var _seo: ImageVector? = null
