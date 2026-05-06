package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorLightIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M142 72v112c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-112c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM232 66h-56c-3.314 0-6 2.686-6 6v112c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-50h42c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-42v-44h50c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM96 122h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v18c0 14.359-11.641 26-26 26C49.641 178 38 166.359 38 152v-48C38 89.641 49.641 78 64 78c12.07 0 23.33 8.38 26.19 19.5 .828 3.209 4.101 5.138 7.31 4.31 3.209-.828 5.138-4.101 4.31-7.31C97.56 78 81.66 66 64 66 43.013 66 26 83.013 26 104v48c0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38v-24c0-3.314-2.686-6-6-6Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
