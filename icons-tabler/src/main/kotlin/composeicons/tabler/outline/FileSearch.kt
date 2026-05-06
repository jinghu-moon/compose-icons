package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FileSearch: ImageVector
    get() {
        if (_fileSearch != null) return _fileSearch!!
        _fileSearch = tablerOutlineIcon(
            name = "FileSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 3v4c0 .552 .448 1 1 1h4")
            addPathData("M12 21h-5C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h7l5 5v4.5")
            addPathData("M14 17.5C14 18.881 15.119 20 16.5 20 17.881 20 19 18.881 19 17.5 19 16.119 17.881 15 16.5 15 15.119 15 14 16.119 14 17.5")
            addPathData("M18.5 19.5 21 22")
        }
        return _fileSearch!!
    }

private var _fileSearch: ImageVector? = null
