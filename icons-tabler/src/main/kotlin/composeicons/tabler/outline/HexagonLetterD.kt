package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonLetterD: ImageVector
    get() {
        if (_hexagonLetterD != null) return _hexagonLetterD!!
        _hexagonLetterD = tablerOutlineIcon(
            name = "HexagonLetterD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.875 6.27c.7 .398 1.13 1.143 1.125 1.948v7.284c0 .809-.443 1.555-1.158 1.948l-6.75 4.27c-.68 .373-1.504 .373-2.184 0L4.158 17.45C3.445 17.061 3.002 16.314 3 15.502v-7.285C3 7.408 3.443 6.663 4.158 6.27L10.908 2.29c.7-.386 1.55-.386 2.25 0l6.75 3.98h-.033")
            addPathData("M10 8v8h2c1.105 0 2-.895 2-2v-4C14 8.895 13.105 8 12 8h-2")
        }
        return _hexagonLetterD!!
    }

private var _hexagonLetterD: ImageVector? = null
