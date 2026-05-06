package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = tablerOutlineIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 4h-1C3.895 4 3 4.895 3 6v3.5C3 12.538 5.462 15 8.5 15 11.538 15 14 12.538 14 9.5v-3.5C14 4.895 13.105 4 12 4h-1")
            addPathData("M8 15c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-3")
            addPathData("M11 3v2")
            addPathData("M6 3v2")
            addPathData("M18 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C22 8.895 21.105 8 20 8c-1.105 0-2 .895-2 2")
        }
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
