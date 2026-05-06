package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorThinIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.48 99.71l-75.06 30 52.74 67.8c.653 .839 .944 1.903 .811 2.957-.133 1.054-.681 2.012-1.521 2.663-.694 .56-1.558 .866-2.45 .87-1.235 .002-2.401-.567-3.16-1.54L128 134.52 75.16 202.46c-.759 .973-1.925 1.542-3.16 1.54-.887-.001-1.749-.296-2.45-.84-.841-.65-1.388-1.608-1.521-2.663-.133-1.054 .159-2.118 .811-2.957l52.74-67.8L46.52 99.74c-2.049-.828-3.038-3.161-2.21-5.21 .828-2.049 3.161-3.038 5.21-2.21L124 122.09v-82.09c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v82.09L206.51 92.29c2.049-.828 4.382 .161 5.21 2.21 .828 2.049-.161 4.382-2.21 5.21Z"),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
