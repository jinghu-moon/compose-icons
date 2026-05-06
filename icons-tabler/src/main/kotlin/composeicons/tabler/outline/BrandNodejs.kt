package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNodejs: ImageVector
    get() {
        if (_brandNodejs != null) return _brandNodejs!!
        _brandNodejs = tablerOutlineIcon(
            name = "BrandNodejs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 9v8.044c-0 .714-.381 1.373-.998 1.731-.618 .357-1.379 .359-1.998 .003L4.436 17.878C3.544 17.333 3 16.363 3 15.317v-6.635C3 7.637 3.544 6.667 4.436 6.122l6-3.667c.96-.587 2.168-.587 3.128 0l6 3.667c.892 .545 1.436 1.515 1.436 2.561v6.634c-0 1.045-.544 2.015-1.436 2.56l-6 3.667c-.96 .587-2.168 .587-3.128 0")
            addPathData("M17 9h-3.5C12.672 9 12 9.672 12 10.5c0 .828 .672 1.5 1.5 1.5h2c.828 0 1.5 .672 1.5 1.5C17 14.328 16.328 15 15.5 15h-3.5")
        }
        return _brandNodejs!!
    }

private var _brandNodejs: ImageVector? = null
