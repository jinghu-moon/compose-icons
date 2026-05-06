package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) return _pushPinSimpleSlash!!
        _pushPinSimpleSlash = phosphorBoldIcon(
            name = "PushPinSimpleSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.88 207.93 56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L62 73.19 45.93 164h-5.93c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h76v52c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-52h26.33l32.79 36.07c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM70.3 164 82.37 95.64 144.51 164ZM90.06 40c0-6.627 5.373-12 12-12h89.94c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-1.7l15.33 86.84c.555 3.135-.158 6.362-1.983 8.971-1.825 2.609-4.612 4.386-7.747 4.939-.694 .119-1.396 .179-2.1 .18C187.979 152.92 183.004 148.734 182 143L165.93 52h-63.87c-6.627 0-12-5.373-12-12Z"),
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
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
