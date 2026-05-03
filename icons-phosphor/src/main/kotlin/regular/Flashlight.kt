package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Flashlight: ImageVector
    get() {
        if (_flashlight != null) return _flashlight!!
        _flashlight = phosphorRegularIcon(
            name = "Flashlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 16.000 L 72.000 16.000 C 63.163 16.000 56.000 23.163 56.000 32.000 L 56.000 77.330 C 56.009 80.791 57.131 84.156 59.200 86.930 L 80.000 114.670 L 80.000 224.000 C 80.000 232.837 87.163 240.000 96.000 240.000 L 160.000 240.000 C 168.837 240.000 176.000 232.837 176.000 224.000 L 176.000 114.670 L 196.800 86.930 C 198.869 84.156 199.991 80.791 200.000 77.330 L 200.000 32.000 C 200.000 23.163 192.837 16.000 184.000 16.000 ZM 72.000 32.000 L 184.000 32.000 L 184.000 56.000 L 72.000 56.000 L 72.000 32.000 ZM 163.200 105.070 C 161.131 107.844 160.009 111.209 160.000 114.670 L 160.000 224.000 L 96.000 224.000 L 96.000 114.670 C 95.991 111.209 94.869 107.844 92.800 105.070 L 72.000 77.330 L 72.000 72.000 L 184.000 72.000 L 184.000 77.330 ZM 136.000 120.000 L 136.000 152.000 C 136.000 156.418 132.418 160.000 128.000 160.000 C 123.582 160.000 120.000 156.418 120.000 152.000 L 120.000 120.000 C 120.000 115.582 123.582 112.000 128.000 112.000 C 132.418 112.000 136.000 115.582 136.000 120.000 Z"),
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
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
