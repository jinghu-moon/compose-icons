package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ContrastOff: ImageVector
    get() {
        if (_contrastOff != null) return _contrastOff!!
        _contrastOff = tablerOutlineIcon(
            name = "ContrastOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v5c1.32 .002 2.586-.519 3.522-1.45M16.914 12.927c.276-1.463-.114-2.972-1.064-4.118C14.9 7.663 13.489 7 12 7v1")
            addPathData("M5.641 5.631C2.123 9.143 2.119 14.842 5.631 18.36c3.512 3.517 9.211 3.522 12.729 .009M20.04 16.051C21.79 12.584 21.119 8.386 18.376 5.638 15.633 2.889 11.436 2.21 7.966 3.953")
            addPathData("M3 3 21 21")
        }
        return _contrastOff!!
    }

private var _contrastOff: ImageVector? = null
