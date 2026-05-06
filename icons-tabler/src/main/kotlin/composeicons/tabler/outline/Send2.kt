package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Send2: ImageVector
    get() {
        if (_send2 != null) return _send2!!
        _send2 = tablerOutlineIcon(
            name = "Send2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.698 4.034 21 12 4.698 19.966c-.19 .073-.406 .024-.546-.124-.144-.152-.19-.371-.12-.568L6.5 12 4.032 4.726c-.07-.197-.024-.416 .12-.568 .14-.148 .356-.197 .546-.124")
            addPathData("M6.5 12h14.5")
        }
        return _send2!!
    }

private var _send2: ImageVector? = null
