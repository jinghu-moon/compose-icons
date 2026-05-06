package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BugOff: ImageVector
    get() {
        if (_bugOff != null) return _bugOff!!
        _bugOff = tablerOutlineIcon(
            name = "BugOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.884 5.873c.859-.855 2.148-1.109 3.268-.643C14.271 5.695 15 6.788 15 8v1")
            addPathData("M13 9h3c.596 .893 .941 1.929 1 3v1M16.702 16.705c-.826 2.285-3.175 3.645-5.567 3.224C8.742 19.509 6.998 17.429 7 15v-3C7.059 10.929 7.404 9.893 8 9h1")
            addPathData("M3 13h4")
            addPathData("M17 13h4")
            addPathData("M12 20v-6")
            addPathData("M4 19 7.35 17")
            addPathData("M4 7 7.75 9.4")
            addPathData("M20 7 16.25 9.4")
            addPathData("M3 3 21 21")
        }
        return _bugOff!!
    }

private var _bugOff: ImageVector? = null
