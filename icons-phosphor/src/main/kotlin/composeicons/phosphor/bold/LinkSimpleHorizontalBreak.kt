package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkSimpleHorizontalBreak: ImageVector
    get() {
        if (_linkSimpleHorizontalBreak != null) return _linkSimpleHorizontalBreak!!
        _linkSimpleHorizontalBreak = phosphorBoldIcon(
            name = "LinkSimpleHorizontalBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28 128c0 19.882 16.118 36 36 36h40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-40C30.863 188 4 161.137 4 128 4 94.863 30.863 68 64 68h40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-40C44.118 92 28 108.118 28 128ZM192 68h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h40c33.137 0 60-26.863 60-60C252 94.863 225.137 68 192 68Z"),
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
        return _linkSimpleHorizontalBreak!!
    }

private var _linkSimpleHorizontalBreak: ImageVector? = null
