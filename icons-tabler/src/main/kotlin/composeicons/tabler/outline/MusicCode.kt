package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MusicCode: ImageVector
    get() {
        if (_musicCode != null) return _musicCode!!
        _musicCode = tablerOutlineIcon(
            name = "MusicCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 15.343 7.657 14 6 14 4.343 14 3 15.343 3 17")
            addPathData("M9 17v-13h10v9")
            addPathData("M9 8h10")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _musicCode!!
    }

private var _musicCode: ImageVector? = null
