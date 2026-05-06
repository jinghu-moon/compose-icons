package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CpuOff: ImageVector
    get() {
        if (_cpuOff != null) return _cpuOff!!
        _cpuOff = tablerOutlineIcon(
            name = "CpuOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5h9c.552 0 1 .448 1 1v9M18.708 18.706c-.188 .188-.442 .294-.708 .294h-12C5.448 19 5 18.552 5 18v-12c0-.272 .108-.518 .284-.698")
            addPathData("M13 9h2v2M15 15h-6v-6")
            addPathData("M3 10h2")
            addPathData("M3 14h2")
            addPathData("M10 3v2")
            addPathData("M14 3v2")
            addPathData("M21 10h-2")
            addPathData("M21 14h-2")
            addPathData("M14 21v-2")
            addPathData("M10 21v-2")
            addPathData("M3 3 21 21")
        }
        return _cpuOff!!
    }

private var _cpuOff: ImageVector? = null
