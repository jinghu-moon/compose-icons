package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CoffeeOff: ImageVector
    get() {
        if (_coffeeOff != null) return _coffeeOff!!
        _coffeeOff = tablerOutlineIcon(
            name = "CoffeeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 14c.83 .642 2.077 1.017 3.5 1 1.423 .017 2.67-.358 3.5-1 .73-.565 1.783-.923 3-.99")
            addPathData("M8 3c-.194 .14-.364 .305-.506 .49")
            addPathData("M12 3c-.643 .461-1.017 1.209-1 2-.017 .791 .357 1.539 1 2")
            addPathData("M14 10h3v3M16.743 16.743C15.975 19.272 13.643 21.001 11 21h-2C5.686 21 3 18.314 3 15v-5h7")
            addPathData("M20.116 16.124c.993-.99 1.168-2.536 .421-3.723-.747-1.187-2.217-1.698-3.539-1.23")
            addPathData("M3 3 21 21")
        }
        return _coffeeOff!!
    }

private var _coffeeOff: ImageVector? = null
