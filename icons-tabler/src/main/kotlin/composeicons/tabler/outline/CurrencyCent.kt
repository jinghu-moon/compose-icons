package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyCent: ImageVector
    get() {
        if (_currencyCent != null) return _currencyCent!!
        _currencyCent = tablerOutlineIcon(
            name = "CurrencyCent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.007 7.54C14.908 6.547 13.48 5.998 11.999 6 8.688 6.004 6.007 8.689 6.007 12c0 3.314 2.682 6 5.992 6 1.478 .001 2.903-.546 4-1.536")
            addPathData("M12 20v-2")
            addPathData("M12 6v-2")
        }
        return _currencyCent!!
    }

private var _currencyCent: ImageVector? = null
