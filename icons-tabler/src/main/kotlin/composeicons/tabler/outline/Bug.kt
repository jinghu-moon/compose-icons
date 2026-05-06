package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bug: ImageVector
    get() {
        if (_bug != null) return _bug!!
        _bug = tablerOutlineIcon(
            name = "Bug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9v-1C9 6.343 10.343 5 12 5c1.657 0 3 1.343 3 3v1")
            addPathData("M8 9h8c.596 .893 .941 1.929 1 3v3c0 2.761-2.239 5-5 5C9.239 20 7 17.761 7 15v-3C7.059 10.929 7.404 9.893 8 9")
            addPathData("M3 13h4")
            addPathData("M17 13h4")
            addPathData("M12 20v-6")
            addPathData("M4 19 7.35 17")
            addPathData("M20 19 16.65 17")
            addPathData("M4 7 7.75 9.4")
            addPathData("M20 7 16.25 9.4")
        }
        return _bug!!
    }

private var _bug: ImageVector? = null
