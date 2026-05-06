package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CrownOff: ImageVector
    get() {
        if (_crownOff != null) return _crownOff!!
        _crownOff = tablerOutlineIcon(
            name = "CrownOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 18h-13L3.135 8.673c-.02-.103 .026-.207 .115-.261 .089-.054 .203-.048 .285 .017L8 12 9.6 9.6M11.196 7.206 12 6l4 6L20.464 8.429c.082-.065 .196-.073 .286-.018 .09 .055 .136 .159 .115 .262l-1.363 6.818")
            addPathData("M3 3 21 21")
        }
        return _crownOff!!
    }

private var _crownOff: ImageVector? = null
