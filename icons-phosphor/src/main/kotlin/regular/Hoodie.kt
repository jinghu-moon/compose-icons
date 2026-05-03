package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Hoodie: ImageVector
    get() {
        if (_hoodie != null) return _hoodie!!
        _hoodie = phosphorRegularIcon(
            name = "Hoodie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.310 120.530 L 183.000 39.120 C 180.040 34.683 175.064 32.013 169.730 32.000 L 86.270 32.000 C 80.936 32.013 75.960 34.683 73.000 39.120 L 18.690 120.530 C 16.120 124.380 15.343 129.154 16.560 133.620 L 38.000 212.210 C 39.898 219.169 46.217 223.997 53.430 224.000 L 80.000 224.000 C 88.837 224.000 96.000 216.837 96.000 208.000 L 96.000 192.000 L 160.000 192.000 L 160.000 208.000 C 160.000 216.837 167.163 224.000 176.000 224.000 L 202.570 224.000 C 209.783 223.997 216.102 219.169 218.000 212.210 L 239.440 133.620 C 240.657 129.154 239.880 124.380 237.310 120.530 ZM 80.000 176.000 L 80.000 69.000 L 104.000 83.150 L 104.000 136.000 C 104.000 140.418 107.582 144.000 112.000 144.000 C 116.418 144.000 120.000 140.418 120.000 136.000 L 120.000 92.570 L 123.940 94.890 C 126.446 96.366 129.554 96.366 132.060 94.890 L 136.000 92.570 L 136.000 128.000 C 136.000 132.418 139.582 136.000 144.000 136.000 C 148.418 136.000 152.000 132.418 152.000 128.000 L 152.000 83.140 L 176.000 69.000 L 176.000 176.000 ZM 169.730 48.000 L 172.650 52.390 L 128.000 78.710 L 83.350 52.390 L 86.270 48.000 ZM 80.000 208.000 L 53.430 208.000 L 32.000 129.410 L 64.000 81.410 L 64.000 176.000 C 64.000 184.837 71.163 192.000 80.000 192.000 ZM 202.570 208.000 L 176.000 208.000 L 176.000 192.000 C 184.837 192.000 192.000 184.837 192.000 176.000 L 192.000 81.410 L 224.000 129.410 Z"),
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
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
