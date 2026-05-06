package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IroningSteam: ImageVector
    get() {
        if (_ironingSteam != null) return _ironingSteam!!
        _ironingSteam = tablerOutlineIcon(
            name = "IroningSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 19v2")
            addPathData("M9 4h7.459c1.467 0 2.718 1.06 2.959 2.507l.577 3.464 .81 4.865c.048 .29-.033 .586-.223 .81-.19 .224-.468 .354-.762 .354h-16.82C3 12.134 6.134 9 10 9h9.8")
            addPathData("M8 19 7 21")
            addPathData("M16 19l1 2")
        }
        return _ironingSteam!!
    }

private var _ironingSteam: ImageVector? = null
