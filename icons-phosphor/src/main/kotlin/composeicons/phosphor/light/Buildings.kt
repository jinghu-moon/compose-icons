package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorLightIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 210h-18v-114c0-7.732-6.268-14-14-14h-66v-50c-.002-5.163-2.846-9.906-7.399-12.34-4.553-2.434-10.076-2.165-14.371 .7L40.23 73.69C36.336 76.288 33.999 80.659 34 85.34v124.66h-18c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM208 94c1.105 0 2 .895 2 2v114h-68v-116ZM46 85.34c.001-.667 .335-1.29 .89-1.66l80-53.34c.613-.409 1.402-.448 2.052-.101 .65 .347 1.057 1.024 1.058 1.761v178h-84ZM110 112v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM78 112v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM78 168v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM110 168v16c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
