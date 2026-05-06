package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorLightIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 104c0 3.314-2.686 6-6 6h-96c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h96c3.314 0 6 2.686 6 6ZM176 130h-96c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h96c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM230 56v152c-.002 2.079-1.081 4.009-2.85 5.1-.945 .59-2.036 .902-3.15 .9-.93 .001-1.848-.215-2.68-.63L192 198.71l-29.32 14.66c-1.687 .842-3.673 .842-5.36 0L128 198.71 98.68 213.37c-1.687 .842-3.673 .842-5.36 0L64 198.71 34.68 213.37c-1.86 .929-4.069 .828-5.837-.266C27.075 212.01 25.999 210.079 26 208v-152C26 48.268 32.268 42 40 42h176c7.732 0 14 6.268 14 14ZM218 56c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v142.29L61.32 186.63c1.687-.842 3.673-.842 5.36 0L96 201.29l29.32-14.66c1.687-.842 3.673-.842 5.36 0L160 201.29l29.32-14.66c1.687-.842 3.673-.842 5.36 0L218 198.29Z"),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
