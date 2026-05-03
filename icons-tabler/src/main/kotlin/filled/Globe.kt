package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Globe: ImageVector
    get() {
        if (_globe != null) return _globe!!
        _globe = tablerFilledIcon(
            name = "Globe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 4.000 C 13.733 4.000 15.960 6.194 16.000 8.927 C 16.039 11.660 13.877 13.919 11.145 13.998 C 8.413 14.077 6.124 11.948 6.005 9.217 L 6.000 9.000 L 6.005 8.783 C 6.121 6.109 8.323 4.000 11.000 4.000 Z"),
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
                pathData = parseSvgPathData("M 14.133 1.502 C 14.408 1.023 15.019 0.858 15.498 1.133 C 18.471 2.842 20.218 6.090 20.003 9.513 C 19.789 12.935 17.651 15.940 14.487 17.265 C 11.324 18.589 7.683 18.004 5.094 15.755 C 4.677 15.393 4.633 14.761 4.995 14.344 C 5.357 13.927 5.989 13.883 6.406 14.245 C 8.421 15.995 11.254 16.450 13.715 15.420 C 16.177 14.389 17.840 12.051 18.007 9.388 C 18.174 6.724 16.816 4.197 14.502 2.867 C 14.023 2.592 13.858 1.981 14.133 1.502 Z"),
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
                pathData = parseSvgPathData("M 11.000 16.000 C 11.507 16.000 11.934 16.380 11.993 16.883 L 12.000 17.000 L 12.000 21.000 C 11.999 21.529 11.587 21.966 11.059 21.997 C 10.530 22.028 10.069 21.642 10.007 21.117 L 10.000 21.000 L 10.000 17.000 C 10.000 16.448 10.448 16.000 11.000 16.000 Z"),
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
                pathData = parseSvgPathData("M 15.000 20.000 C 15.529 20.001 15.966 20.413 15.997 20.941 C 16.028 21.470 15.642 21.931 15.117 21.993 L 15.000 22.000 L 7.000 22.000 C 6.471 21.999 6.034 21.587 6.003 21.059 C 5.972 20.530 6.358 20.069 6.883 20.007 L 7.000 20.000 L 15.000 20.000 Z"),
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
        return _globe!!
    }

private var _globe: ImageVector? = null
