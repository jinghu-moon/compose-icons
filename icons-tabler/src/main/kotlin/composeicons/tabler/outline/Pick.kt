package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pick: ImageVector
    get() {
        if (_pick != null) return _pick!!
        _pick = tablerOutlineIcon(
            name = "Pick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 8 3.617 17.418c-.395 .393-.617 .927-.617 1.484 0 .557 .222 1.091 .617 1.483 .823 .819 2.153 .819 2.976 0L16 11")
            addPathData("M9 3h4.586c.265 0 .52 .105 .707 .293l6.414 6.414c.188 .187 .293 .442 .293 .707v4.586c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-3L12 7h-3C7.895 7 7 6.105 7 5 7 3.895 7.895 3 9 3")
        }
        return _pick!!
    }

private var _pick: ImageVector? = null
