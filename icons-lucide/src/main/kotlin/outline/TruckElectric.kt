package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TruckElectric: ImageVector
    get() {
        if (_truckElectric != null) return _truckElectric!!
        _truckElectric = lucideOutlineIcon(
            name = "TruckElectric",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 19.000 L 14.000 7.000 C 14.000 5.895 13.105 5.000 12.000 5.000 L 9.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 19.000 L 9.000 19.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 19.000 19.000 L 21.000 19.000 C 21.552 19.000 22.000 18.552 22.000 18.000 L 22.000 14.350 C 21.999 14.124 21.921 13.906 21.780 13.730 L 18.300 9.380 C 18.111 9.141 17.824 9.001 17.520 9.000 L 14.000 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 2.000 13.000 L 2.000 18.000 C 2.000 18.552 2.448 19.000 3.000 19.000 L 5.000 19.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 4.000 3.000 L 2.150 5.150 C 1.997 5.290 1.948 5.510 2.026 5.702 C 2.104 5.894 2.293 6.017 2.500 6.010 L 4.650 6.010 C 4.875 5.957 5.105 6.076 5.192 6.290 C 5.280 6.505 5.198 6.750 5.000 6.870 L 3.000 9.020"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 19.000 19.000 C 19.000 20.105 18.105 21.000 17.000 21.000 C 15.895 21.000 15.000 20.105 15.000 19.000 C 15.000 17.895 15.895 17.000 17.000 17.000 C 18.105 17.000 19.000 17.895 19.000 19.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.000 19.000 C 9.000 20.105 8.105 21.000 7.000 21.000 C 5.895 21.000 5.000 20.105 5.000 19.000 C 5.000 17.895 5.895 17.000 7.000 17.000 C 8.105 17.000 9.000 17.895 9.000 19.000 Z"),
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
        return _truckElectric!!
    }

private var _truckElectric: ImageVector? = null
