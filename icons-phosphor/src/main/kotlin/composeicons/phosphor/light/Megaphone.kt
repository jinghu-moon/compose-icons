package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorLightIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 120C245.972 94.606 225.394 74.028 200 74h-39.85C157.57 73.85 106.05 70.43 57 29.29 52.834 25.794 47.02 25.027 42.09 27.322 37.16 29.618 34.005 34.561 34 40v160c-.037 5.446 3.121 10.407 8.07 12.68 1.858 .864 3.881 1.314 5.93 1.32 3.296 .002 6.486-1.168 9-3.3 40-33.52 81.57-42 97-44.07v34c-.001 4.681 2.336 9.052 6.23 11.65l11 7.33c3.775 2.514 8.534 3.043 12.77 1.42 4.235-1.623 7.422-5.197 8.55-9.59l12.13-45.71C228.123 163.3 245.952 143.569 246 120ZM49.29 201.52c-.594 .501-1.424 .613-2.129 .287C46.456 201.481 46.003 200.777 46 200v-160c-.022-.779 .434-1.493 1.15-1.8 .266-.126 .556-.194 .85-.2 .464 .002 .912 .172 1.26 .48 44 36.92 89 45.19 104.71 47v69c-15.68 1.85-60.67 10.13-104.68 47.04ZM180.93 208.52c-.157 .631-.612 1.146-1.219 1.381-.607 .235-1.29 .16-1.831-.201l-11-7.33c-.558-.372-.892-.999-.89-1.67v-34.7h26.2ZM200 154h-34v-68h34c18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34Z"),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
