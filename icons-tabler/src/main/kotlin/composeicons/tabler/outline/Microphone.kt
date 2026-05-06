package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = tablerOutlineIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5C9 3.343 10.343 2 12 2c1.657 0 3 1.343 3 3v5c0 1.657-1.343 3-3 3C10.343 13 9 11.657 9 10v-5")
            addPathData("M5 10c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7")
            addPathData("M8 21h8")
            addPathData("M12 17v4")
        }
        return _microphone!!
    }

private var _microphone: ImageVector? = null
