package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorLightIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 152c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6ZM160 114h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM214 48v168c0 7.732-6.268 14-14 14h-144c-7.732 0-14-6.268-14-14v-168C42 40.268 48.268 34 56 34h37.17C101.892 23.843 114.612 18 128 18c13.388 0 26.108 5.844 34.83 16h37.17c7.732 0 14 6.268 14 14ZM94 64v2h68v-2C162 45.222 146.778 30 128 30 109.222 30 94 45.222 94 64ZM202 48c0-1.105-.895-2-2-2h-29.67c2.427 5.69 3.676 11.814 3.67 18v8c0 3.314-2.686 6-6 6h-80c-3.314 0-6-2.686-6-6v-8c-.006-6.186 1.243-12.31 3.67-18h-29.67c-1.105 0-2 .895-2 2v168c0 1.105 .895 2 2 2h144c1.105 0 2-.895 2-2Z"),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
