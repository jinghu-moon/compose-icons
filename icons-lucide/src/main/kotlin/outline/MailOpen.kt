package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MailOpen: ImageVector
    get() {
        if (_mailOpen != null) return _mailOpen!!
        _mailOpen = lucideOutlineIcon(
            name = "MailOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.200 8.400 C 21.700 8.780 22.000 9.370 22.000 10.000 L 22.000 20.000 C 22.000 21.105 21.105 22.000 20.000 22.000 L 4.000 22.000 C 2.895 22.000 2.000 21.105 2.000 20.000 L 2.000 10.000 C 2.000 9.370 2.296 8.778 2.800 8.400 L 10.800 2.400 C 11.511 1.867 12.489 1.867 13.200 2.400 L 21.200 8.400 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 22.000 10.000 L 13.030 15.700 C 12.400 16.095 11.600 16.095 10.970 15.700 L 2.000 10.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _mailOpen!!
    }

private var _mailOpen: ImageVector? = null
