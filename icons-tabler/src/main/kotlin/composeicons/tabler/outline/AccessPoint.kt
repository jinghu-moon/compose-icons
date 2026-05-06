package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AccessPoint: ImageVector
    get() {
        if (_accessPoint != null) return _accessPoint!!
        _accessPoint = tablerOutlineIcon(
            name = "AccessPoint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v.01")
            addPathData("M14.828 9.172c1.562 1.562 1.562 4.094 0 5.656")
            addPathData("M17.657 6.343c1.5 1.5 2.343 3.535 2.343 5.657 0 2.122-.843 4.157-2.343 5.657")
            addPathData("M9.168 14.828C7.606 13.266 7.606 10.734 9.168 9.172")
            addPathData("M6.337 17.657C4.837 16.157 3.994 14.122 3.994 12c0-2.122 .843-4.157 2.343-5.657")
        }
        return _accessPoint!!
    }

private var _accessPoint: ImageVector? = null
