package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorRegularIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.48 132.68l-52 72c-1.503 2.094-3.922 3.336-6.5 3.336-2.578 0-4.997-1.242-6.5-3.336L76 69.66l-45.51 63c-2.585 3.59-7.59 4.405-11.18 1.82-3.59-2.585-4.405-7.59-1.82-11.18L69.49 51.3c1.503-2.094 3.922-3.336 6.5-3.336 2.578 0 4.997 1.242 6.5 3.336L180 186.3l45.51-63c2.585-3.59 7.59-4.405 11.18-1.82 3.59 2.585 4.405 7.59 1.82 11.18Z"),
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
