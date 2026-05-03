package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = tablerFilledIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.712 13.297 L 16.110 16.739 C 17.297 17.947 17.297 19.882 16.110 21.090 C 15.028 22.192 13.293 22.308 12.074 21.360 L 11.999 21.298 L 11.926 21.360 C 11.447 21.733 10.868 21.953 10.262 21.994 L 10.059 22.001 C 9.243 22.001 8.461 21.673 7.889 21.091 C 6.701 19.882 6.702 17.944 7.891 16.737 L 11.288 13.297 C 11.476 13.106 11.732 12.999 12.000 12.999 C 12.268 12.999 12.524 13.106 12.712 13.297M 21.090 7.890 C 22.192 8.972 22.309 10.708 21.360 11.927 L 21.298 12.000 L 21.360 12.075 C 21.733 12.554 21.953 13.133 21.994 13.739 L 22.001 13.942 C 22.001 14.758 21.673 15.540 21.091 16.112 C 19.882 17.300 17.944 17.299 16.737 16.110 L 13.297 12.713 C 13.106 12.525 12.999 12.269 12.999 12.001 C 12.999 11.733 13.106 11.477 13.297 11.289 L 16.740 7.890 C 17.948 6.703 19.883 6.703 21.091 7.890M 7.264 7.892 L 10.704 11.289 C 10.895 11.477 11.002 11.733 11.002 12.001 C 11.002 12.269 10.895 12.525 10.704 12.713 L 7.260 16.110 C 6.052 17.297 4.117 17.297 2.909 16.110 C 1.807 15.028 1.691 13.293 2.639 12.074 L 2.701 11.999 L 2.639 11.926 C 2.266 11.447 2.046 10.868 2.005 10.262 L 1.998 10.059 C 1.998 9.243 2.326 8.461 2.908 7.889 C 4.117 6.701 6.055 6.702 7.262 7.891M 13.940 2.000 C 14.756 2.000 15.538 2.328 16.110 2.910 C 17.298 4.119 17.297 6.057 16.108 7.264 L 12.711 10.704 C 12.523 10.895 12.267 11.002 11.999 11.002 C 11.731 11.002 11.475 10.895 11.287 10.704 L 7.890 7.260 C 6.703 6.052 6.703 4.117 7.890 2.909 C 8.972 1.807 10.707 1.691 11.926 2.639 L 11.999 2.701 L 12.074 2.639 C 12.553 2.266 13.132 2.046 13.738 2.005 Z"),
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
        return _clover!!
    }

private var _clover: ImageVector? = null
