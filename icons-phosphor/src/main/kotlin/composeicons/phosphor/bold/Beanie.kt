package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Beanie: ImageVector
    get() {
        if (_beanie != null) return _beanie!!
        _beanie = phosphorBoldIcon(
            name = "Beanie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 160v-16C227.947 100.144 199.371 61.421 157.48 48.44c5.628-13.39 1.532-28.891-9.976-37.753-11.508-8.862-27.541-8.862-39.049 0C96.948 19.549 92.852 35.05 98.48 48.44 56.605 61.436 28.048 100.155 28 144v16c-5.036 3.777-8 9.705-8 16v32c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-32c0-6.295-2.964-12.223-8-16ZM120 36c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM128 68c41.955 .044 75.956 34.045 76 76v12h-152v-12c.044-41.955 34.045-75.956 76-76ZM116 180v24h-32v-24ZM140 180h32v24h-32ZM44 180h16v24h-16ZM212 204h-16v-24h16Z"),
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
        return _beanie!!
    }

private var _beanie: ImageVector? = null
