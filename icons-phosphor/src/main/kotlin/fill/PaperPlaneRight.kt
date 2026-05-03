package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorFillIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 127.890 C 240.015 133.695 236.884 139.053 231.820 141.890 L 63.900 237.900 C 61.490 239.266 58.770 239.989 56.000 240.000 C 50.822 239.972 45.977 237.440 42.998 233.204 C 40.019 228.968 39.275 223.553 41.000 218.670 L 68.000 138.720 C 68.541 137.118 70.030 136.030 71.720 136.000 L 144.000 136.000 C 146.217 136.005 148.336 135.090 149.853 133.473 C 151.369 131.856 152.147 129.682 152.000 127.470 C 151.624 123.203 148.023 119.947 143.740 120.000 L 71.740 120.000 C 70.024 120.000 68.499 118.906 67.950 117.280 L 40.950 37.340 C 38.750 31.067 40.658 24.086 45.744 19.804 C 50.830 15.523 58.033 14.832 63.840 18.070 L 231.840 113.960 C 236.875 116.790 239.994 122.114 240.000 127.890 Z"),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
