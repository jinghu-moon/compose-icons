package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldPin: ImageVector
    get() {
        if (_worldPin != null) return _worldPin!!
        _worldPin = tablerOutlineIcon(
            name = "WorldPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.972 11.291C20.581 6.344 16.259 2.647 11.31 3.027 6.362 3.407 2.656 7.721 3.025 12.67c.369 4.949 4.675 8.665 9.625 8.307")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h8.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.689 2.704 2.582 5.83 2.578 9.018")
            addPathData("M21.121 20.121c.858-.858 1.115-2.148 .651-3.269C21.307 15.73 20.213 14.999 19 14.999c-1.213 0-2.307 .731-2.772 1.852-.464 1.121-.207 2.412 .651 3.269 .418 .419 1.125 1.045 2.121 1.879 1.051-.89 1.759-1.516 2.121-1.879")
            addPathData("M19 18v.01")
        }
        return _worldPin!!
    }

private var _worldPin: ImageVector? = null
