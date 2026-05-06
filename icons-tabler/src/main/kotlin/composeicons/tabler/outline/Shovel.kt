package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = tablerOutlineIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 4l3 3")
            addPathData("M18.5 5.5l-8 8")
            addPathData("M8.276 11.284l4.44 4.44c.182 .182 .284 .428 .284 .685 0 .257-.102 .503-.284 .684l-2.704 2.704C8.405 21.386 5.816 21.379 4.219 19.78 2.621 18.182 2.614 15.594 4.203 13.987L6.907 11.284c.182-.182 .428-.284 .685-.284 .257 0 .503 .102 .685 .284h-.001")
        }
        return _shovel!!
    }

private var _shovel: ImageVector? = null
