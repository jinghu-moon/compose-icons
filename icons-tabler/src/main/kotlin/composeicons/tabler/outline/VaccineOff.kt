package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VaccineOff: ImageVector
    get() {
        if (_vaccineOff != null) return _vaccineOff!!
        _vaccineOff = tablerOutlineIcon(
            name = "VaccineOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3l4 4")
            addPathData("M19 5 14.5 9.5")
            addPathData("M11.5 6.5l6 6")
            addPathData("M16.5 11.5 16 12 14 14l-4 4h-4v-4l4-4M12 8l.5-.5")
            addPathData("M7.5 12.5 9 14")
            addPathData("M3 21 6 18")
            addPathData("M3 3 21 21")
        }
        return _vaccineOff!!
    }

private var _vaccineOff: ImageVector? = null
