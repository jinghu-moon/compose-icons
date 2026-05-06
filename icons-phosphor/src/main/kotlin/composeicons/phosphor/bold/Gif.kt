package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorBoldIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 72v112c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-112c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM232 84c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-56c-6.627 0-12 5.373-12 12v112c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-44h36c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-36v-32ZM96 116h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v12c0 11.046-8.954 20-20 20C52.954 172 44 163.046 44 152v-48C44 92.954 52.954 84 64 84c9.42 0 18.18 6.45 20.38 15 1.657 6.418 8.202 10.277 14.62 8.62 6.418-1.657 10.277-8.202 8.62-14.62C102.7 73.88 84.35 60 64 60 39.711 60.028 20.028 79.711 20 104v48c0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44v-24c0-6.627-5.373-12-12-12Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
