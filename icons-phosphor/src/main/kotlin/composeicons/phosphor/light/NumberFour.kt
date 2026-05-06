package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorLightIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 162h-18v-114c.003-2.551-1.607-4.825-4.014-5.67-2.407-.844-5.085-.074-6.676 1.92l-96 120c-1.442 1.802-1.724 4.271-.723 6.351 1 2.08 3.105 3.402 5.413 3.399h90v34c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM154 162h-77.52L154 65.1Z"),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
