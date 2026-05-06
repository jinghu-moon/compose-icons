package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = lucideOutlineIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 18.338c-.344-.001-.683 .083-.987 .244L6.396 21.01c-.179 .095-.396 .079-.56-.04-.164-.119-.245-.321-.21-.52l.881-5.139c.118-.689-.11-1.392-.611-1.879L2.16 9.795C2.014 9.654 1.962 9.443 2.024 9.25c.063-.193 .229-.333 .43-.361L7.619 8.134C8.31 8.034 8.907 7.6 9.216 6.974L11.525 2.295C11.614 2.114 11.798 2 12 2"),
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
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
