package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = tablerOutlineIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v-9")
            addPathData("M12 12 3 9.5")
            addPathData("M12 12 21 9.5")
            addPathData("M12 12l6 8.5")
            addPathData("M12 12 6 20.5")
        }
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
