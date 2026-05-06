package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VariableOff: ImageVector
    get() {
        if (_variableOff != null) return _variableOff!!
        _variableOff = tablerOutlineIcon(
            name = "VariableOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.675 4.68C2.505 9.456 2.613 14.272 5 20")
            addPathData("M19 4c1.959 3.917 2.383 7.834 1.272 12.232M19.289 19.283c-.093 .238-.189 .477-.289 .717")
            addPathData("M11.696 11.696c.095 .257 .2 .533 .32 .831C13 15 13 16 14 16h1")
            addPathData("M8 16c1.5 0 3-2 4-3.5M14.022 9.986C14.651 9.404 15.326 9 16 9")
            addPathData("M3 3 21 21")
        }
        return _variableOff!!
    }

private var _variableOff: ImageVector? = null
