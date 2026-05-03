package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF5: ImageVector
    get() {
        if (_squareF5 != null) return _squareF5!!
        _squareF5 = tablerFilledIcon(
            name = "SquareF5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 16.000 8.000 L 13.000 8.000 L 12.883 8.007 C 12.465 8.056 12.122 8.361 12.026 8.771 L 12.006 8.883 L 12.000 9.000 L 12.000 12.000 L 12.007 12.117 C 12.056 12.535 12.361 12.878 12.771 12.974 L 12.883 12.994 L 13.000 13.000 L 15.000 13.000 L 15.000 14.000 L 13.967 14.000 L 13.942 13.913 L 13.893 13.800 C 13.685 13.386 13.219 13.170 12.769 13.277 C 12.318 13.384 12.000 13.787 12.000 14.250 C 12.000 15.117 12.630 15.837 13.458 15.976 L 13.606 15.994 L 13.750 16.000 L 15.000 16.000 L 15.157 15.994 C 16.080 15.921 16.832 15.225 16.976 14.311 L 16.995 14.149 L 17.000 14.000 L 17.000 13.000 L 16.994 12.843 C 16.921 11.920 16.225 11.168 15.311 11.024 L 15.149 11.005 L 15.000 11.000 L 14.000 11.000 L 14.000 10.000 L 16.000 10.000 L 16.117 9.993 C 16.535 9.944 16.878 9.639 16.974 9.229 L 16.994 9.117 L 17.000 9.000 L 16.993 8.883 C 16.944 8.465 16.639 8.122 16.229 8.026 L 16.117 8.006 L 16.000 8.000 ZM 10.000 8.000 L 8.000 8.000 L 7.883 8.007 C 7.424 8.061 7.061 8.424 7.007 8.883 L 7.000 9.000 L 7.000 15.000 L 7.007 15.117 C 7.061 15.576 7.424 15.939 7.883 15.993 L 8.000 16.000 L 8.117 15.993 C 8.576 15.939 8.939 15.576 8.993 15.117 L 9.000 15.000 L 9.000 13.000 L 10.000 13.000 L 10.117 12.993 C 10.620 12.933 10.999 12.507 10.999 12.000 C 10.999 11.493 10.620 11.067 10.117 11.007 L 10.000 11.000 L 9.000 11.000 L 9.000 10.000 L 10.000 10.000 L 10.117 9.993 C 10.620 9.933 10.999 9.507 10.999 9.000 C 10.999 8.493 10.620 8.067 10.117 8.007 L 10.000 8.000 Z"),
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
        return _squareF5!!
    }

private var _squareF5: ImageVector? = null
