package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraCog: ImageVector
    get() {
        if (_cameraCog != null) return _cameraCog!!
        _cameraCog = tablerOutlineIcon(
            name = "CameraCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 20h-7C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h1C7.105 7 8 6.105 8 5 8 4.448 8.448 4 9 4h6c.552 0 1 .448 1 1 0 1.105 .895 2 2 2h1c1.105 0 2 .895 2 2v3")
            addPathData("M14.973 13.406c.169-1.239-.448-2.453-1.548-3.047-1.101-.594-2.454-.442-3.396 .38-.942 .822-1.276 2.142-.837 3.313C9.63 15.224 10.75 16 12 16")
            addPathData("M17.001 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19.001 15.5v1.5")
            addPathData("M19.001 21v1.5")
            addPathData("M22.032 17.25 20.733 18")
            addPathData("M17.27 20l-1.3 .75")
            addPathData("M15.97 17.25 17.27 18")
            addPathData("M20.733 20l1.3 .75")
        }
        return _cameraCog!!
    }

private var _cameraCog: ImageVector? = null
