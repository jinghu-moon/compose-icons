package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorFillIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M173.79 51.48C161.354 38.375 147.36 26.842 132.12 17.14c-2.535-1.523-5.705-1.523-8.24 0C108.64 26.842 94.646 38.375 82.21 51.48 54.59 80.48 40 112.47 40 144c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 112.47 201.41 80.48 173.79 51.48ZM96 184c0-27.67 22.53-47.28 32-54.3 9.48 7 32 26.63 32 54.3 0 17.673-14.327 32-32 32C110.327 216 96 201.673 96 184Z"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
