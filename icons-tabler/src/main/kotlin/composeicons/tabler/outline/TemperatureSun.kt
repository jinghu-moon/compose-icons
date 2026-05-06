package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemperatureSun: ImageVector
    get() {
        if (_temperatureSun != null) return _temperatureSun!!
        _temperatureSun = tablerOutlineIcon(
            name = "TemperatureSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 13.5c-1.568 .905-2.332 2.751-1.864 4.499 .469 1.749 2.053 2.965 3.864 2.965 1.81 0 3.395-1.216 3.864-2.965C10.332 16.251 9.568 14.405 8 13.5v-8.5C8 3.895 7.105 3 6 3 4.895 3 4 3.895 4 5v8.5")
            addPathData("M4 9h4")
            addPathData("M13 16c2.209 0 4-1.791 4-4C17 9.791 15.209 8 13 8c-.337-0-.673 .041-1 .124")
            addPathData("M13 3v1")
            addPathData("M21 12h1")
            addPathData("M13 20v1")
            addPathData("M19.4 5.6l-.7 .7")
            addPathData("M18.7 17.7l.7 .7")
        }
        return _temperatureSun!!
    }

private var _temperatureSun: ImageVector? = null
