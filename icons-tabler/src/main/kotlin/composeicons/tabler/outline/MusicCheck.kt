package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MusicCheck: ImageVector
    get() {
        if (_musicCheck != null) return _musicCheck!!
        _musicCheck = tablerOutlineIcon(
            name = "MusicCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 15.343 7.657 14 6 14 4.343 14 3 15.343 3 17")
            addPathData("M9 17v-13h10v9.5")
            addPathData("M9 8h10")
            addPathData("M15 19l2 2 4-4")
        }
        return _musicCheck!!
    }

private var _musicCheck: ImageVector? = null
