package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorFillIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.92 210.62c1.963 2.109 2.641 5.11 1.774 7.858-.867 2.748-3.144 4.817-5.961 5.418-2.818 .601-5.741-.36-7.653-2.515L189.18 207.19C172.796 223.112 150.846 232.014 128 232 80 232 40.51 193.07 40 145.12 39.73 120.78 48.22 95.28 64.73 70.31L42.3 45.63c-3.006-3.22-2.945-8.235 .14-11.38 1.556-1.504 3.655-2.314 5.818-2.244 2.163 .07 4.206 1.013 5.662 2.614ZM203.85 175.76c.935 1.03 2.339 1.499 3.705 1.24 1.367-.259 2.501-1.21 2.995-2.51 3.612-9.759 5.457-20.084 5.45-30.49C216 112.6 201.49 79.32 174 47.75 161.648 33.484 147.745 20.639 132.55 9.45c-2.756-1.93-6.424-1.93-9.18 0C110.278 19.103 98.155 30.004 87.17 42c-1.404 1.53-1.404 3.88 0 5.41Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
