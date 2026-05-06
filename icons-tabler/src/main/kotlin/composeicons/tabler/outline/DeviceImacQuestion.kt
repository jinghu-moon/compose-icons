package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceImacQuestion: ImageVector
    get() {
        if (_deviceImacQuestion != null) return _deviceImacQuestion!!
        _deviceImacQuestion = tablerOutlineIcon(
            name = "DeviceImacQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 17h-10C3.448 17 3 16.552 3 16v-12C3 3.448 3.448 3 4 3h16c.552 0 1 .448 1 1v7.5")
            addPathData("M3 13h11.5")
            addPathData("M8 21h7")
            addPathData("M10 17l-.5 4")
            addPathData("M14 17l.5 4")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _deviceImacQuestion!!
    }

private var _deviceImacQuestion: ImageVector? = null
