package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF8: ImageVector
    get() {
        if (_squareF8 != null) return _squareF8!!
        _squareF8 = tablerFilledIcon(
            name = "SquareF8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 15.000 8.000 L 14.000 8.000 L 13.850 8.005 C 12.866 8.079 12.083 8.859 12.006 9.843 L 12.000 10.000 L 12.000 11.000 L 12.005 11.150 C 12.023 11.386 12.082 11.610 12.175 11.817 L 12.250 11.969 L 12.268 11.999 L 12.250 12.031 C 12.117 12.271 12.032 12.540 12.007 12.826 L 12.000 13.000 L 12.000 14.000 L 12.005 14.150 C 12.079 15.134 12.859 15.917 13.843 15.994 L 14.000 16.000 L 15.000 16.000 L 15.150 15.995 C 16.134 15.921 16.917 15.141 16.994 14.157 L 17.000 14.000 L 17.000 13.000 L 16.995 12.850 C 16.978 12.619 16.920 12.394 16.825 12.183 L 16.750 12.031 L 16.731 11.999 L 16.751 11.969 C 16.886 11.724 16.969 11.453 16.993 11.174 L 17.000 11.000 L 17.000 10.000 L 16.995 9.850 C 16.921 8.866 16.141 8.083 15.157 8.006 L 15.000 8.000 ZM 10.000 8.000 L 8.000 8.000 L 7.883 8.007 C 7.424 8.061 7.061 8.424 7.007 8.883 L 7.000 9.000 L 7.000 15.000 L 7.007 15.117 C 7.061 15.576 7.424 15.939 7.883 15.993 L 8.000 16.000 L 8.117 15.993 C 8.576 15.939 8.939 15.576 8.993 15.117 L 9.000 15.000 L 9.000 13.000 L 10.000 13.000 L 10.117 12.993 C 10.620 12.933 10.999 12.507 10.999 12.000 C 10.999 11.493 10.620 11.067 10.117 11.007 L 10.000 11.000 L 9.000 11.000 L 9.000 10.000 L 10.000 10.000 L 10.117 9.993 C 10.620 9.933 10.999 9.507 10.999 9.000 C 10.999 8.493 10.620 8.067 10.117 8.007 L 10.000 8.000 ZM 15.000 13.000 L 15.000 14.000 L 14.000 14.000 L 14.000 13.000 L 15.000 13.000 ZM 15.000 10.000 L 15.000 11.000 L 14.000 11.000 L 14.000 10.000 L 15.000 10.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _squareF8!!
    }

private var _squareF8: ImageVector? = null
