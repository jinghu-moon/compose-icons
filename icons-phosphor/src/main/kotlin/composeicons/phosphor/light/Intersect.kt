package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorLightIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172.91 83.09C166.341 43.893 131.35 15.904 91.668 18.102 51.985 20.301 20.301 51.985 18.102 91.668c-2.199 39.683 25.791 74.673 64.988 81.242 6.569 39.197 41.56 67.186 81.242 64.988 39.683-2.199 71.367-33.883 73.565-73.565C240.096 124.65 212.107 89.659 172.91 83.09ZM30 96C30.019 62.289 55.44 34.01 88.959 30.414 122.478 26.817 153.32 49.06 160.49 82h-.49c-43.058 .05-77.95 34.942-78 78 0 .17 0 .33 0 .49C51.675 153.869 30.042 127.039 30 96ZM94 160c-.011-9.489 2.036-18.868 6-27.49L123.49 156c-8.622 3.964-18.001 6.011-27.49 6-.65 0-1.3 0-2-.05 0-.65 0-1.3 0-1.95ZM134.23 149.75l-28-28c4.278-5.998 9.522-11.242 15.52-15.52l28 28c-4.278 5.998-9.522 11.242-15.52 15.52ZM162 96c.011 9.489-2.036 18.868-6 27.49L132.51 100c8.622-3.964 18.001-6.011 27.49-6 .65 0 1.3 0 1.95 0 .05 .7 .05 1.35 .05 2ZM160 226c-31.039-.042-57.869-21.675-64.49-52h.49c43.058-.05 77.95-34.942 78-78 0-.17 0-.33 0-.49 32.94 7.17 55.183 38.012 51.586 71.531C221.99 200.56 193.711 225.981 160 226Z"),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
