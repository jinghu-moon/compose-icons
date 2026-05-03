package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = lucideOutlineIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 16.000 L 4.000 13.620 C 4.000 11.500 2.970 10.500 3.000 8.000 C 3.030 5.280 4.490 2.000 7.500 2.000 C 9.370 2.000 10.000 3.800 10.000 5.500 C 10.000 8.610 8.000 11.160 8.000 14.180 L 8.000 16.000 C 8.000 17.105 7.105 18.000 6.000 18.000 C 4.895 18.000 4.000 17.105 4.000 16.000 Z"),
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
        pathData = parseSvgPathData("M 20.000 20.000 L 20.000 17.620 C 20.000 15.500 21.030 14.500 21.000 12.000 C 20.970 9.280 19.510 6.000 16.500 6.000 C 14.630 6.000 14.000 7.800 14.000 9.500 C 14.000 12.610 16.000 15.160 16.000 18.180 L 16.000 20.000 C 16.000 21.105 16.895 22.000 18.000 22.000 C 19.105 22.000 20.000 21.105 20.000 20.000 Z"),
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
        pathData = parseSvgPathData("M 16.000 17.000 L 20.000 17.000"),
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
        pathData = parseSvgPathData("M 4.000 13.000 L 8.000 13.000"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
