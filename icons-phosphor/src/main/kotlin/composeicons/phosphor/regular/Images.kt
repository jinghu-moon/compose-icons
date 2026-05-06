package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorRegularIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-144C63.163 40 56 47.163 56 56v16h-16C31.163 72 24 79.163 24 88v112c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-16h16c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM72 56h144v62.75L205.93 108.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688l-20 20-44-44c-6.248-6.243-16.372-6.243-22.62 0L72 109.37ZM184 200h-144v-112h16v80c0 8.837 7.163 16 16 16h112ZM216 168h-144v-36L108 96l49.66 49.66c3.124 3.122 8.186 3.122 11.31 0L194.63 120 216 141.38v26.62ZM160 84c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null
