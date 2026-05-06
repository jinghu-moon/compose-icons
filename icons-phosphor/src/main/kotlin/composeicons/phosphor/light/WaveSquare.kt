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
                pathData = parseSvgPathData("M238 128v56c0 3.314-2.686 6-6 6h-104c-3.314 0-6-2.686-6-6v-106h-92v50c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-56c0-3.314 2.686-6 6-6h104c3.314 0 6 2.686 6 6v106h92v-50c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
