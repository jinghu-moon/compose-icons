package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DirectionSignOff: ImageVector
    get() {
        if (_directionSignOff != null) return _directionSignOff!!
        _directionSignOff = tablerOutlineIcon(
            name = "DirectionSignOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.73 14.724l1.949-1.95c.427-.428 .427-1.12 0-1.548L12.774 3.321c-.428-.427-1.12-.427-1.548 0L9.276 5.271M7.266 7.281 3.321 11.226c-.427 .428-.427 1.12 0 1.548l7.905 7.905c.427 .428 1.12 .428 1.548 0l3.95-3.95")
            addPathData("M8 12h4")
            addPathData("M13.748 13.752 12 15.5")
            addPathData("M3 3 21 21")
        }
        return _directionSignOff!!
    }

private var _directionSignOff: ImageVector? = null
