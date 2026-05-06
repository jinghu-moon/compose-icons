package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SubtitlesOff: ImageVector
    get() {
        if (_subtitlesOff != null) return _subtitlesOff!!
        _subtitlesOff = tablerOutlineIcon(
            name = "SubtitlesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h9c1.657 0 3 1.343 3 3v8c0 .296-.044 .591-.13 .874M18.864 18.874c-.28 .084-.571 .126-.864 .126h-12C4.343 19 3 17.657 3 16v-8C3 6.65 3.893 5.507 5.12 5.131")
            addPathData("M7 15h5")
            addPathData("M17 12h-1")
            addPathData("M12 12h-2")
            addPathData("M3 3 21 21")
        }
        return _subtitlesOff!!
    }

private var _subtitlesOff: ImageVector? = null
