package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorThinIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 120C228 64.772 183.228 20 128 20 72.772 20 28 64.772 28 120c.003 1.119 .475 2.185 1.3 2.94 .094 .094 .194 .181 .3 .26L124 194v26h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-12v-26l94.4-70.8h0c1.007-.755 1.6-1.941 1.6-3.2ZM219.91 116h-47.91C171 67.38 152.13 40.86 140 28.79c44.243 5.879 77.911 42.623 79.91 87.21ZM128 28.89c6.666 5.265 12.411 11.601 17 18.75 8.36 12.69 18.27 34.71 19 68.36h-71.95c.73-33.65 10.64-55.67 19-68.36C115.621 40.493 121.349 34.157 128 28.89ZM161.2 124 128 183.76 94.8 124ZM85.65 124l29.74 53.54L44 124ZM170.35 124h41.65l-71.39 53.54ZM116 28.79C103.87 40.86 85 67.38 84 116h-47.91C38.089 71.413 71.757 34.669 116 28.79Z"),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
