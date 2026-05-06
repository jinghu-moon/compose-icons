package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorLightIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.24 60.24 60.24 204.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L195.76 51.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333ZM66 112c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34h34c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-34v-34c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v34h-34c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h34ZM224 178h-80c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h80c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
