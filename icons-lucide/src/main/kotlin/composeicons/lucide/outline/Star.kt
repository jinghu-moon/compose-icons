package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = lucideOutlineIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.525 2.295c.089-.181 .273-.295 .475-.295 .202 0 .386 .114 .475 .295l2.31 4.679c.309 .625 .905 1.059 1.595 1.16l5.166 .756c.2 .029 .366 .169 .428 .361 .062 .192 .01 .403-.134 .543l-3.736 3.638c-.5 .487-.729 1.19-.611 1.878l.882 5.14c.035 .2-.046 .402-.21 .521-.164 .119-.382 .134-.561 .039L12.986 18.582c-.618-.324-1.355-.324-1.973 0L6.396 21.01c-.179 .095-.396 .079-.56-.04-.164-.119-.245-.321-.21-.52l.881-5.139c.118-.689-.11-1.391-.611-1.879L2.16 9.795C2.014 9.654 1.962 9.443 2.024 9.25c.063-.193 .229-.333 .43-.361L7.619 8.134C8.31 8.034 8.907 7.6 9.216 6.974Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _star!!
    }

private var _star: ImageVector? = null
