package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Subtitles: ImageVector
    get() {
        if (_subtitles != null) return _subtitles!!
        _subtitles = tablerOutlineIcon(
            name = "Subtitles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 5c1.657 0 3 1.343 3 3v8c0 1.657-1.343 3-3 3h-12C4.343 19 3 17.657 3 16v-8C3 6.343 4.343 5 6 5h12")
            addPathData("M7 15h5")
            addPathData("M15 15h2")
            addPathData("M17 12h-3")
            addPathData("M11 12h-1")
        }
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
