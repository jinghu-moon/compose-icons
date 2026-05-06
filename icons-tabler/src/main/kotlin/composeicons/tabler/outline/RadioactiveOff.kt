package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RadioactiveOff: ImageVector
    get() {
        if (_radioactiveOff != null) return _radioactiveOff!!
        _radioactiveOff = tablerOutlineIcon(
            name = "RadioactiveOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.118 14.127c-.182 .181-.39 .341-.618 .473l3 5.19c.678-.392 1.302-.87 1.856-1.423M20.036 16.047C20.669 14.792 20.999 13.406 21 12h-5")
            addPathData("M13.5 9.4l3-5.19C13.878 2.696 10.67 2.602 7.964 3.96")
            addPathData("M10.5 14.6l-3 5.19C4.717 18.183 3.002 15.214 3 12h6c-.001 1.072 .571 2.064 1.5 2.6")
            addPathData("M3 3 21 21")
        }
        return _radioactiveOff!!
    }

private var _radioactiveOff: ImageVector? = null
