package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorLightIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 90.48v-18.48C214 51.013 196.987 34 176 34h-96C59.013 34 42 51.013 42 72v18.48C23.559 93.423 9.99 109.33 9.99 128.005c0 18.675 13.569 34.582 32.01 37.525v34.47c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-34.47c18.37-3.01 31.856-18.885 31.856-37.5C245.856 109.415 232.37 93.54 214 90.53ZM80 46h96c14.359 0 26 11.641 26 26v18.48C183.576 93.447 170.023 109.338 170 128v2h-84v-2C85.977 109.338 72.424 93.447 54 90.48v-18.48C54 57.641 65.641 46 80 46ZM208.35 154h-.35c-3.314 0-6 2.686-6 6v40c0 1.105-.895 2-2 2h-144c-1.105 0-2-.895-2-2v-40h0c0-3.314-2.686-6-6-6h-.35C33.338 153.807 21.873 142.083 22.001 127.77c.128-14.313 11.801-25.831 26.114-25.767C62.429 102.066 73.999 113.686 74 128v40c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h84v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-40c.001-14.314 11.571-25.934 25.885-25.997 14.313-.063 25.986 11.454 26.114 25.767 .128 14.313-11.337 26.038-25.649 26.23Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
