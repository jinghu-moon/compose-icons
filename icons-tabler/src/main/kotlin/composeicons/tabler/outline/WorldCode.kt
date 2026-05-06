package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldCode: ImageVector
    get() {
        if (_worldCode != null) return _worldCode!!
        _worldCode = tablerOutlineIcon(
            name = "WorldCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.942 13.02C21.36 9.359 19.503 5.812 16.256 4.07 13.009 2.327 9.028 2.74 6.207 5.111 3.387 7.483 2.298 11.335 3.458 14.833c1.16 3.498 4.335 5.935 8.014 6.151")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h9.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c2 3.206 2.837 6.913 2.508 10.537")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _worldCode!!
    }

private var _worldCode: ImageVector? = null
