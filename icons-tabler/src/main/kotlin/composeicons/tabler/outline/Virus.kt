package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Virus: ImageVector
    get() {
        if (_virus != null) return _virus!!
        _virus = tablerOutlineIcon(
            name = "Virus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 9.239 14.761 7 12 7 9.239 7 7 9.239 7 12")
            addPathData("M12 7v-4")
            addPathData("M11 3h2")
            addPathData("M15.536 8.464 18.364 5.636")
            addPathData("M17.657 4.929l1.414 1.414")
            addPathData("M17 12h4")
            addPathData("M21 11v2")
            addPathData("M15.535 15.536l2.829 2.828")
            addPathData("M19.071 17.657l-1.414 1.414")
            addPathData("M12 17v4")
            addPathData("M13 21h-2")
            addPathData("M8.465 15.536 5.636 18.364")
            addPathData("M6.343 19.071 4.93 17.657")
            addPathData("M7 12h-4")
            addPathData("M3 13v-2")
            addPathData("M8.464 8.464 5.636 5.636")
            addPathData("M4.929 6.343 6.343 4.93")
        }
        return _virus!!
    }

private var _virus: ImageVector? = null
