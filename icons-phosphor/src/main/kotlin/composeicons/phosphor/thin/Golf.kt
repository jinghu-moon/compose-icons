package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Golf: ImageVector
    get() {
        if (_golf != null) return _golf!!
        _golf = phosphorThinIcon(
            name = "Golf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 100c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM132 124c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM212 96c0 46.392-37.608 84-84 84C81.608 180 44 142.392 44 96 44 49.608 81.608 12 128 12c46.371 .05 83.95 37.629 84 84ZM204 96C204 54.026 169.974 20 128 20 86.026 20 52 54.026 52 96c0 41.974 34.026 76 76 76 41.955-.044 75.956-34.045 76-76ZM166.57 196.26C153 201.47 140.34 204 128 204c-12.34 0-25-2.53-38.57-7.74-2.066-.79-4.38 .244-5.17 2.31-.79 2.066 .244 4.38 2.31 5.17 11.955 4.722 24.595 7.481 37.43 8.17v36.09c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-36.09c12.835-.689 25.475-3.448 37.43-8.17 2.066-.79 3.1-3.104 2.31-5.17-.79-2.066-3.104-3.1-5.17-2.31Z"),
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
        return _golf!!
    }

private var _golf: ImageVector? = null
