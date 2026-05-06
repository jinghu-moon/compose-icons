package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MusicOff: ImageVector
    get() {
        if (_musicOff != null) return _musicOff!!
        _musicOff = tablerOutlineIcon(
            name = "MusicOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 15.343 7.657 14 6 14 4.343 14 3 15.343 3 17")
            addPathData("M14.42 14.45c-1.054 .654-1.597 1.888-1.367 3.106 .23 1.218 1.186 2.169 2.405 2.394 1.219 .224 2.451-.324 3.1-1.381")
            addPathData("M9 17v-8M9 5v-1h10v11")
            addPathData("M12 8h7")
            addPathData("M3 3 21 21")
        }
        return _musicOff!!
    }

private var _musicOff: ImageVector? = null
