package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorLightIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 128.000 L 238.000 184.000 C 238.000 187.314 235.314 190.000 232.000 190.000 L 128.000 190.000 C 124.686 190.000 122.000 187.314 122.000 184.000 L 122.000 78.000 L 30.000 78.000 L 30.000 128.000 C 30.000 131.314 27.314 134.000 24.000 134.000 C 20.686 134.000 18.000 131.314 18.000 128.000 L 18.000 72.000 C 18.000 68.686 20.686 66.000 24.000 66.000 L 128.000 66.000 C 131.314 66.000 134.000 68.686 134.000 72.000 L 134.000 178.000 L 226.000 178.000 L 226.000 128.000 C 226.000 124.686 228.686 122.000 232.000 122.000 C 235.314 122.000 238.000 124.686 238.000 128.000 Z"),
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
