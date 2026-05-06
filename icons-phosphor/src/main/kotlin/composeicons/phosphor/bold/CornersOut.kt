package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorBoldIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 48v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28h-28c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12ZM88 196h-28v-28c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v40c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM208 156c-6.627 0-12 5.373-12 12v28h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12ZM88 36h-40C41.373 36 36 41.373 36 48v40c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h28c6.627 0 12-5.373 12-12C100 41.373 94.627 36 88 36Z"),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
