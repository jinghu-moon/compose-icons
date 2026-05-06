package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StarOff: ImageVector
    get() {
        if (_starOff != null) return _starOff!!
        _starOff = lucideOutlineIcon(
            name = "StarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.344 4.688 11.525 2.295c.089-.181 .273-.295 .475-.295 .202 0 .386 .114 .475 .295l2.31 4.679c.308 .625 .905 1.059 1.595 1.16l5.166 .756c.2 .029 .366 .169 .428 .361 .062 .192 .01 .403-.134 .543l-3.237 3.152")
            addPathData("M17.945 17.945l.43 2.505c.035 .2-.046 .402-.21 .521-.164 .119-.382 .134-.561 .039L12.986 18.582c-.618-.325-1.355-.325-1.973 0L6.396 21.01c-.179 .095-.396 .079-.56-.04-.164-.119-.245-.321-.21-.52l.881-5.139c.118-.689-.11-1.392-.611-1.879L2.16 9.795C2.014 9.654 1.962 9.443 2.024 9.25c.063-.193 .229-.333 .43-.361L7.619 8.134c.134-.03 .268-.063 .4-.099")
            addPathData("M2 2 22 22")
        }
        return _starOff!!
    }

private var _starOff: ImageVector? = null
