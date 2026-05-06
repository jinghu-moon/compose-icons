package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorFillIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM206.15 133.12l-40 48c-1.521 1.826-3.774 2.881-6.15 2.88h-.43c-2.52-.134-4.83-1.45-6.23-3.55l-58-87.09L62.15 133.12c-2.828 3.397-7.873 3.858-11.27 1.03-3.397-2.828-3.858-7.873-1.03-11.27l40-48c1.615-1.943 4.053-3.008 6.576-2.874 2.523 .134 4.834 1.452 6.234 3.554l58.05 87.09 33.14-39.77c2.828-3.397 7.873-3.858 11.27-1.03 3.397 2.828 3.858 7.873 1.03 11.27Z"),
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
