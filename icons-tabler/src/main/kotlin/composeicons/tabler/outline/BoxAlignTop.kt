package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoxAlignTop: ImageVector
    get() {
        if (_boxAlignTop != null) return _boxAlignTop!!
        _boxAlignTop = tablerOutlineIcon(
            name = "BoxAlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10.005h16v-5c0-.552-.448-1-1-1h-14c-.552 0-1 .448-1 1v5")
            addPathData("M4 15.005v-.01")
            addPathData("M4 20.005v-.01")
            addPathData("M9 20.005v-.01")
            addPathData("M15 20.005v-.01")
            addPathData("M20 20.005v-.01")
            addPathData("M20 15.005v-.01")
        }
        return _boxAlignTop!!
    }

private var _boxAlignTop: ImageVector? = null
