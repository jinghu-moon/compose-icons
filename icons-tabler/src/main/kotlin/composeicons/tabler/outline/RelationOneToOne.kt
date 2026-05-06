package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RelationOneToOne: ImageVector
    get() {
        if (_relationOneToOne != null) return _relationOneToOne!!
        _relationOneToOne = tablerOutlineIcon(
            name = "RelationOneToOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M8 10h1v4")
            addPathData("M15 10h1v4")
            addPathData("M12 10.5v.01")
            addPathData("M12 13.5v.01")
        }
        return _relationOneToOne!!
    }

private var _relationOneToOne: ImageVector? = null
