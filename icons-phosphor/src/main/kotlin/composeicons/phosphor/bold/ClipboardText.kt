package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorBoldIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 164c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12ZM160 112h-64c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h64c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM220 48v168c0 11.046-8.954 20-20 20h-144C44.954 236 36 227.046 36 216v-168C36 36.954 44.954 28 56 28h34.53C100.316 17.781 113.851 12.002 128 12.002c14.149 0 27.684 5.779 37.47 15.998h34.53c11.046 0 20 8.954 20 20ZM100.29 60h55.42C153.713 46.233 141.911 36.019 128 36.019c-13.911 0-25.713 10.213-27.71 23.981ZM196 52h-17.41c.934 3.932 1.407 7.959 1.41 12v8c0 6.627-5.373 12-12 12h-80C81.373 84 76 78.627 76 72v-8c.003-4.041 .476-8.068 1.41-12h-17.41v160h136Z"),
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
