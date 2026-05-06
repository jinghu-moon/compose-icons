package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorBoldIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-112C58.445 36 28 66.445 28 104c0 37.555 30.445 68 68 68h36v36c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-148h16v148c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-148h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM132 148h-36C71.699 148 52 128.301 52 104 52 79.699 71.699 60 96 60h36Z"),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
