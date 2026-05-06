package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = tablerOutlineIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 14.6l3 5.19C19.283 18.183 20.998 15.214 21 12h-6c.001 1.072-.571 2.064-1.5 2.6")
            addPathData("M13.5 9.4l3-5.19c-2.785-1.608-6.215-1.608-9 0l3 5.19c.928-.536 2.072-.536 3 0")
            addPathData("M10.5 14.6l-3 5.19C4.717 18.183 3.002 15.214 3 12h6c-.001 1.072 .571 2.064 1.5 2.6")
        }
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
