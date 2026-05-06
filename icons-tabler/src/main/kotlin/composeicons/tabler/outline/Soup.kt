package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Soup: ImageVector
    get() {
        if (_soup != null) return _soup!!
        _soup = tablerOutlineIcon(
            name = "Soup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11h16c.552 0 1 .448 1 1v.5C21 14 18.483 18.073 17 19v1c0 .552-.448 1-1 1h-8C7.448 21 7 20.552 7 20v-1C5.313 17.946 3 14 3 12.5v-.5c0-.552 .448-1 1-1")
            addPathData("M12 4c-.643 .461-1.017 1.209-1 2-.017 .791 .357 1.539 1 2")
            addPathData("M16 4c-.643 .461-1.017 1.209-1 2-.017 .791 .357 1.539 1 2")
            addPathData("M8 4C7.357 4.461 6.983 5.209 7 6c-.017 .791 .357 1.539 1 2")
        }
        return _soup!!
    }

private var _soup: ImageVector? = null
