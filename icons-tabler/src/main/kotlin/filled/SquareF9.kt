package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF9: ImageVector
    get() {
        if (_squareF9 != null) return _squareF9!!
        _squareF9 = tablerFilledIcon(
            name = "SquareF9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 15.250 8.000 L 13.750 8.000 L 13.606 8.006 C 12.698 8.081 12.000 8.839 12.000 9.750 L 12.000 11.250 L 12.006 11.394 C 12.081 12.302 12.839 13.000 13.750 13.000 L 15.000 13.000 L 15.000 14.000 L 13.967 14.000 L 13.942 13.913 C 13.779 13.454 13.309 13.180 12.829 13.263 C 12.349 13.347 11.999 13.763 12.000 14.250 C 12.000 15.216 12.784 16.000 13.750 16.000 L 15.250 16.000 L 15.394 15.994 C 16.302 15.919 17.000 15.161 17.000 14.250 L 17.000 9.750 L 16.994 9.606 C 16.919 8.698 16.161 8.000 15.250 8.000 ZM 10.000 8.000 L 8.000 8.000 L 7.883 8.007 C 7.380 8.066 7.000 8.493 7.000 9.000 L 7.000 15.000 L 7.007 15.117 C 7.066 15.620 7.493 16.000 8.000 16.000 L 8.117 15.993 C 8.620 15.934 9.000 15.507 9.000 15.000 L 9.000 13.000 L 10.000 13.000 L 10.117 12.993 C 10.642 12.931 11.028 12.470 10.997 11.941 C 10.966 11.413 10.529 11.001 10.000 11.000 L 9.000 11.000 L 9.000 10.000 L 10.000 10.000 L 10.117 9.993 C 10.642 9.931 11.028 9.470 10.997 8.941 C 10.966 8.413 10.529 8.001 10.000 8.000 ZM 15.000 10.000 L 15.000 11.000 L 14.000 11.000 L 14.000 10.000 L 15.000 10.000 Z"),
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
        return _squareF9!!
    }

private var _squareF9: ImageVector? = null
