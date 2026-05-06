package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorLightIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.86 131.51l-52 72c-1.128 1.559-2.936 2.481-4.86 2.481-1.924 0-3.732-.923-4.86-2.481L76 66.25 28.86 131.51c-1.192 1.885-3.331 2.953-5.553 2.774-2.223-.179-4.163-1.576-5.037-3.628-.875-2.051-.539-4.418 .87-6.146l52-72C72.268 50.951 74.076 50.029 76 50.029c1.924 0 3.732 .923 4.86 2.481L180 189.75l47.14-65.26c2.006-2.459 5.58-2.93 8.155-1.076 2.575 1.855 3.261 5.394 1.565 8.076Z"),
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
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
