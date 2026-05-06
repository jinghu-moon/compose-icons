package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = tablerOutlineIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M7 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 9.239 14.761 7 12 7 9.239 7 7 9.239 7 12")
            addPathData("M12 3v4")
            addPathData("M12 17v4")
            addPathData("M3 12h4")
            addPathData("M17 12h4")
            addPathData("M18.364 5.636 15.536 8.464")
            addPathData("M8.464 15.536 5.636 18.364")
            addPathData("M5.636 5.636 8.464 8.464")
            addPathData("M15.536 15.536l2.828 2.828")
        }
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
