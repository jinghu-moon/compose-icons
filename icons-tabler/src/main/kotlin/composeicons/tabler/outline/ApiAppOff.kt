package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ApiAppOff: ImageVector
    get() {
        if (_apiAppOff != null) return _apiAppOff!!
        _apiAppOff = tablerOutlineIcon(
            name = "ApiAppOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15h-6.5C4.119 15 3 13.881 3 12.5 3 11.119 4.119 10 5.5 10h.5")
            addPathData("M15 15v3.5C15 19.881 13.881 21 12.5 21 11.119 21 10 19.881 10 18.5v-.5")
            addPathData("M13 9h5.5C19.881 9 21 10.119 21 11.5 21 12.881 19.881 14 18.5 14h-.5")
            addPathData("M9 12v-3M9.042 5.043C9.278 3.773 10.443 2.891 11.729 3.01c1.287 .119 2.271 1.198 2.271 2.49v.5")
            addPathData("M3 3 21 21")
        }
        return _apiAppOff!!
    }

private var _apiAppOff: ImageVector? = null
