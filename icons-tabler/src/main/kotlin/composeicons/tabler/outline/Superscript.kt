package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Superscript: ImageVector
    get() {
        if (_superscript != null) return _superscript!!
        _superscript = tablerOutlineIcon(
            name = "Superscript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 7l8 10M5 17 13 7")
            addPathData("M21 11h-4L20.5 7c.552-.966 .216-2.198-.75-2.75C18.784 3.698 17.552 4.034 17 5")
        }
        return _superscript!!
    }

private var _superscript: ImageVector? = null
