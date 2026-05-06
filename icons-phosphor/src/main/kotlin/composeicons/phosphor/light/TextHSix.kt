package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TextHSix: ImageVector
    get() {
        if (_textHSix != null) return _textHSix!!
        _textHSix = phosphorLightIcon(
            name = "TextHSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 146c-1.876 .004-3.749 .161-5.6 .47l18.75-31.39c1.701-2.844 .774-6.529-2.07-8.23-2.844-1.701-6.529-.774-8.23 2.07l-32.25 54-.22 .41c-7.528 13.382-5.153 30.15 5.796 40.914 10.949 10.765 27.754 12.856 41.007 5.102 13.253-7.754 19.664-23.428 15.644-38.247C240.807 156.28 227.355 145.994 212 146ZM212 202c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22 12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM150 56v120c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-54h-92v54c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-120c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v54h92v-54c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6Z"),
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
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
