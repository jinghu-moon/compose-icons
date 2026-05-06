package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrencyGuarani: ImageVector
    get() {
        if (_currencyGuarani != null) return _currencyGuarani!!
        _currencyGuarani = tablerOutlineIcon(
            name = "CurrencyGuarani",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.007 7.54C14.908 6.547 13.48 5.998 11.999 6 8.688 6.004 6.007 8.689 6.007 12c0 3.314 2.682 6 5.992 6 1.478 .001 2.903-.546 4-1.536 .732-.66 1.064-2.148 1-4.464h-5")
            addPathData("M12 20v-16")
        }
        return _currencyGuarani!!
    }

private var _currencyGuarani: ImageVector? = null
