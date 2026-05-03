package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorRegularIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.870 114.000 L 63.870 18.110 C 58.068 14.844 50.849 15.512 45.745 19.789 C 40.641 24.065 38.720 31.055 40.920 37.340 L 71.550 128.000 L 40.920 218.670 C 39.190 223.566 39.944 228.997 42.941 233.237 C 45.939 237.476 50.808 239.998 56.000 240.000 C 58.780 239.994 61.511 239.271 63.930 237.900 L 231.850 141.850 C 236.893 139.025 240.020 133.700 240.030 127.920 C 240.041 122.139 236.933 116.803 231.900 113.960 ZM 56.000 224.000 C 56.004 223.960 56.004 223.920 56.000 223.880 L 85.740 136.000 L 144.000 136.000 C 148.418 136.000 152.000 132.418 152.000 128.000 C 152.000 123.582 148.418 120.000 144.000 120.000 L 85.740 120.000 L 56.060 32.160 C 56.050 32.103 56.030 32.049 56.000 32.000 L 224.000 127.830 Z"),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
