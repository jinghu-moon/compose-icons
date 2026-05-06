package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SubtitlesAi: ImageVector
    get() {
        if (_subtitlesAi != null) return _subtitlesAi!!
        _subtitlesAi = tablerOutlineIcon(
            name = "SubtitlesAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.5 19h-5.5C4.343 19 3 17.657 3 16v-8C3 6.343 4.343 5 6 5h12c1.657 0 3 1.343 3 3v4")
            addPathData("M7 15h5")
            addPathData("M17 12h-3")
            addPathData("M11 12h-1")
            addPathData("M19 22.5c.419-1.73 1.77-3.081 3.5-3.5C20.77 18.581 19.419 17.23 19 15.5c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
        }
        return _subtitlesAi!!
    }

private var _subtitlesAi: ImageVector? = null
