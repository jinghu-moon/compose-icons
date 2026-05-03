package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Swap: ImageVector
    get() {
        if (_swap != null) return _swap!!
        _swap = phosphorFillIcon(
            name = "Swap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 48.000 L 224.000 152.000 C 224.000 160.837 216.837 168.000 208.000 168.000 L 112.000 168.000 L 112.000 184.000 C 112.003 187.238 110.053 190.158 107.062 191.397 C 104.071 192.636 100.628 191.951 98.340 189.660 L 74.340 165.660 C 72.838 164.159 71.994 162.123 71.994 160.000 C 71.994 157.877 72.838 155.841 74.340 154.340 L 98.340 130.340 C 100.628 128.049 104.071 127.364 107.062 128.603 C 110.053 129.842 112.003 132.762 112.000 136.000 L 112.000 152.000 L 208.000 152.000 L 208.000 48.000 L 96.000 48.000 L 96.000 56.000 C 96.000 60.418 92.418 64.000 88.000 64.000 C 83.582 64.000 80.000 60.418 80.000 56.000 L 80.000 48.000 C 80.000 39.163 87.163 32.000 96.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 168.000 192.000 C 163.582 192.000 160.000 195.582 160.000 200.000 L 160.000 208.000 L 48.000 208.000 L 48.000 104.000 L 144.000 104.000 L 144.000 120.000 C 143.997 123.238 145.947 126.158 148.938 127.397 C 151.929 128.636 155.372 127.951 157.660 125.660 L 181.660 101.660 C 183.162 100.159 184.006 98.123 184.006 96.000 C 184.006 93.877 183.162 91.841 181.660 90.340 L 157.660 66.340 C 155.372 64.049 151.929 63.364 148.938 64.603 C 145.947 65.842 143.997 68.762 144.000 72.000 L 144.000 88.000 L 48.000 88.000 C 39.163 88.000 32.000 95.163 32.000 104.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 160.000 224.000 C 168.837 224.000 176.000 216.837 176.000 208.000 L 176.000 200.000 C 176.000 195.582 172.418 192.000 168.000 192.000 Z"),
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
        return _swap!!
    }

private var _swap: ImageVector? = null
