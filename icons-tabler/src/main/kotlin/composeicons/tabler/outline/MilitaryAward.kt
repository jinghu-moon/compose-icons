package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MilitaryAward: ImageVector
    get() {
        if (_militaryAward != null) return _militaryAward!!
        _militaryAward = tablerOutlineIcon(
            name = "MilitaryAward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 10.791 14.209 9 12 9 9.791 9 8 10.791 8 13")
            addPathData("M8.5 10.5 7.5 8h-5.5l2.48 5.788c.315 .736 1.039 1.213 1.84 1.212h2.18")
            addPathData("M15.5 10.5 16.5 8h5.5l-2.48 5.788c-.315 .736-1.039 1.213-1.84 1.212h-2.18")
        }
        return _militaryAward!!
    }

private var _militaryAward: ImageVector? = null
