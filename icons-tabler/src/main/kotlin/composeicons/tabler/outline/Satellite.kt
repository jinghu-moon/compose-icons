package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Satellite: ImageVector
    get() {
        if (_satellite != null) return _satellite!!
        _satellite = tablerOutlineIcon(
            name = "Satellite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.707 6.293 6.293 3.707c.39-.39 1.023-.39 1.414 0l5.586 5.586c.39 .391 .39 1.023 0 1.414l-2.586 2.586c-.391 .39-1.023 .39-1.414 0L3.707 7.707c-.39-.39-.39-1.023 0-1.414")
            addPathData("M6 10 3 13l3 3L9 13")
            addPathData("M10 6 13 3l3 3L13 9")
            addPathData("M12 12l1.5 1.5")
            addPathData("M14.5 17C15.881 17 17 15.881 17 14.5")
            addPathData("M15 21c3.314 0 6-2.686 6-6")
        }
        return _satellite!!
    }

private var _satellite: ImageVector? = null
