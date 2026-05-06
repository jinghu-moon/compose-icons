package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VersionsOff: ImageVector
    get() {
        if (_versionsOff != null) return _versionsOff!!
        _versionsOff = tablerOutlineIcon(
            name = "VersionsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.184 6.162C10.511 5.454 11.22 5 12 5h6c1.105 0 2 .895 2 2v9M18.815 18.827c-.256 .114-.534 .173-.815 .173h-6c-1.105 0-2-.895-2-2v-7")
            addPathData("M7 7v10")
            addPathData("M4 8v8")
            addPathData("M3 3 21 21")
        }
        return _versionsOff!!
    }

private var _versionsOff: ImageVector? = null
