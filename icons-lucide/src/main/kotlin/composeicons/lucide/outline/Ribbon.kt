package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ribbon: ImageVector
    get() {
        if (_ribbon != null) return _ribbon!!
        _ribbon = lucideOutlineIcon(
            name = "Ribbon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 11.22C11 9.997 10 9 10 8c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1-.998 2.002-2.01 3.22")
            addPathData("M12 18l2.57-3.5")
            addPathData("M6.243 9.016C7.549 7.128 9.698 6 11.994 5.999c2.296-.002 4.447 1.122 5.756 3.008")
            addPathData("M9.35 14.53 12 11.22")
            addPathData("M9.35 14.53C7.728 12.246 6 10.221 6 7 6 4.239 8.686 2 12 2c3.314 0 6 2.239 6 5-.005 3.22-1.778 5.235-3.43 7.5l3.557 4.527c.168 .214 .242 .488 .204 .758-.038 .27-.185 .513-.407 .672l-1.894 1.36c-.443 .317-1.058 .222-1.384-.215L12 18 9.321 21.593c-.327 .44-.947 .535-1.39 .213L6.066 20.453c-.219-.159-.364-.4-.403-.668-.038-.268 .034-.54 .2-.754Z")
        }
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
