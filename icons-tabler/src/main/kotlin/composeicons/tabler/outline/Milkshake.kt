package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Milkshake: ImageVector
    get() {
        if (_milkshake != null) return _milkshake!!
        _milkshake = tablerOutlineIcon(
            name = "Milkshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 10C17 7.239 14.761 5 12 5 9.239 5 7 7.239 7 10")
            addPathData("M6 11c0-.552 .448-1 1-1h10c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-10C6.448 13 6 12.552 6 12v-1")
            addPathData("M7 13l1.81 7.243c.111 .445 .511 .757 .97 .757h4.44c.459-0 .859-.312 .97-.757L17 13")
            addPathData("M12 5v-2")
        }
        return _milkshake!!
    }

private var _milkshake: ImageVector? = null
