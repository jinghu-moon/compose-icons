package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ConeOff: ImageVector
    get() {
        if (_coneOff != null) return _coneOff!!
        _coneOff = tablerOutlineIcon(
            name = "ConeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.396 16.384 12.87 2.507C12.692 2.194 12.36 2 12 2c-.36 0-.692 .194-.87 .507L9.504 5.505M8.097 8.099 3 17.497v.5C3 19.657 7.03 21 12 21c3.202 0 6.014-.558 7.609-1.398")
            addPathData("M3 3 21 21")
        }
        return _coneOff!!
    }

private var _coneOff: ImageVector? = null
