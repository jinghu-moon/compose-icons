package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudDataConnection: ImageVector
    get() {
        if (_cloudDataConnection != null) return _cloudDataConnection!!
        _cloudDataConnection = tablerOutlineIcon(
            name = "CloudDataConnection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 9.897C5 8.183 6.46 6.793 8.26 6.793 8.535 5.573 9.515 4.578 10.832 4.182c1.317-.397 2.77-.134 3.811 .69 1.042 .822 1.514 2.08 1.239 3.3h.693c1.336-.003 2.422 1.078 2.425 2.414-.003 1.336-1.089 2.417-2.425 2.414h-8.315C6.46 13 5 11.61 5 9.897")
            addPathData("M12 13v3")
            addPathData("M10 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M14 18h7")
            addPathData("M3 18h7")
        }
        return _cloudDataConnection!!
    }

private var _cloudDataConnection: ImageVector? = null
