package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorBoldIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 88c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12v32c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-20h-20c-6.627 0-12-5.373-12-12ZM72 180h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-20v-20c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12ZM236 56v144c0 11.046-8.954 20-20 20h-176C28.954 220 20 211.046 20 200v-144C20 44.954 28.954 36 40 36h176c11.046 0 20 8.954 20 20ZM212 60h-168v136h168Z"),
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
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
