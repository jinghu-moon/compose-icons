package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) return _trainSimple!!
        _trainSimple = phosphorLightIcon(
            name = "TrainSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 26h-112C55.431 26 42 39.431 42 56v128c0 16.569 13.431 30 30 30h12L67.2 236.4c-1.988 2.651-1.451 6.412 1.2 8.4 2.651 1.988 6.412 1.451 8.4-1.2L99 214h58l22.2 29.6c1.988 2.651 5.749 3.188 8.4 1.2 2.651-1.988 3.188-5.749 1.2-8.4L172 214h12c16.569 0 30-13.431 30-30v-128C214 39.431 200.569 26 184 26ZM72 38h112c9.941 0 18 8.059 18 18v66h-148v-66C54 46.059 62.059 38 72 38ZM184 202h-112c-9.941 0-18-8.059-18-18v-50h148v50c0 9.941-8.059 18-18 18ZM182 172c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM94 172c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null
