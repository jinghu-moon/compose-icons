package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PaperBag: ImageVector
    get() {
        if (_paperBag != null) return _paperBag!!
        _paperBag = tablerOutlineIcon(
            name = "PaperBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3h8c1.105 0 2 .895 2 2v1.82c0 .776 .181 1.542 .528 2.236l.944 1.888c.347 .694 .528 1.46 .528 2.236v5.82c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-5.82c0-.776 .181-1.542 .528-2.236L6 8v-3C6 3.895 6.895 3 8 3")
            addPathData("M12 15c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M6 21c1.105 0 2-.895 2-2v-5.82c-0-.776-.181-1.542-.528-2.236L6 8")
            addPathData("M11 7h2")
        }
        return _paperBag!!
    }

private var _paperBag: ImageVector? = null
