package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorRegularIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 112.000 116.000 C 112.000 122.627 106.627 128.000 100.000 128.000 C 93.373 128.000 88.000 122.627 88.000 116.000 C 88.000 109.373 93.373 104.000 100.000 104.000 C 106.627 104.000 112.000 109.373 112.000 116.000 ZM 156.000 104.000 C 149.373 104.000 144.000 109.373 144.000 116.000 C 144.000 122.627 149.373 128.000 156.000 128.000 C 162.627 128.000 168.000 122.627 168.000 116.000 C 168.000 109.373 162.627 104.000 156.000 104.000 ZM 224.000 120.000 L 224.000 216.000 C 224.001 219.092 222.219 221.908 219.424 223.232 C 216.629 224.555 213.322 224.150 210.930 222.190 L 186.670 202.340 L 162.400 222.190 C 159.453 224.600 155.217 224.600 152.270 222.190 L 128.000 202.340 L 103.730 222.190 C 100.783 224.600 96.547 224.600 93.600 222.190 L 69.330 202.340 L 45.070 222.190 C 42.678 224.150 39.371 224.555 36.576 223.232 C 33.781 221.908 31.999 219.092 32.000 216.000 L 32.000 120.000 C 32.000 66.981 74.981 24.000 128.000 24.000 C 181.019 24.000 224.000 66.981 224.000 120.000 ZM 208.000 120.000 C 208.000 75.817 172.183 40.000 128.000 40.000 C 83.817 40.000 48.000 75.817 48.000 120.000 L 48.000 199.120 L 64.270 185.810 C 67.217 183.400 71.453 183.400 74.400 185.810 L 98.670 205.660 L 122.930 185.810 C 125.878 183.394 130.122 183.394 133.070 185.810 L 157.330 205.660 L 181.600 185.810 C 184.547 183.400 188.783 183.400 191.730 185.810 L 208.000 199.120 Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
