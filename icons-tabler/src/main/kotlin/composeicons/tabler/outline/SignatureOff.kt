package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SignatureOff: ImageVector
    get() {
        if (_signatureOff != null) return _signatureOff!!
        _signatureOff = tablerOutlineIcon(
            name = "SignatureOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17C6.333 13.667 8 11 8 9 8 8.606 7.983 8.265 7.95 7.967M6 6C5 6 3.968 7.085 4 9c.034 2.048 1.658 4.877 2.5 6C8 17 9 17.5 10 16l2-3c.333 2.667 1.333 4 3 4 .219 0 .708-.341 1.231-.742M20 16c.303 .245 .64 .677 1 1")
            addPathData("M3 3 21 21")
        }
        return _signatureOff!!
    }

private var _signatureOff: ImageVector? = null
