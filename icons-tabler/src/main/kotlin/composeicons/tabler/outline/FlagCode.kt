package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlagCode: ImageVector
    get() {
        if (_flagCode != null) return _flagCode!!
        _flagCode = tablerOutlineIcon(
            name = "FlagCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.41 14.973C12.887 14.732 12.41 14.403 12 14 10.056 12.094 6.944 12.094 5 14v-9C6.944 3.094 10.056 3.094 12 5c1.944 1.906 5.056 1.906 7 0v8")
            addPathData("M5 21v-7")
            addPathData("M20 21l2-2L20 17")
            addPathData("M17 17l-2 2 2 2")
        }
        return _flagCode!!
    }

private var _flagCode: ImageVector? = null
