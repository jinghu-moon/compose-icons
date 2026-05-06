package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Reload: ImageVector
    get() {
        if (_reload != null) return _reload!!
        _reload = tablerOutlineIcon(
            name = "Reload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.933 13.041c-.523 3.991-3.931 6.972-7.956 6.96C7.952 19.989 4.562 16.988 4.063 12.993 3.563 8.999 6.11 5.256 10.008 4.253 13.907 3.253 17.943 5.26 19.433 9")
            addPathData("M20 4v5h-5")
        }
        return _reload!!
    }

private var _reload: ImageVector? = null
