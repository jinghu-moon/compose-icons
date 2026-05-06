package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ikosaedr: ImageVector
    get() {
        if (_ikosaedr != null) return _ikosaedr!!
        _ikosaedr = tablerOutlineIcon(
            name = "Ikosaedr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 8.007v7.986c-0 .717-.384 1.379-1.006 1.735l-7 4.007c-.616 .353-1.372 .353-1.988 0L4.006 17.728C3.384 17.372 3 16.71 3 15.993v-7.986C3 7.29 3.384 6.628 4.006 6.272L11.006 2.265c.616-.353 1.372-.353 1.988 0l7 4.007c.622 .356 1.006 1.018 1.006 1.735")
            addPathData("M3.29 6.97 7.5 9")
            addPathData("M20.71 6.97 16.5 9")
            addPathData("M20.7 17h-17.4")
            addPathData("M11.76 2.03 7.5 9 3.2 16.84")
            addPathData("M12.24 2.03Q15.037 6.47 16.5 9q1.463 2.53 4.3 7.84")
            addPathData("M12 17 7.5 9h9L12 17")
            addPathData("M12 17v5")
        }
        return _ikosaedr!!
    }

private var _ikosaedr: ImageVector? = null
