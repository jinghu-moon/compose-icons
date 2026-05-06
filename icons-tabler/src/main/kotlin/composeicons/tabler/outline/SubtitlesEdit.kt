package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SubtitlesEdit: ImageVector
    get() {
        if (_subtitlesEdit != null) return _subtitlesEdit!!
        _subtitlesEdit = tablerOutlineIcon(
            name = "SubtitlesEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 19h-5.5C4.343 19 3 17.657 3 16v-8C3 6.343 4.343 5 6 5h12c1.657 0 3 1.343 3 3v3")
            addPathData("M7 15h5")
            addPathData("M17 12h-3")
            addPathData("M11 12h-1")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _subtitlesEdit!!
    }

private var _subtitlesEdit: ImageVector? = null
