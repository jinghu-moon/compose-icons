package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DirectionSign: ImageVector
    get() {
        if (_directionSign != null) return _directionSign!!
        _directionSign = tablerOutlineIcon(
            name = "DirectionSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.32 12.774l7.906 7.905c.427 .428 1.12 .428 1.548 0l7.905-7.905c.427-.428 .427-1.12 0-1.548L12.774 3.321c-.428-.427-1.12-.427-1.548 0L3.321 11.226c-.427 .428-.427 1.12 0 1.548")
            addPathData("M8 12h7.5")
            addPathData("M12 8.5 15.5 12 12 15.5")
        }
        return _directionSign!!
    }

private var _directionSign: ImageVector? = null
