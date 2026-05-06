package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PaperBagOff: ImageVector
    get() {
        if (_paperBagOff != null) return _paperBagOff!!
        _paperBagOff = tablerOutlineIcon(
            name = "PaperBagOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.158 3.185C7.414 3.066 7.7 3 8 3h8c1.105 0 2 .895 2 2v1.82c0 .776 .181 1.542 .528 2.236l.944 1.888c.347 .694 .528 1.46 .528 2.236v2.82M19.823 19.824C19.499 20.54 18.786 21 18 21h-12C4.895 21 4 20.105 4 19v-5.82c0-.776 .181-1.542 .528-2.236L6 8v-2")
            addPathData("M13.185 13.173c-.813 .364-1.288 1.221-1.164 2.103 .124 .882 .816 1.576 1.698 1.702 .882 .126 1.741-.346 2.107-1.159")
            addPathData("M6 21c1.105 0 2-.895 2-2v-5.82c-0-.776-.181-1.542-.528-2.236L6 8")
            addPathData("M11 7h2")
            addPathData("M3 3 21 21")
        }
        return _paperBagOff!!
    }

private var _paperBagOff: ImageVector? = null
