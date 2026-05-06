package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VirusSearch: ImageVector
    get() {
        if (_virusSearch != null) return _virusSearch!!
        _virusSearch = tablerOutlineIcon(
            name = "VirusSearch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 12C17 9.239 14.761 7 12 7 9.239 7 7 9.239 7 12c0 2.761 2.239 5 5 5")
            addPathData("M12 7v-4")
            addPathData("M11 3h2")
            addPathData("M15.536 8.464 18.364 5.636")
            addPathData("M17.657 4.929l1.414 1.414")
            addPathData("M17 12h4")
            addPathData("M21 11v2")
            addPathData("M12 17v4")
            addPathData("M13 21h-2")
            addPathData("M8.465 15.536 5.636 18.364")
            addPathData("M6.343 19.071 4.93 17.657")
            addPathData("M7 12h-4")
            addPathData("M3 13v-2")
            addPathData("M8.464 8.464 5.636 5.636")
            addPathData("M4.929 6.343 6.343 4.93")
            addPathData("M15 17.5C15 18.881 16.119 20 17.5 20 18.881 20 20 18.881 20 17.5 20 16.119 18.881 15 17.5 15 16.119 15 15 16.119 15 17.5")
            addPathData("M19.5 19.5 22 22")
        }
        return _virusSearch!!
    }

private var _virusSearch: ImageVector? = null
