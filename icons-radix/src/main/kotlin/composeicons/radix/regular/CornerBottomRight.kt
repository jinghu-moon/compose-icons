package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CornerBottomRight: ImageVector
    get() {
        if (_cornerBottomRight != null) return _cornerBottomRight!!
        _cornerBottomRight = radixIcon(
            name = "CornerBottomRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.5 12C3.224 12 3 11.776 3 11.5 3 11.224 3.224 11 3.5 11h1.6c1.128 0 1.945-0 2.587-.053 .636-.052 1.057-.153 1.402-.329 .659-.336 1.194-.871 1.529-1.529 .176-.346 .277-.766 .329-1.402C11 7.045 11 6.228 11 5.1v-1.6C11 3.224 11.224 3 11.5 3c.276 0 .5 .224 .5 .5v1.6c0 1.112-0 1.976-.057 2.668-.057 .698-.174 1.265-.434 1.775-.431 .847-1.12 1.535-1.967 1.967-.51 .26-1.077 .377-1.775 .434C7.076 12 6.211 12 5.1 12h-1.6Z"),
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
        return _cornerBottomRight!!
    }

private var _cornerBottomRight: ImageVector? = null
