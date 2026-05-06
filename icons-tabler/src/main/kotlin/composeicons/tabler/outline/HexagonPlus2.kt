package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonPlus2: ImageVector
    get() {
        if (_hexagonPlus2 != null) return _hexagonPlus2!!
        _hexagonPlus2 = tablerOutlineIcon(
            name = "HexagonPlus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.092 21.72c-.68 .373-1.504 .373-2.184 0L4.158 17.45C3.445 17.061 3.002 16.314 3 15.502v-7.285C3 7.408 3.443 6.663 4.158 6.27L10.908 2.29c.7-.386 1.55-.386 2.25 0l6.75 3.98h-.033c.7 .398 1.13 1.143 1.125 1.948v4.282")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _hexagonPlus2!!
    }

private var _hexagonPlus2: ImageVector? = null
