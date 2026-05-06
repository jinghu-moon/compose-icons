package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PixLogo: ImageVector
    get() {
        if (_pixLogo != null) return _pixLogo!!
        _pixLogo = phosphorBoldIcon(
            name = "PixLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.16 113.89l-96-96c-7.803-7.768-20.417-7.768-28.22 0L17.94 113.94c-7.768 7.803-7.768 20.417 0 28.22l96.05 96c7.803 7.768 20.417 7.768 28.22 0l96-96c7.768-7.803 7.768-20.417 0-28.22ZM128 37.68 174.32 84h-14.32c-3.184-.003-6.238 1.26-8.49 3.51L128 111 104.49 87.51C102.238 85.26 99.184 83.997 96 84h-14.32ZM57.68 108h33.32l20 20L91 148h-33.32l-20-20ZM128 218.32 81.68 172h14.32c3.184 .003 6.238-1.26 8.49-3.51L128 145l23.51 23.52c2.257 2.239 5.311 3.49 8.49 3.48h14.32ZM198.32 148h-33.32L145 128l20-20h33.35l20 20Z"),
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
        return _pixLogo!!
    }

private var _pixLogo: ImageVector? = null
