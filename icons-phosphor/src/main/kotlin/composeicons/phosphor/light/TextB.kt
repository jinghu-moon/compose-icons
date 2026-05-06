package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextB: ImageVector
    get() {
        if (_textB != null) return _textB!!
        _textB = phosphorLightIcon(
            name = "TextB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174.69 116.41c13.674-11.271 18.803-29.911 12.821-46.59C181.528 53.14 165.72 42.01 148 42h-68c-3.314 0-6 2.686-6 6v152c0 3.314 2.686 6 6 6h80c22.531-.002 41.744-16.323 45.39-38.557 3.646-22.234-9.35-43.836-30.7-51.033ZM86 54h62c16.569 0 30 13.431 30 30 0 16.569-13.431 30-30 30h-62ZM160 194h-74v-68h74c18.778 0 34 15.222 34 34 0 18.778-15.222 34-34 34Z"),
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
        return _textB!!
    }

private var _textB: ImageVector? = null
