package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorRegularIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 128.000 L 240.000 184.000 C 240.000 188.418 236.418 192.000 232.000 192.000 L 128.000 192.000 C 123.582 192.000 120.000 188.418 120.000 184.000 L 120.000 80.000 L 32.000 80.000 L 32.000 128.000 C 32.000 132.418 28.418 136.000 24.000 136.000 C 19.582 136.000 16.000 132.418 16.000 128.000 L 16.000 72.000 C 16.000 67.582 19.582 64.000 24.000 64.000 L 128.000 64.000 C 132.418 64.000 136.000 67.582 136.000 72.000 L 136.000 176.000 L 224.000 176.000 L 224.000 128.000 C 224.000 123.582 227.582 120.000 232.000 120.000 C 236.418 120.000 240.000 123.582 240.000 128.000 Z"),
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
        return _waveSquare!!
    }

private var _waveSquare: ImageVector? = null
