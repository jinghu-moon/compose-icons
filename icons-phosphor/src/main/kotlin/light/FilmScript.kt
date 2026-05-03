package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilmScript: ImageVector
    get() {
        if (_filmScript != null) return _filmScript!!
        _filmScript = phosphorLightIcon(
            name = "FilmScript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 40.000 C 214.000 32.268 207.732 26.000 200.000 26.000 ZM 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 200.000 38.000 C 201.105 38.000 202.000 38.895 202.000 40.000 ZM 94.000 80.000 C 94.000 85.523 89.523 90.000 84.000 90.000 C 78.477 90.000 74.000 85.523 74.000 80.000 C 74.000 74.477 78.477 70.000 84.000 70.000 C 89.523 70.000 94.000 74.477 94.000 80.000 ZM 94.000 176.000 C 94.000 181.523 89.523 186.000 84.000 186.000 C 78.477 186.000 74.000 181.523 74.000 176.000 C 74.000 170.477 78.477 166.000 84.000 166.000 C 89.523 166.000 94.000 170.477 94.000 176.000 ZM 94.000 128.000 C 94.000 133.523 89.523 138.000 84.000 138.000 C 78.477 138.000 74.000 133.523 74.000 128.000 C 74.000 122.477 78.477 118.000 84.000 118.000 C 89.523 118.000 94.000 122.477 94.000 128.000 Z"),
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
        return _filmScript!!
    }

private var _filmScript: ImageVector? = null
