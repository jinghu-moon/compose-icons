package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorBoldIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 128.000 L 244.000 184.000 C 244.000 190.627 238.627 196.000 232.000 196.000 L 128.000 196.000 C 121.373 196.000 116.000 190.627 116.000 184.000 L 116.000 84.000 L 36.000 84.000 L 36.000 128.000 C 36.000 134.627 30.627 140.000 24.000 140.000 C 17.373 140.000 12.000 134.627 12.000 128.000 L 12.000 72.000 C 12.000 65.373 17.373 60.000 24.000 60.000 L 128.000 60.000 C 134.627 60.000 140.000 65.373 140.000 72.000 L 140.000 172.000 L 220.000 172.000 L 220.000 128.000 C 220.000 121.373 225.373 116.000 232.000 116.000 C 238.627 116.000 244.000 121.373 244.000 128.000 Z"),
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
