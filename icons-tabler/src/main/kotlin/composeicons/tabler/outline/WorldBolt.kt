package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldBolt: ImageVector
    get() {
        if (_worldBolt != null) return _worldBolt!!
        _worldBolt = tablerOutlineIcon(
            name = "WorldBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.985 12.52C21.206 8.704 18.992 5.165 15.465 3.694 11.937 2.222 7.865 3.139 5.309 5.981 2.753 8.823 2.27 12.969 4.106 16.322c1.835 3.353 5.588 5.18 9.359 4.558")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h10.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c2.313 3.706 3.07 7.856 2.27 12")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _worldBolt!!
    }

private var _worldBolt: ImageVector? = null
