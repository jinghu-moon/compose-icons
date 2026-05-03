package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorFillIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 75.006 24.061 32.061 67.006 32.000 120.000 L 32.000 216.000 C 31.999 219.092 33.781 221.908 36.576 223.232 C 39.371 224.555 42.678 224.150 45.070 222.190 L 69.330 202.340 L 93.600 222.190 C 96.547 224.600 100.783 224.600 103.730 222.190 L 128.000 202.340 L 152.270 222.190 C 155.217 224.600 159.453 224.600 162.400 222.190 L 186.670 202.340 L 210.930 222.190 C 213.322 224.150 216.629 224.555 219.424 223.232 C 222.219 221.908 224.001 219.092 224.000 216.000 L 224.000 120.000 C 223.939 67.006 180.994 24.061 128.000 24.000 ZM 100.000 128.000 C 93.373 128.000 88.000 122.627 88.000 116.000 C 88.000 109.373 93.373 104.000 100.000 104.000 C 106.627 104.000 112.000 109.373 112.000 116.000 C 112.000 122.627 106.627 128.000 100.000 128.000 ZM 156.000 128.000 C 149.373 128.000 144.000 122.627 144.000 116.000 C 144.000 109.373 149.373 104.000 156.000 104.000 C 162.627 104.000 168.000 109.373 168.000 116.000 C 168.000 122.627 162.627 128.000 156.000 128.000 Z"),
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
