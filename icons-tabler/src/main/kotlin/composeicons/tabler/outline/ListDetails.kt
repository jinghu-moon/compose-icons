package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ListDetails: ImageVector
    get() {
        if (_listDetails != null) return _listDetails!!
        _listDetails = tablerOutlineIcon(
            name = "ListDetails",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 5h8")
            addPathData("M13 9h5")
            addPathData("M13 15h8")
            addPathData("M13 19h5")
            addPathData("M3 5C3 4.448 3.448 4 4 4h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C3.448 10 3 9.552 3 9v-4")
            addPathData("M3 15c0-.552 .448-1 1-1h4c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C3.448 20 3 19.552 3 19v-4")
        }
        return _listDetails!!
    }

private var _listDetails: ImageVector? = null
