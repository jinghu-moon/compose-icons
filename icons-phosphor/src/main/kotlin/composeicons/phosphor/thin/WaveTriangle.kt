package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorThinIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.24 130.34l-52 72c-.752 1.039-1.957 1.654-3.24 1.654-1.283 0-2.488-.615-3.24-1.654L76 62.83 27.24 130.34c-.81 1.224-2.226 1.907-3.688 1.777-1.462-.129-2.736-1.05-3.319-2.397-.583-1.348-.38-2.906 .527-4.06L72.76 53.66c.752-1.039 1.957-1.654 3.24-1.654 1.283 0 2.488 .615 3.24 1.654L180 193.17l48.76-67.51c1.326-1.686 3.747-2.026 5.486-.77 1.739 1.256 2.178 3.661 .994 5.45Z"),
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
