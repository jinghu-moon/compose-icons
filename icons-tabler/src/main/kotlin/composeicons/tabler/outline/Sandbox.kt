package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sandbox: ImageVector
    get() {
        if (_sandbox != null) return _sandbox!!
        _sandbox = tablerOutlineIcon(
            name = "Sandbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.953 8.017 21 15v2c0 1.657-1.343 3-3 3h-12C4.343 20 3 18.657 3 17v-2L4.245 6.703C4.392 5.724 5.232 5 6.222 5h3.778")
            addPathData("M3 15h18")
            addPathData("M13 3l5.5 1.5")
            addPathData("M15.75 3.75l-2 7")
            addPathData("M7 10.5c1.667-.667 3.333-.667 5 0 1.667 .667 3.333 .667 5 0")
        }
        return _sandbox!!
    }

private var _sandbox: ImageVector? = null
