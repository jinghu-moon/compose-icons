package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BleachOff: ImageVector
    get() {
        if (_bleachOff != null) return _bleachOff!!
        _bleachOff = tablerOutlineIcon(
            name = "BleachOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 19h14M20.986 17.023c.003-.265-.047-.528-.146-.773L13.74 4C13.388 3.363 12.718 2.968 11.99 2.968c-.728 0-1.398 .395-1.75 1.032L9.425 5.405M7.937 7.973 3.14 16.25c-.244 .6-.182 1.28 .166 1.826 .348 .546 .938 .89 1.584 .924")
            addPathData("M3 3 21 21")
        }
        return _bleachOff!!
    }

private var _bleachOff: ImageVector? = null
