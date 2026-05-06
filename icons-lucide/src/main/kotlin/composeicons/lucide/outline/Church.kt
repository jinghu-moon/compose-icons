package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Church: ImageVector
    get() {
        if (_church != null) return _church!!
        _church = lucideOutlineIcon(
            name = "Church",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9h4")
            addPathData("M12 7v5")
            addPathData("M14 21v-3c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v3")
            addPathData("M18 9l3.52 2.147c.298 .181 .48 .505 .48 .854v6.999c0 1.105-.895 2-2 2h-16C2.895 21 2 20.105 2 19v-6.999c0-.349 .182-.673 .48-.854L6 9")
            addPathData("M6 21v-14c-0-.304 .138-.592 .376-.782L11.376 2.219c.365-.292 .884-.291 1.249 .001l5 4c.237 .19 .375 .477 .375 .78v14")
        }
        return _church!!
    }

private var _church: ImageVector? = null
