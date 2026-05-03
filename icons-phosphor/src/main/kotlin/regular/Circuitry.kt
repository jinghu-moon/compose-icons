package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorRegularIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 88.000 160.000 C 92.418 160.000 96.000 163.582 96.000 168.000 C 96.000 172.418 92.418 176.000 88.000 176.000 C 83.582 176.000 80.000 172.418 80.000 168.000 C 80.000 163.582 83.582 160.000 88.000 160.000 ZM 48.000 48.000 L 80.000 48.000 L 80.000 145.380 C 68.980 149.276 62.369 160.545 64.346 172.066 C 66.322 183.586 76.311 192.007 88.000 192.007 C 99.689 192.007 109.678 183.586 111.654 172.066 C 113.631 160.545 107.020 149.276 96.000 145.380 L 96.000 115.310 L 144.000 163.310 L 144.000 208.000 L 48.000 208.000 ZM 208.000 208.000 L 160.000 208.000 L 160.000 160.000 C 160.002 157.878 159.160 155.842 157.660 154.340 L 96.000 92.690 L 96.000 48.000 L 128.000 48.000 L 128.000 72.000 C 127.998 74.122 128.840 76.158 130.340 77.660 L 146.340 93.660 C 144.791 96.886 143.991 100.421 144.000 104.000 C 144.000 117.255 154.745 128.000 168.000 128.000 C 181.255 128.000 192.000 117.255 192.000 104.000 C 192.000 90.745 181.255 80.000 168.000 80.000 C 164.420 79.994 160.885 80.797 157.660 82.350 L 144.000 68.690 L 144.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 168.000 96.000 C 172.418 96.000 176.000 99.582 176.000 104.000 C 176.000 108.418 172.418 112.000 168.000 112.000 C 163.582 112.000 160.000 108.418 160.000 104.000 C 160.000 99.582 163.582 96.000 168.000 96.000 Z"),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
