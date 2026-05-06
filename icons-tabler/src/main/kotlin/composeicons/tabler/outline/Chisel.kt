package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Chisel: ImageVector
    get() {
        if (_chisel != null) return _chisel!!
        _chisel = tablerOutlineIcon(
            name = "Chisel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 14l1.5 1.5")
            addPathData("M18.347 15.575l2.08 2.079c.765 .766 .765 2.007-0 2.773-.766 .765-2.007 .765-2.773-0L15.574 18.347c-.765-.766-.765-2.007 0-2.773 .766-.765 2.007-.765 2.773 0")
            addPathData("M3 6 6 3l7.414 7.414c.375 .375 .586 .884 .586 1.414v2.172h-2.172c-.53-0-1.039-.211-1.414-.586L3 6")
        }
        return _chisel!!
    }

private var _chisel: ImageVector? = null
