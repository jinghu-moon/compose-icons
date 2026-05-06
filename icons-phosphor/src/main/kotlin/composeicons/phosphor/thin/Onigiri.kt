package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorThinIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.11 148.63 172.23 52.63l-.06-.09C162.682 37.268 145.979 27.981 128 27.981c-17.979 0-34.682 9.287-44.17 24.559l-.06 .09L27.89 148.63c-9.927 16.037-10.393 36.192-1.216 52.67 9.176 16.478 26.556 26.695 45.416 26.7h111.82c18.861-.005 36.24-10.222 45.416-26.7 9.176-16.478 8.711-36.633-1.216-52.67ZM164 220h-72v-52c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM222.36 197.39c-7.672 14.045-22.446 22.733-38.45 22.61h-11.91v-52c0-6.627-5.373-12-12-12h-64c-6.627 0-12 5.373-12 12v52h-11.91C56.123 219.994 41.413 211.339 33.653 197.384c-7.76-13.954-7.351-31.017 1.067-44.584 .01-.036 .027-.07 .05-.1L90.65 56.75C98.683 43.85 112.804 36.009 128 36.009c15.196 0 29.317 7.841 37.35 20.741l55.88 95.95c.023 .03 .04 .064 .05 .1 8.545 13.531 8.956 30.665 1.07 44.59Z"),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
