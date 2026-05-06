package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Switch3: ImageVector
    get() {
        if (_switch3 != null) return _switch3!!
        _switch3 = tablerOutlineIcon(
            name = "Switch3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17h2.397c1.632-0 3.16-.796 4.096-2.133l.177-.253M13.33 9.387l.177-.254C14.443 7.796 15.971 7 17.603 7h3.397")
            addPathData("M18 4l3 3-3 3")
            addPathData("M3 7h2.397c1.632 0 3.16 .796 4.096 2.133l4.014 5.734c.936 1.337 2.464 2.133 4.096 2.133h3.397")
            addPathData("M18 20l3-3L18 14")
        }
        return _switch3!!
    }

private var _switch3: ImageVector? = null
