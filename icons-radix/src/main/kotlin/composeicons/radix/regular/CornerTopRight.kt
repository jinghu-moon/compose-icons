package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CornerTopRight: ImageVector
    get() {
        if (_cornerTopRight != null) return _cornerTopRight!!
        _cornerTopRight = radixIcon(
            name = "CornerTopRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.5 3C3.224 3 3 3.224 3 3.5 3 3.776 3.224 4 3.5 4h1.6c1.128 0 1.945 0 2.587 .053 .636 .052 1.057 .153 1.402 .329 .659 .336 1.194 .871 1.529 1.529 .176 .346 .277 .766 .329 1.402 .052 .642 .053 1.459 .053 2.587v1.6c0 .276 .224 .5 .5 .5 .276 0 .5-.224 .5-.5v-1.6C12 8.789 12 7.924 11.943 7.232c-.057-.698-.174-1.265-.434-1.775C11.078 4.61 10.39 3.922 9.543 3.49 9.033 3.23 8.465 3.114 7.768 3.057 7.076 3 6.211 3 5.1 3h-1.6Z"),
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
        return _cornerTopRight!!
    }

private var _cornerTopRight: ImageVector? = null
