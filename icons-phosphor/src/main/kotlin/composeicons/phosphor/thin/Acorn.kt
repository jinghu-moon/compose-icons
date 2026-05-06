package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorThinIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 104C227.967 75.295 204.705 52.033 176 52h-44v-4c0-15.464 12.536-28 28-28 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-19.882 0-36 16.118-36 36v4h-44C51.295 52.033 28.033 75.295 28 104c.006 5.08 3.21 9.607 8 11.3v12.7c0 33.61 32.29 59.54 58.24 80.37C109.54 220.66 124 232.27 124 240c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-7.73 14.46-19.34 29.76-31.63C187.71 187.54 220 161.61 220 128v-12.7c4.79-1.693 7.994-6.22 8-11.3ZM156.75 202.13C144.24 212.18 133.52 220.78 128 228.92c-5.52-8.14-16.24-16.74-28.75-26.79C74.63 182.37 44 157.78 44 128v-12h168v12c0 29.78-30.63 54.37-55.25 74.13ZM216 108h-176c-2.209 0-4-1.791-4-4C36.028 79.711 55.711 60.028 80 60h96c24.289 .028 43.972 19.711 44 44 0 2.209-1.791 4-4 4Z"),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
