package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CommandOff: ImageVector
    get() {
        if (_commandOff != null) return _commandOff!!
        _commandOff = tablerOutlineIcon(
            name = "CommandOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9v8c0 1.105-.895 2-2 2C5.895 19 5 18.105 5 17c0-1.105 .895-2 2-2h8M18.411 18.417c-.573 .57-1.432 .74-2.178 .43C15.487 18.537 15 17.808 15 17v-2M15 11v-4c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-4M9 9h-2C6.192 9 5.463 8.513 5.153 7.767 4.843 7.021 5.013 6.162 5.583 5.589")
            addPathData("M3 3 21 21")
        }
        return _commandOff!!
    }

private var _commandOff: ImageVector? = null
