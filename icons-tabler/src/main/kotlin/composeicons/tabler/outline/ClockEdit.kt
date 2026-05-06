package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockEdit: ImageVector
    get() {
        if (_clockEdit != null) return _clockEdit!!
        _clockEdit = tablerOutlineIcon(
            name = "ClockEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 7.156 17.165 3.181 12.324 3.006 7.483 2.832 3.372 6.521 3.023 11.352c-.349 4.832 3.189 9.073 8.005 9.596 .32 .034 .644 .052 .972 .052")
            addPathData("M12 7v5l2 2")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _clockEdit!!
    }

private var _clockEdit: ImageVector? = null
