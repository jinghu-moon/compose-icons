package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BellRing: ImageVector
    get() {
        if (_bellRing != null) return _bellRing!!
        _bellRing = lucideOutlineIcon(
            name = "BellRing",
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
        pathData = parseSvgPathData("M 22.000 8.000 C 22.000 5.700 21.200 3.700 20.000 2.000"),
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
        pathData = parseSvgPathData("M 3.262 15.326 C 2.995 15.619 2.926 16.041 3.086 16.403 C 3.245 16.766 3.604 17.000 4.000 17.000 L 20.000 17.000 C 20.396 17.000 20.755 16.767 20.915 16.405 C 21.075 16.042 21.006 15.620 20.740 15.327 C 19.410 13.956 18.000 12.499 18.000 8.000 C 18.000 4.686 15.314 2.000 12.000 2.000 C 8.686 2.000 6.000 4.686 6.000 8.000 C 6.000 12.499 4.589 13.956 3.262 15.326"),
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
        pathData = parseSvgPathData("M 4.000 2.000 C 2.800 3.700 2.000 5.700 2.000 8.000"),
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
        return _bellRing!!
    }

private var _bellRing: ImageVector? = null
