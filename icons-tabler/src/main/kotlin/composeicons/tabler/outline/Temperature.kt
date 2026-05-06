package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Temperature: ImageVector
    get() {
        if (_temperature != null) return _temperature!!
        _temperature = tablerOutlineIcon(
            name = "Temperature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 13.5c-1.568 .905-2.332 2.751-1.864 4.499 .469 1.749 2.053 2.965 3.864 2.965 1.81 0 3.395-1.216 3.864-2.965C16.332 16.251 15.568 14.405 14 13.5v-8.5C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2v8.5")
            addPathData("M10 9h4")
        }
        return _temperature!!
    }

private var _temperature: ImageVector? = null
