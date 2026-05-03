package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellDot: ImageVector
    get() {
        if (_bellDot != null) return _bellDot!!
        _bellDot = lucideOutlineIcon(
            name = "BellDot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.268 21.000 C 10.625 21.619 11.286 22.000 12.000 22.000 C 12.714 22.000 13.375 21.619 13.732 21.000"),
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
        pathData = parseSvgPathData("M 11.680 2.009 C 8.495 2.179 6.000 4.811 6.000 8.000 C 6.000 12.499 4.589 13.956 3.262 15.326 C 2.995 15.619 2.926 16.041 3.086 16.403 C 3.245 16.766 3.604 17.000 4.000 17.000 L 20.000 17.000 C 20.396 17.000 20.755 16.767 20.915 16.405 C 21.075 16.042 21.006 15.620 20.740 15.327 C 19.916 14.477 19.062 13.596 18.530 11.979"),
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
        pathData = parseSvgPathData("M 21.000 5.000 C 21.000 6.657 19.657 8.000 18.000 8.000 C 16.343 8.000 15.000 6.657 15.000 5.000 C 15.000 3.343 16.343 2.000 18.000 2.000 C 19.657 2.000 21.000 3.343 21.000 5.000 Z"),
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
        return _bellDot!!
    }

private var _bellDot: ImageVector? = null
