package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TestPipe: ImageVector
    get() {
        if (_testPipe != null) return _testPipe!!
        _testPipe = tablerOutlineIcon(
            name = "TestPipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 8.04 7.878 20.164c-1.116 1.116-2.925 1.116-4.04 0C2.722 19.049 2.721 17.24 3.837 16.124L15.959 4")
            addPathData("M7 13h8")
            addPathData("M19 15l1.5 1.6c.709 .804 .658 2.024-.116 2.766-.774 .742-1.995 .742-2.769 0-.774-.742-.825-1.962-.116-2.766L19 15")
            addPathData("M15 3l6 6")
        }
        return _testPipe!!
    }

private var _testPipe: ImageVector? = null
