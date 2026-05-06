package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldPause: ImageVector
    get() {
        if (_worldPause != null) return _worldPause!!
        _worldPause = tablerOutlineIcon(
            name = "WorldPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.945 12.997C21.369 9.196 19.344 5.542 15.896 3.887 12.449 2.231 8.331 2.935 5.63 5.642 2.928 8.35 2.233 12.469 3.896 15.913c1.663 3.444 5.321 5.461 9.121 5.029")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h9.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.961 3.141 2.843 6.838 2.51 10.526")
            addPathData("M17 17v5")
            addPathData("M21 17v5")
        }
        return _worldPause!!
    }

private var _worldPause: ImageVector? = null
