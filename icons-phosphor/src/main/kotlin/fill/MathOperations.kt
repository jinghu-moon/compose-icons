package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MathOperations: ImageVector
    get() {
        if (_mathOperations != null) return _mathOperations!!
        _mathOperations = phosphorFillIcon(
            name = "MathOperations",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 146.340 77.660 C 143.214 74.534 143.214 69.466 146.340 66.340 C 149.466 63.214 154.534 63.214 157.660 66.340 L 168.000 76.690 L 178.340 66.340 C 181.466 63.214 186.534 63.214 189.660 66.340 C 192.786 69.466 192.786 74.534 189.660 77.660 L 179.310 88.000 L 189.660 98.340 C 192.786 101.466 192.786 106.534 189.660 109.660 C 186.534 112.786 181.466 112.786 178.340 109.660 L 168.000 99.310 L 157.660 109.660 C 154.534 112.786 149.466 112.786 146.340 109.660 C 143.214 106.534 143.214 101.466 146.340 98.340 L 156.690 88.000 ZM 112.000 176.000 L 96.000 176.000 L 96.000 192.000 C 96.000 196.418 92.418 200.000 88.000 200.000 C 83.582 200.000 80.000 196.418 80.000 192.000 L 80.000 176.000 L 64.000 176.000 C 59.582 176.000 56.000 172.418 56.000 168.000 C 56.000 163.582 59.582 160.000 64.000 160.000 L 80.000 160.000 L 80.000 144.000 C 80.000 139.582 83.582 136.000 88.000 136.000 C 92.418 136.000 96.000 139.582 96.000 144.000 L 96.000 160.000 L 112.000 160.000 C 116.418 160.000 120.000 163.582 120.000 168.000 C 120.000 172.418 116.418 176.000 112.000 176.000 ZM 112.000 96.000 L 64.000 96.000 C 59.582 96.000 56.000 92.418 56.000 88.000 C 56.000 83.582 59.582 80.000 64.000 80.000 L 112.000 80.000 C 116.418 80.000 120.000 83.582 120.000 88.000 C 120.000 92.418 116.418 96.000 112.000 96.000 ZM 192.000 192.000 L 144.000 192.000 C 139.582 192.000 136.000 188.418 136.000 184.000 C 136.000 179.582 139.582 176.000 144.000 176.000 L 192.000 176.000 C 196.418 176.000 200.000 179.582 200.000 184.000 C 200.000 188.418 196.418 192.000 192.000 192.000 ZM 192.000 160.000 L 144.000 160.000 C 139.582 160.000 136.000 156.418 136.000 152.000 C 136.000 147.582 139.582 144.000 144.000 144.000 L 192.000 144.000 C 196.418 144.000 200.000 147.582 200.000 152.000 C 200.000 156.418 196.418 160.000 192.000 160.000 Z"),
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
        return _mathOperations!!
    }

private var _mathOperations: ImageVector? = null
