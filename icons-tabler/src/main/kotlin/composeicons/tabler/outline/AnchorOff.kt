package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AnchorOff: ImageVector
    get() {
        if (_anchorOff != null) return _anchorOff!!
        _anchorOff = tablerOutlineIcon(
            name = "AnchorOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v9")
            addPathData("M4 13c0 3.366 2.107 6.371 5.271 7.519 3.164 1.148 6.708 .193 8.867-2.389M19.578 15.57c.28-.828 .423-1.696 .422-2.57")
            addPathData("M21 13h-2")
            addPathData("M5 13h-2")
            addPathData("M12.866 8.873c1.37-.414 2.257-1.738 2.118-3.162C14.846 4.287 13.721 3.158 12.297 3.016 10.873 2.874 9.546 3.757 9.129 5.126")
            addPathData("M3 3 21 21")
        }
        return _anchorOff!!
    }

private var _anchorOff: ImageVector? = null
