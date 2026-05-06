package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorThinIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C92.87 20 44 86.52 44 152c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84C212 86.52 163.13 20 128 20ZM128 228C86.045 227.956 52.044 193.955 52 152 52 123.54 62 92.27 79.33 66.22 94.81 43 113.91 28 128 28c11.39 0 26.05 9.8 39.42 25.82L125 101.34c-.931 1.043-1.249 2.496-.841 3.833 .409 1.337 1.486 2.363 2.841 2.707l28.3 7.08-7.25 36.26c-.429 2.165 .976 4.268 3.14 4.7 .256 .056 .518 .083 .78 .08 1.907-.002 3.548-1.349 3.92-3.22l8-40c.416-2.091-.882-4.141-2.95-4.66l-25.58-6.4L172.44 60.2q2.16 2.91 4.23 6C194 92.27 204 123.54 204 152c-.044 41.955-34.045 75.956-76 76Z"),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
