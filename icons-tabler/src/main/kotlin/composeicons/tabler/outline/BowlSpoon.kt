package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BowlSpoon: ImageVector
    get() {
        if (_bowlSpoon != null) return _bowlSpoon!!
        _bowlSpoon = tablerOutlineIcon(
            name = "BowlSpoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11h16c.552 0 1 .448 1 1v.5C21 14 18.483 18.073 17 19v1c0 .552-.448 1-1 1h-8C7.448 21 7 20.552 7 20v-1C5.313 17.946 3 14 3 12.5v-.5c0-.552 .448-1 1-1")
            addPathData("M8 7c1.657 0 3-.895 3-2C11 3.895 9.657 3 8 3 6.343 3 5 3.895 5 5 5 6.105 6.343 7 8 7")
            addPathData("M11 5h9")
        }
        return _bowlSpoon!!
    }

private var _bowlSpoon: ImageVector? = null
