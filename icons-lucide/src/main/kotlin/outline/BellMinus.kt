package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellMinus: ImageVector
    get() {
        if (_bellMinus != null) return _bellMinus!!
        _bellMinus = lucideOutlineIcon(
            name = "BellMinus",
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
        pathData = parseSvgPathData("M 15.000 8.000 L 21.000 8.000"),
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
        pathData = parseSvgPathData("M 16.243 3.757 C 14.527 2.041 11.946 1.527 9.704 2.456 C 7.462 3.385 6.000 5.573 6.000 8.000 C 6.000 12.499 4.589 13.956 3.262 15.326 C 2.995 15.619 2.926 16.041 3.086 16.403 C 3.245 16.766 3.604 17.000 4.000 17.000 L 20.000 17.000 C 20.396 17.000 20.755 16.767 20.915 16.405 C 21.075 16.042 21.006 15.620 20.740 15.327 C 19.823 14.376 19.117 13.242 18.667 12.000"),
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
        return _bellMinus!!
    }

private var _bellMinus: ImageVector? = null
