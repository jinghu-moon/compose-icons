package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HistoryOff: ImageVector
    get() {
        if (_historyOff != null) return _historyOff!!
        _historyOff = tablerOutlineIcon(
            name = "HistoryOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.05 11C3.255 8.962 4.152 7.055 5.59 5.597M7.904 3.9C11.38 2.12 15.608 2.785 18.369 5.547c2.762 2.761 3.427 6.989 1.648 10.465M18.322 18.324c-2.181 2.15-5.306 3.043-8.293 2.37C7.041 20.022 4.6 17.877 3.55 15M3.05 20v-5h5")
            addPathData("M3 3 21 21")
        }
        return _historyOff!!
    }

private var _historyOff: ImageVector? = null
