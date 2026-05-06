package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Park: ImageVector
    get() {
        if (_park != null) return _park!!
        _park = phosphorBoldIcon(
            name = "Park",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 188h-28v-16h20c3.695-.001 7.183-1.703 9.457-4.616 2.274-2.912 3.079-6.71 2.183-10.294l-32-128C202.302 23.751 197.504 20.007 192 20.007c-5.504 0-10.302 3.744-11.64 9.083l-32 128c-.896 3.585-.091 7.382 2.183 10.294 2.274 2.912 5.762 4.615 9.457 4.616h20v16h-64v-12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12v-12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-84c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12v12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12v12h-8c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h208c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM192 81.48 208.63 148h-33.26ZM56 140h36v12h-36ZM56 176h36v12h-36ZM116 100c17.673 0 32-14.327 32-32C148 50.327 133.673 36 116 36 98.327 36 84 50.327 84 68c0 17.673 14.327 32 32 32ZM116 60c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8Z"),
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
        return _park!!
    }

private var _park: ImageVector? = null
