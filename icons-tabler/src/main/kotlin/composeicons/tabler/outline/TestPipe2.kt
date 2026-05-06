package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TestPipe2: ImageVector
    get() {
        if (_testPipe2 != null) return _testPipe2!!
        _testPipe2 = tablerOutlineIcon(
            name = "TestPipe2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 3v15c0 1.657-1.343 3-3 3C10.343 21 9 19.657 9 18v-15")
            addPathData("M9 12h6")
            addPathData("M8 3h8")
        }
        return _testPipe2!!
    }

private var _testPipe2: ImageVector? = null
