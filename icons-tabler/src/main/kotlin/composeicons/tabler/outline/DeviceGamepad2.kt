package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceGamepad2: ImageVector
    get() {
        if (_deviceGamepad2 != null) return _deviceGamepad2!!
        _deviceGamepad2 = tablerOutlineIcon(
            name = "DeviceGamepad2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5h3.5c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5h-5.5L5.985 19.227c-.706 .743-1.817 .929-2.727 .458C2.349 19.213 1.861 18.197 2.062 17.192L3.696 9.019C4.164 6.682 6.216 4.999 8.6 5h3.4")
            addPathData("M14 15l4.07 4.284c.704 .741 1.812 .928 2.721 .46 .908-.468 1.399-1.48 1.204-2.483L20.395 9.029")
            addPathData("M8 9v2")
            addPathData("M7 10h2")
            addPathData("M14 10h2")
        }
        return _deviceGamepad2!!
    }

private var _deviceGamepad2: ImageVector? = null
