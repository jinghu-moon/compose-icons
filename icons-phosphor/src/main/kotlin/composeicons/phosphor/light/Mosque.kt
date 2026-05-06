package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorLightIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 130c-3.478-.004-6.906 .822-10 2.41v-4.41C214 87.29 184.69 67.78 161.13 52.1 146.57 42.41 134 34 134 24c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 0 10-12.57 18.41-27.13 28.1C71.31 67.78 42 87.29 42 128v4.41c-6.819-3.48-14.957-3.165-21.487 .833C13.984 137.24 10.002 144.344 10 152v56c0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6v-32c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10v32c0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6v-32c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10v32c0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6v-56c0-12.15-9.85-22-22-22ZM101.52 62.09C111.89 55.19 121.9 48.53 128 40.52c6.1 8 16.11 14.67 26.48 21.57C175.41 76 199 91.71 201.73 122h-147.46C57 91.71 80.59 76 101.52 62.09ZM22 152c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10v50h-20ZM160 154c-12.15 0-22 9.85-22 22v26h-20v-26c0-12.15-9.85-22-22-22-12.15 0-22 9.85-22 22v26h-20v-68h148v68h-20v-26c0-12.15-9.85-22-22-22ZM234 202h-20v-50c0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _mosque!!
    }

private var _mosque: ImageVector? = null
