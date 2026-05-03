package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorFillIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 208.000 168.000 C 208.000 172.418 204.418 176.000 200.000 176.000 L 128.000 176.000 C 123.582 176.000 120.000 172.418 120.000 168.000 L 120.000 96.000 L 64.000 96.000 L 64.000 128.000 C 64.000 132.418 60.418 136.000 56.000 136.000 C 51.582 136.000 48.000 132.418 48.000 128.000 L 48.000 88.000 C 48.000 83.582 51.582 80.000 56.000 80.000 L 128.000 80.000 C 132.418 80.000 136.000 83.582 136.000 88.000 L 136.000 160.000 L 192.000 160.000 L 192.000 128.000 C 192.000 123.582 195.582 120.000 200.000 120.000 C 204.418 120.000 208.000 123.582 208.000 128.000 Z"),
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
