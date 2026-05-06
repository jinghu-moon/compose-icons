package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldBolt: ImageVector
    get() {
        if (_shieldBolt != null) return _shieldBolt!!
        _shieldBolt = tablerOutlineIcon(
            name = "ShieldBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.342 20.566c-.436 .17-.884 .315-1.342 .434C8.855 20.184 6.175 18.128 4.573 15.301 2.971 12.473 2.584 9.118 3.5 6 6.616 6.143 9.664 5.067 12 3c2.336 2.067 5.384 3.143 8.5 3 .607 2.065 .647 4.254 .117 6.34")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _shieldBolt!!
    }

private var _shieldBolt: ImageVector? = null
