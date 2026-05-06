package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorThinIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171 50.37C158.861 36.349 145.2 23.722 130.27 12.72c-1.376-.961-3.204-.961-4.58 0C110.774 23.724 97.127 36.351 85 50.37 58.17 81.21 44 113.58 44 144c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84C212 113.58 197.83 81.21 171 50.37ZM204 144c-.013 4.02-.347 8.033-1 12h-71v-24h71.21c.521 3.979 .785 7.987 .79 12ZM190.14 92h-58.14v-24h43c5.682 7.581 10.745 15.607 15.14 24ZM132 164h69.31c-2.354 8.61-6.214 16.735-11.4 24h-57.91ZM132 124v-24h62c3.463 7.701 6.105 15.745 7.88 24ZM165.1 55.77q1.77 2 3.59 4.23h-36.69v-35.93c11.957 9.558 23.035 20.167 33.1 31.7ZM52 144C52 108.1 73.15 76.2 90.9 55.77 100.965 44.237 112.043 33.628 124 24.07v195.82C83.659 217.718 52.048 184.399 52 144ZM132 219.89v-23.89h51.35C169.964 210.3 151.561 218.862 132 219.89Z"),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
