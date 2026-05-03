package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Sun: ImageVector
    get() {
        if (_sun != null) return _sun!!
        _sun = tablerFilledIcon(
            name = "Sun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 19.000 C 12.507 19.000 12.934 19.380 12.993 19.883 L 13.000 20.000 L 13.000 21.000 C 12.999 21.529 12.587 21.966 12.059 21.997 C 11.530 22.028 11.069 21.642 11.007 21.117 L 11.000 21.000 L 11.000 20.000 C 11.000 19.448 11.448 19.000 12.000 19.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 18.313 16.910 L 18.407 16.993 L 19.107 17.693 C 19.479 18.066 19.497 18.665 19.149 19.060 C 18.800 19.456 18.204 19.513 17.787 19.190 L 17.693 19.107 L 16.993 18.407 C 16.636 18.051 16.600 17.484 16.910 17.086 C 17.220 16.687 17.777 16.582 18.211 16.840 L 18.313 16.910 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 7.007 16.993 C 7.363 17.349 7.399 17.915 7.090 18.313 L 7.007 18.407 L 6.307 19.107 C 5.934 19.479 5.335 19.497 4.940 19.149 C 4.544 18.800 4.487 18.204 4.810 17.787 L 4.893 17.693 L 5.593 16.993 C 5.984 16.603 6.617 16.603 7.007 16.993 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 4.000 11.000 C 4.529 11.001 4.966 11.413 4.997 11.941 C 5.028 12.470 4.642 12.931 4.117 12.993 L 4.000 13.000 L 3.000 13.000 C 2.471 12.999 2.034 12.587 2.003 12.059 C 1.972 11.530 2.358 11.069 2.883 11.007 L 3.000 11.000 L 4.000 11.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 21.000 11.000 C 21.529 11.001 21.966 11.413 21.997 11.941 C 22.028 12.470 21.642 12.931 21.117 12.993 L 21.000 13.000 L 20.000 13.000 C 19.471 12.999 19.034 12.587 19.003 12.059 C 18.972 11.530 19.358 11.069 19.883 11.007 L 20.000 11.000 L 21.000 11.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 6.213 4.810 L 6.307 4.893 L 7.007 5.593 C 7.379 5.966 7.397 6.565 7.049 6.960 C 6.700 7.356 6.104 7.413 5.687 7.090 L 5.593 7.007 L 4.893 6.307 C 4.537 5.950 4.502 5.385 4.811 4.987 C 5.120 4.590 5.677 4.484 6.110 4.740 L 6.212 4.810 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 19.107 4.893 C 19.463 5.249 19.499 5.815 19.190 6.213 L 19.107 6.307 L 18.407 7.007 C 18.034 7.379 17.435 7.397 17.040 7.049 C 16.644 6.700 16.587 6.104 16.910 5.687 L 16.993 5.593 L 17.693 4.893 C 18.083 4.503 18.716 4.503 19.107 4.893 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 12.507 2.000 12.934 2.380 12.993 2.883 L 13.000 3.000 L 13.000 4.000 C 12.999 4.529 12.587 4.966 12.059 4.997 C 11.530 5.028 11.069 4.642 11.007 4.117 L 11.000 4.000 L 11.000 3.000 C 11.000 2.448 11.448 2.000 12.000 2.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 7.000 C 14.733 7.000 16.960 9.194 17.000 11.927 C 17.039 14.660 14.877 16.919 12.145 16.998 C 9.413 17.077 7.124 14.948 7.005 12.217 L 7.000 12.000 L 7.005 11.783 C 7.121 9.109 9.323 7.000 12.000 7.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _sun!!
    }

private var _sun: ImageVector? = null
