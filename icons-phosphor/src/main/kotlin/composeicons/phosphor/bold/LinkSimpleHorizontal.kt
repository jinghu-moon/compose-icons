package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimpleHorizontal: ImageVector
    get() {
        if (_linkSimpleHorizontal != null) return _linkSimpleHorizontal!!
        _linkSimpleHorizontal = phosphorBoldIcon(
            name = "LinkSimpleHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 116h96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM104 164h-40C44.118 164 28 147.882 28 128 28 108.118 44.118 92 64 92h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-40C30.863 68 4 94.863 4 128c0 33.137 26.863 60 60 60h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM192 68h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c33.137 0 60-26.863 60-60C252 94.863 225.137 68 192 68Z"),
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
        return _linkSimpleHorizontal!!
    }

private var _linkSimpleHorizontal: ImageVector? = null
