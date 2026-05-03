package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorThinIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 128.000 L 236.000 184.000 C 236.000 186.209 234.209 188.000 232.000 188.000 L 128.000 188.000 C 125.791 188.000 124.000 186.209 124.000 184.000 L 124.000 76.000 L 28.000 76.000 L 28.000 128.000 C 28.000 130.209 26.209 132.000 24.000 132.000 C 21.791 132.000 20.000 130.209 20.000 128.000 L 20.000 72.000 C 20.000 69.791 21.791 68.000 24.000 68.000 L 128.000 68.000 C 130.209 68.000 132.000 69.791 132.000 72.000 L 132.000 180.000 L 228.000 180.000 L 228.000 128.000 C 228.000 125.791 229.791 124.000 232.000 124.000 C 234.209 124.000 236.000 125.791 236.000 128.000 Z"),
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
        return _waveSquare!!
    }

private var _waveSquare: ImageVector? = null
