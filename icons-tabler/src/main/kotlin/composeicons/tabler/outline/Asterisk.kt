package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = tablerOutlineIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12 20 7.5")
            addPathData("M12 12v9")
            addPathData("M12 12 4 7.5")
            addPathData("M12 12l8 4.5")
            addPathData("M12 3v9")
            addPathData("M12 12 4 16.5")
        }
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
