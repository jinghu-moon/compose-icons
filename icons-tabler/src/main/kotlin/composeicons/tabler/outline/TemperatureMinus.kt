package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemperatureMinus: ImageVector
    get() {
        if (_temperatureMinus != null) return _temperatureMinus!!
        _temperatureMinus = tablerOutlineIcon(
            name = "TemperatureMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13.5c-1.568 .905-2.332 2.751-1.864 4.499 .469 1.749 2.053 2.965 3.864 2.965 1.81 0 3.395-1.216 3.864-2.965C14.332 16.251 13.568 14.405 12 13.5v-8.5C12 3.895 11.105 3 10 3 8.895 3 8 3.895 8 5v8.5")
            addPathData("M8 9h4")
            addPathData("M16 9h6")
        }
        return _temperatureMinus!!
    }

private var _temperatureMinus: ImageVector? = null
