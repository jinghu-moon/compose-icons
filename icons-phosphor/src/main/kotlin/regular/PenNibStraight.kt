package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorRegularIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.330 123.890 C 222.270 123.760 222.210 123.630 222.140 123.510 L 192.000 69.900 L 192.000 32.000 C 192.000 23.163 184.837 16.000 176.000 16.000 L 80.000 16.000 C 71.163 16.000 64.000 23.163 64.000 32.000 L 64.000 69.920 L 33.860 123.510 C 33.790 123.630 33.730 123.760 33.660 123.890 C 30.998 129.249 31.561 135.649 35.120 140.460 L 35.230 140.600 L 121.670 252.880 C 123.185 254.844 125.525 255.995 128.005 255.995 C 130.485 255.995 132.825 254.844 134.340 252.880 L 220.770 140.600 L 220.880 140.460 C 224.440 135.648 225.000 129.247 222.330 123.890 ZM 176.000 32.000 L 176.000 64.000 L 80.000 64.000 L 80.000 32.000 ZM 128.000 144.000 C 121.373 144.000 116.000 138.627 116.000 132.000 C 116.000 125.373 121.373 120.000 128.000 120.000 C 134.627 120.000 140.000 125.373 140.000 132.000 C 140.000 138.627 134.627 144.000 128.000 144.000 ZM 136.000 224.500 L 136.000 158.830 C 149.323 154.858 157.714 141.712 155.707 127.955 C 153.700 114.198 141.903 103.997 128.000 103.997 C 114.097 103.997 102.300 114.198 100.293 127.955 C 98.286 141.712 106.677 154.858 120.000 158.830 L 120.000 224.490 L 48.000 131.000 L 76.690 80.000 L 179.320 80.000 L 208.000 131.000 Z"),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
