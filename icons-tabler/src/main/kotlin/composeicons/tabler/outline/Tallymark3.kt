package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tallymark3: ImageVector
    get() {
        if (_tallymark3 != null) return _tallymark3!!
        _tallymark3 = tablerOutlineIcon(
            name = "Tallymark3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 5v14")
            addPathData("M12 5v14")
            addPathData("M16 5v14")
        }
        return _tallymark3!!
    }

private var _tallymark3: ImageVector? = null
