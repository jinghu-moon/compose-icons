package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorThinIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.58 214.21l-56-112c-.677-1.358-2.063-2.216-3.58-2.216-1.517 0-2.903 .858-3.58 2.216L157.55 148C137.264 147.431 117.735 140.175 102 127.36 120.21 109.552 130.912 85.45 131.91 60h28.09c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-60v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-60c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h91.91C122.898 83.495 112.908 105.705 96 122.05 85.779 112.174 77.985 100.064 73.23 86.67c-.439-1.394-1.604-2.437-3.037-2.721-1.433-.284-2.908 .236-3.845 1.357-.938 1.121-1.19 2.663-.658 4.024 5.087 14.358 13.4 27.358 24.3 38C73.624 140.705 53.136 148.007 32 148c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 23.398 .026 46.058-8.192 64-23.21 16.297 13.584 36.488 21.638 57.66 23l-29.22 58.43c-.989 1.977-.187 4.381 1.79 5.37 1.977 .989 4.381 .187 5.37-1.79L146.47 188h75.06l14.89 29.79c.678 1.355 2.064 2.211 3.58 2.21 .621-.003 1.233-.147 1.79-.42 .95-.474 1.672-1.307 2.008-2.314 .336-1.007 .257-2.107-.218-3.056ZM150.47 180 184 112.94 217.53 180Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
